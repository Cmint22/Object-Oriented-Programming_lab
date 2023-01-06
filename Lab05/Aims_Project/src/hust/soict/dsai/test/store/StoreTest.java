package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

// TODO: Auto-generated Javadoc
/**
 * The Class StoreTest.
 */
public class StoreTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Create a new store
		Store store = new Store();
		
		//Create new dvd objects store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addDigitalVideoDisc(dvd1);		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 0.6f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.34f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 3.3f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("FFFF", "ffff", "ffff", 6, 56f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("GGGG", "gggg", "gggg", 7, 2.9f); 
						
		//Test 
		store.print();
		store.addDigitalVideoDisc(dvd4);
		store.print();
		store.removeDigitalVideoDisc(dvd2);
		store.print();
		store.addDigitalVideoDisc(dvd5);
		store.addDigitalVideoDisc(dvd7);
		store.addDigitalVideoDisc(dvd10);
		store.addDigitalVideoDisc(dvd9);
		store.addDigitalVideoDisc(dvd6);
		store.addDigitalVideoDisc(dvd8);
		store.print();
	}

}


