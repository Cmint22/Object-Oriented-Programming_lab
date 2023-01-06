package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import javax.print.attribute.standard.Media;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public int qtyinstore = 0;

	
	public void removeMedia(Media disc) {
		itemsInStore.remove(disc);
		System.out.println("The Media " + disc.getTitle() + " removed");
	}

	public void addMedia(Media disc) {
	
			itemsInStore.add(disc);
			System.out.println("The Media " + disc.getTitle() + " added");
	}


	public ArrayList<Media> getItemsInStore() {
		// TODO Auto-generated method stub
		return itemsInStore;
	}

	public Object getItemsOrdered() {
		// TODO Auto-generated method stub
		return null;
	}

}


