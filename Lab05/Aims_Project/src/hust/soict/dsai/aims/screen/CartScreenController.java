package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CompactDisc;
import javax.print.attribute.standard.Media;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;
	
	@FXML
	private TableView<Media> Mediaia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediacategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	
	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	
	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
			
			@Override
			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
				if(newValue != null) {
					updateButtonBar(newValue);
				}
			}
		});
	}
	
	@FXML 
	void PlaceOrderPressed(ActionEvent event) {
		cart.itemsOrdered.clear();
	    setTotal();
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
			  JOptionPane.showMessageDialog(frame, "Cart was Ordered", "Ordered Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@FXML
	void AddBookPressed(ActionEvent event) {
	  //Add Book	
	  StoreScreen.scCart.setVisible(false);
	  StoreScreen.sc2=new AddBookScreen();
	  StoreScreen.sc2.setSize(934,595);
	}

	
	@FXML
	void AddCDPressed(ActionEvent event) {
		//Add CD
		StoreScreen.scCart.setVisible(false);
		StoreScreen.sc1=new AddCDScreen();
		StoreScreen.sc1.setSize(934,595);
	}

	
	@FXML
	void AddDVDPressed(ActionEvent event) {
		//Add DVD
			StoreScreen.scCart.setVisible(false);
			StoreScreen.sc=new AddDVDscreen();
			StoreScreen.sc.setSize(934,595);
	}
	
	@FXML
	void ViewStorePressed(ActionEvent event) {
		  new StoreScreen(Aims.store);
		  StoreScreen.scCart.setVisible(false);
	}

}
