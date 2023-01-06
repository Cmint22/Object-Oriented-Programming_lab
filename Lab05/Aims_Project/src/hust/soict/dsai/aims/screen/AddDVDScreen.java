package hust.soict.dsai.aims.screen;
import java.io.IOException;
import javax.swing.JFrame;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddDVDScreen extends JFrame {
	public AddDVDScreen() { 
		super();		
		JFXPanel fxPanel = new JFXPanel();	
		this.add(fxPanel);
		
		this.setTitle("Add DVD");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("AddItemtoStore.fxml"));
					AddDVDController controller = new AddDVDController();
					loader.setController(controller);
					Parent root= loader.load();
					fxPanel.setScene(new Scene(root));				
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		});

	} 

}