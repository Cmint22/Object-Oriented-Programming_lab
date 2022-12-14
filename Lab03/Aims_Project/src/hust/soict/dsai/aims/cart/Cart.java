package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	private float ttCost;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered++] = disc;
			System.out.printf("The disc %s has been added.\n", disc.getTitle());
		}
		else System.out.println("The order is almost full.\n");
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 0) {
			for(int i = 0; i < qtyOrdered; i++) {
				if(itemsOrdered[i] == disc) { //NEU DUNG == THI SO SANH XEM 2 CAI DAY CO CUNG THAM CHIEU 1 DOI TUONG KHONG!!
					for(int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
					itemsOrdered[--qtyOrdered] = null;
					break;
				}
			}
			System.out.printf("The disc %s has been removed.\n", disc.getTitle());
		}
		else System.out.println("The order is almost empty.\n");
	}
	
	public float totalCost() {
		ttCost = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			ttCost += itemsOrdered[i].getCost();
			//can create precision number that affect the last result.
		}
		return ttCost;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full.");
			return;
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED -1) {
			this.itemsOrdered[this.qtyOrdered++] = dvd1;
			this.itemsOrdered[this.qtyOrdered++] = dvd2;
			System.out.printf("The disc %s has been added.\n", dvd1.getTitle());
			System.out.printf("The disc %s has beeb added.\n", dvd2.getTitle());
		}
		else if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			this.itemsOrdered[this.qtyOrdered++] = dvd1;
			System.out.printf("the disc %s has been added.\n", dvd1.getTitle());
			System.out.printf("The disc %s cannot be added.\n", dvd2.getTitle());
		}
		else System.out.println("The order is almost full.");
	}
	
	public void printOrdered() {
		System.out.println("********************************CART********************************");
		System.out.print("Ordered Items: \n");
		
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.printf("%d. DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - %d: %.2f $ \n", i, itemsOrdered[i].getLength(), itemsOrdered[i].getCost());
		}
		System.out.printf("Total cost: %.2f \n", totalCost());
		System.out.println("*********************************************************************");
	}
	public void print() {
		// TODO Auto-generated method stub
	
	}
}


