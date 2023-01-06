package hust.soict.dsai.javafx;

public class Painter extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/program/javafx/Painter.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
