package top.xujiayao.gifsigngen.tools;

import javafx.application.Platform;
import top.xujiayao.gifsigngen.ui.Dialogs;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * @author Xujiayao
 */
public class Update implements Runnable {

	private boolean isManualRequest = false;
	private String[] parsedData;

	private double progress;

	@Override
	public void run() {
		try {
			String data = downloadJSON();

			parsedData = ParseJSON.parseUpdateJSON(data);

			if (parsedData.length == 0) {
				throw new CustomException("检查更新失败");
			}

			Platform.runLater(() -> {
				if (ConfigManager.config.preferences.checkBetaUpdates) {
					checkBetaUpdates();
				} else {
					if (parsedData[0].equals(Variables.LATEST_RELEASE_VERSION)) {
						isLatest();
					} else {
						Dialogs.showUpdateDialog(parsedData[0], parsedData[2], parsedData[3], parsedData[4], parsedData[5]);
					}
				}
			});
		} catch (Exception e) {
			Platform.runLater(() -> Dialogs.showExceptionDialog(e));
		}
	}

	private void checkBetaUpdates() {
		if (Integer.parseInt(parsedData[1]) > Integer.parseInt(parsedData[7])) {
			if (parsedData[0].equals(Variables.VERSION)) {
				isLatest();
			} else {
				Dialogs.showUpdateDialog(parsedData[0], parsedData[2], parsedData[3], parsedData[4], parsedData[5]);
			}
		} else {
			if (parsedData[6].equals(Variables.VERSION)) {
				isLatest();
			} else {
				Dialogs.showUpdateDialog(parsedData[6], parsedData[8], parsedData[9], parsedData[10], parsedData[11]);
			}
		}
	}

	private void isLatest() {
		if (isManualRequest) {
			Dialogs.showMessageDialog("检查更新", "您正在使用最新版本的GIF签名图生成工具。");
		}
	}

	private String downloadJSON() throws IOException {
		String data = null;

		URLConnection conn = new URL(Variables.CHECK_UPDATE_LINK).openConnection();
		conn.setUseCaches(false);
		conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
			data = reader.readLine();
		} catch (Exception e) {
			Platform.runLater(() -> Dialogs.showExceptionDialog(e));
		}

		return data;
	}

	public byte[] downloadUpdate(String link, String size, String split) throws IOException {
		InputStream is = null;
		ByteArrayOutputStream os = null;

		progress = 0;

		try {
			os = new ByteArrayOutputStream();

			for (int i = 1; i <= Integer.parseInt(split); i++) {
				URLConnection conn = new URL(link + i).openConnection();

				is = conn.getInputStream();

				os.write(readInputStream(is, Integer.parseInt(size)));
			}

			Platform.runLater(() -> {
				Dialogs.bar.setProgress(1);
				Dialogs.text.setText("完成 (100%)");
			});

			return os.toByteArray();
		} catch (Exception e) {
			Platform.runLater(() -> Dialogs.showExceptionDialog(e));
		} finally {
			if (is != null) {
				is.close();
			}

			if (os != null) {
				os.close();
			}
		}

		return new byte[0];
	}

	private byte[] readInputStream(InputStream inputStream, int length) {
		try {
			byte[] buffer = new byte[1];
			int len;

			double temp1 = 0;

			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			while ((len = inputStream.read(buffer)) != -1) {
				bos.write(buffer, 0, len);

				progress = progress + (100.0 / length);

				double temp2 = Double.parseDouble(String.format("%.1f", progress));

				if (temp1 != temp2) {
					Platform.runLater(() -> {
						Dialogs.bar.setProgress(progress / 100);
						Dialogs.text.setText("下载中 (" + temp2 + "%)");
					});
				}

				temp1 = temp2;
			}

			bos.close();
			return bos.toByteArray();
		} catch (Exception e) {
			Platform.runLater(() -> Dialogs.showExceptionDialog(e));
		}

		return new byte[0];
	}

	public void setManualRequest(boolean manualRequest) {
		isManualRequest = manualRequest;
	}
}