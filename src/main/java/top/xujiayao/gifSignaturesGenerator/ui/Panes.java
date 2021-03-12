package top.xujiayao.gifSignaturesGenerator.ui;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import top.xujiayao.gifSignaturesGenerator.tools.Variables;

/**
 * @author Xujiayao
 */
public class Panes {

	public static int paneShowing;

	public static Pane pane1() {
		paneShowing = 1;

		Pane pane = new Pane();
		pane.setPrefSize(620, 518);
		pane.setLayoutX(180);
		pane.setLayoutY(40);
		pane.setStyle("-fx-background-color: #FFF");

		Text title = new Text("欢迎使用GIF签名图生成工具！");
		title.setFont(new Font("Microsoft YaHei Bold", 18));
		title.setWrappingWidth(600);
		title.setLayoutX(10);
		title.setLayoutY(28);

		Text text0 = new Text("此向导将引导您逐步收集生成您的签名图所需的全部信息。");
		text0.setFont(new Font("Microsoft YaHei", 14));
		text0.setWrappingWidth(600);
		text0.setLayoutX(10);
		text0.setLayoutY(67);

		Text text00 = new Text("请检查您的解析结果。如果有任何错误，请告诉我。");
		text00.setFont(new Font("Microsoft YaHei", 14));
		text00.setWrappingWidth(600);
		text00.setLayoutX(10);
		text00.setLayoutY(96);

		Text text1 = new Text("显示名称：");
		text1.setFont(new Font("Microsoft YaHei", 14));
		text1.setWrappingWidth(170);
		text1.setLayoutX(10);
		text1.setLayoutY(138);

		TextField field1 = new TextField(Variables.ProjectFly.loginData[1]);
		field1.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field1.setPrefSize(420, 25);
		field1.setFont(new Font("Microsoft YaHei", 12));
		field1.setEditable(false);
		field1.setLayoutX(190);
		field1.setLayoutY(120);

		Text text2 = new Text("用户名：");
		text2.setFont(new Font("Microsoft YaHei", 14));
		text2.setWrappingWidth(170);
		text2.setLayoutX(10);
		text2.setLayoutY(173);

		TextField field2 = new TextField(Variables.ProjectFly.loginData[0]);
		field2.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field2.setPrefSize(420, 25);
		field2.setFont(new Font("Microsoft YaHei", 12));
		field2.setEditable(false);
		field2.setLayoutX(190);
		field2.setLayoutY(155);

		Text text3 = new Text("总小时数：");
		text3.setFont(new Font("Microsoft YaHei", 14));
		text3.setWrappingWidth(170);
		text3.setLayoutX(10);
		text3.setLayoutY(208);

		TextField field3 = new TextField(Variables.ProjectFly.profileData[3]);
		field3.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field3.setPrefSize(420, 25);
		field3.setFont(new Font("Microsoft YaHei", 12));
		field3.setEditable(false);
		field3.setLayoutX(190);
		field3.setLayoutY(190);

		Text text4 = new Text("总航班数：");
		text4.setFont(new Font("Microsoft YaHei", 14));
		text4.setWrappingWidth(170);
		text4.setLayoutX(10);
		text4.setLayoutY(243);

		TextField field4 = new TextField(Variables.ProjectFly.profileData[2]);
		field4.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field4.setPrefSize(420, 25);
		field4.setFont(new Font("Microsoft YaHei", 12));
		field4.setEditable(false);
		field4.setLayoutX(190);
		field4.setLayoutY(225);

		Text text5 = new Text("个人简介：（可编辑）");
		text5.setFont(new Font("Microsoft YaHei", 14));
		text5.setWrappingWidth(170);
		text5.setLayoutX(10);
		text5.setLayoutY(278);

		TextField field5 = new TextField(Variables.ProjectFly.profileData[0]);
		field5.setStyle("-fx-background-color: #F5F5F5; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field5.setPrefSize(420, 25);
		field5.setFont(new Font("Microsoft YaHei", 12));
		field5.setLayoutX(190);
		field5.setLayoutY(260);

		Text text6 = new Text("喜爱的航空器：");
		text6.setFont(new Font("Microsoft YaHei", 14));
		text6.setWrappingWidth(170);
		text6.setLayoutX(10);
		text6.setLayoutY(313);

		TextField field6 = new TextField(Variables.ProjectFly.profileData[5] + " / " + Variables.ProjectFly.profileData[4]);
		field6.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field6.setPrefSize(420, 25);
		field6.setFont(new Font("Microsoft YaHei", 12));
		field6.setEditable(false);
		field6.setLayoutX(190);
		field6.setLayoutY(295);

		Text text7 = new Text("喜爱的机场：");
		text7.setFont(new Font("Microsoft YaHei", 14));
		text7.setWrappingWidth(170);
		text7.setLayoutX(10);
		text7.setLayoutY(348);

		TextField field7 = new TextField(Variables.ProjectFly.logbookData[0]);
		field7.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field7.setPrefSize(420, 25);
		field7.setFont(new Font("Microsoft YaHei", 12));
		field7.setEditable(false);
		field7.setLayoutX(190);
		field7.setLayoutY(330);

		Text text8 = new Text("喜爱的路线：");
		text8.setFont(new Font("Microsoft YaHei", 14));
		text8.setWrappingWidth(170);
		text8.setLayoutX(10);
		text8.setLayoutY(383);

		TextField field8 = new TextField(Variables.ProjectFly.logbookData[1]);
		field8.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field8.setPrefSize(420, 25);
		field8.setFont(new Font("Microsoft YaHei", 12));
		field8.setEditable(false);
		field8.setLayoutX(190);
		field8.setLayoutY(365);

		Text text9 = new Text("已访问国家：");
		text9.setFont(new Font("Microsoft YaHei", 14));
		text9.setWrappingWidth(170);
		text9.setLayoutX(10);
		text9.setLayoutY(418);

		TextField field9 = new TextField(Variables.ProjectFly.passportData + "%");
		field9.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field9.setPrefSize(420, 25);
		field9.setFont(new Font("Microsoft YaHei", 12));
		field9.setEditable(false);
		field9.setLayoutX(190);
		field9.setLayoutY(400);

		Text text10 = new Text("平均接地率：");
		text10.setFont(new Font("Microsoft YaHei", 14));
		text10.setWrappingWidth(170);
		text10.setLayoutX(10);
		text10.setLayoutY(453);

		TextField field10 = new TextField(Variables.ProjectFly.profileData[6] + " fpm");
		field10.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field10.setPrefSize(420, 25);
		field10.setFont(new Font("Microsoft YaHei", 12));
		field10.setEditable(false);
		field10.setLayoutX(190);
		field10.setLayoutY(435);

		Text text11 = new Text("已完成成就：");
		text11.setFont(new Font("Microsoft YaHei", 14));
		text11.setWrappingWidth(170);
		text11.setLayoutX(10);
		text11.setLayoutY(488);

		TextField field11 = new TextField(Variables.ProjectFly.profileData[1]);
		field11.setStyle("-fx-background-color: #D1D0CE; -fx-border-width: 0px 0px 2px 0px; -fx-border-color: #25292E; -fx-text-inner-color: #25292E");
		field11.setPrefSize(420, 25);
		field11.setFont(new Font("Microsoft YaHei", 12));
		field11.setEditable(false);
		field11.setLayoutX(190);
		field11.setLayoutY(470);

		pane.getChildren().addAll(title, text0, text00, text1, field1, text2, field2, text3, field3, text4, field4, text5, field5, text6, field6, text7, field7, text8, field8, text9, field9, text10, field10, text11, field11);

		return pane;
	}
}