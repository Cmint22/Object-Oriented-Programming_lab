package hust.soict.dsai.aims.store;
import javax.print.attribute.standard.Media;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyinstore = 0;

	//Create new dvd objects store
	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);	
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	DigitalVideoDisc[] dvd = {dvd1, dvd2, dvd3};
	
	public void print() {
		int i;
		System.out.println("********************************STORE********************************");
		System.out.println("Store items: ");
		for(i = 0; i < qtyinstore; i++) {
			System.out.println("DVD - " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getDirector() + " - " + itemsInStore[i].getLength() + " - " + itemsInStore[i].getCost() + " $ ");
		}
		System.out.println("*********************************************************************");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc...dvdList) {
		int i = 0;
		if(qtyinstore <= 100) {
			itemsInStore[qtyinstore] = dvdList[i];
			qtyinstore +=1;
		}
		else System.out.printf("The store is almost full.");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyinstore > 0) {
			for(int i = 0; i < qtyinstore; i++) {
				if(itemsInStore[i].getTitle().equals(disc.getTitle())) {
					System.arraycopy(itemsInStore, i + 1, itemsInStore, i, qtyinstore - 1);
					qtyinstore -=1;
					System.out.println("Remove dick " +(i + 1)+ "successfully.");
					break;
				}
			}
		}
		else System.out.println("Store empty.");
	}

	public Media[] getItemsInStore() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeMedia(Media item) {
		// TODO Auto-generated method stub
		
	}

	public Object getItemsOrdered() {
		// TODO Auto-generated method stub
		return null;
	}

}


