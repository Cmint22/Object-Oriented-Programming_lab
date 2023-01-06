package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.store.Store;
import javafx.scene.media.Media;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class StoreScreen extends JFrame {
	public static AddDVDScreen sc;
	public static AddCDScreen sc1;
	public static AddBookScreen sc2;
	public static CartScreen scCart;
	private Store store;
	private JPanel center;
	private static final String ADD_BOOK = "AddBook";
	private static final String ADD_CD = "AddCD";
	private static final String ADD_DVD = "AddDVD";
	
	
	//set layout for StoreScreen
	public StoreScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
		
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		addBook.addActionListener(new MenuItemListener());
		smUpdateStore.add(addBook);
		smUpdateStore.add(new JMenuItem("Add CD"));
		addCD.addActionListener(new MenuItemListener());
		smUpdateStore.add(addCD);
		smUpdateStore.add(new JMenuItem("Add DVD"));
		addDVD.addActionListener(new MenuItemListener());
		smUpdateStore.add(addDVD);
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		viewcart.addActionListener(new MenuItemListener());
		menu.add(viewcart);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100, 50));
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for(int i = 0; i < 9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	
	 private class ButtonListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				   String button = e.getActionCommand();
		           if(button.equals("View cart")) {
		        	   setVisible(false);
			           scCart =new CartScreen(Aims.cart);
			  		   scCart.setSize(1024,768);
		           }
				
			}
	}
	 
	public class MenuItemListener implements ActionListener {
			     
		@Override   
		public void actionPerformed(ActionEvent e) {
			String menuitem = e.getActionCommand();
			if(menuitem.equals("Add DVD")) {
				setVisible(false);
			    sc= new AddDVDScreen();
			    sc.setSize(934,595);
			}
			else if(menuitem.equals("Add CD")) {
				setVisible(false);
			    sc1=new AddCDScreen();
			    sc1.setSize(934,595);
			}
			else if(menuitem.equals("Add Book")) {
			    setVisible(false);
			    sc2=new AddBookScreen();
			    sc2.setSize(934,595);
			}
			else if(menuitem.equals("View cart")) {    
				setVisible(false);
			    scCart =new CartScreen(Aims.cart);
			    scCart.setSize(1024,768);
			}
		}
	}
			     
}
