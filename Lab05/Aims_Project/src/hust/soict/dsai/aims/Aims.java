package hust.soict.dsai.aims;
import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import javax.print.attribute.standard.Media;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.*;




public class Aims {
	public static Store store = new Store();
	public static Scanner scan = new Scanner(System.in);
	public static Cart cart = new Cart();
	public static int choice;
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", null, 0, 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//Print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		showMenu();
		System.out.println("Thanks for visiting!");
		System.out.println("Hope to see you soon.");
	}
	

	public static void showMenu() {
		while(true) {
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");
			System.out.println("2. Update store");
			System.out.println("3. See current cart");
			System.out.println("0. Exit");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2 - 3");
		
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1) 
				ViewStore();
			else if(choice == 2)
					UpdateStore();
			else if(choice == 3)
					SeeCurrentCart();
			else
				break;
		}
	}
	
	
	public static void ViewStore() {
		while(true) {  //Display all items in store.
			System.out.println("***** View Store *****");
			int i = 0;
			for(Media e : store.getItemsInStore()) {
				++i;
				System.out.println(i + ". ");
				e.toString();
			}
			System.out.println("Options: ");
			System.out.println("-------------------------------");
			System.out.println("1. See a media's details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("-------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2 - 3 - 4");		
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1)
				SeeMediaDetails();
			else if(choice == 2)
					AddMediaToCart();
			else if(choice == 3)
					PlayAMedia();
			else if(choice == 4)
					SeeCurrentCart();
			else 
				break;
		}
	}
	
	
	private static void UpdateStore() {
		while(true) {  //Update store.
			System.out.println("***** Update Store *****");
			System.out.println("Options: ");
			System.out.println("-------------------------------");
			System.out.println("1. Add a media to store");
			System.out.println("2. Remove a media from store");
			System.out.println("0. Back");
			System.out.println("-------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2");
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1)
				AddMediaToStore();
			else if(choice == 2)
					RemoveMediaFromStore();
			else 
				break;
		}
	}
	
	
	private static void SeeCurrentCart() {
		while(true) {  //Display all items in current cart.
			System.out.println("***** See current cart *****");
			int i = 0;
			for(Media e : cart.getItemsInStore()) {
				++i;
				System.out.println(i + ". ");
				e.toString();
			}
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2 - 3 - 4 - 5");		
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1)
				FilterMediaInCart();
			else if(choice == 2)
					SortMediaInCart();
			else if(choice == 3)
					RemoveMediaFromCart();
			else if(choice == 4)
					PlayAMedia();
			else if(choice == 5)
					PlaceOrder();
			else 
				break;
		}
	}
	
	
	private static void SeeMediaDetails() {
		while(true) {  
			System.out.println("***** See media details *****");
			System.out.println("Options: ");
			System.out.println("-------------------------------");
			System.out.println("1. Add to cart");
			System.out.println("2. Play");
			System.out.println("0. Back");
			System.out.println("-------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2");			
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1)
				AddToCart();
			else if(choice == 2)
					Play();
			else 
				break;
		}
	}
	
	
	private static void AddMediaToStore() {
		while(true) {  
			System.out.println("***** Add a media to store *****");
			System.out.println("Options: ");
			System.out.println("-------------------------------");
			System.out.println("1. Book");
			System.out.println("2. DVD");
			System.out.println("3. CD");
			System.out.println("0. Back");
			System.out.println("-------------------------------");
			System.out.println("Please choose a number: 0 - 1 - 2 - 3");			
			scan = new Scanner(System.in);
			choice = scan.nextInt();
			if(choice == 1)
				AddBookToStore();
			else if(choice == 2)
					AddDVDToStore();
			else if(choice == 3)
					AddCDToStore();
			else 
				break;
		}
	}
	
	
	private static void RemoveMediaFromStore() {
		while(true) {
			System.out.println("Enter exact media title: ");
			scan = new Scanner(System.in);
			String title = scan.nextLine().toLowerCase().strip();
			choice = (title.equals("0")) ? 0 : searchStoreByTitle(title);
			if(choice == 0) 
				break;
			if(choice == -1)
				System.out.println("Media title not found!");
			else 
				choice -= 1;
				Media item = store.getItemsInStore().get(choice);
				store.removeMedia(item);
		}
	}
	
	
	private static void RemoveMediaFromCart() {
		while(true) {
			System.out.println("Enter exact media title: ");
			scan = new Scanner(System.in);
			String title = scan.nextLine().toLowerCase().strip();
			choice = (title.equals("0")) ? 0 : searchCartByTitle(title);
			if(choice == 0) 
				break;
			if(choice == -1)
				System.out.println("Media title not found!");
			else 
				choice -= 1;
				Media item = store.getItemsOrdered().get(choice);
				store.removeMedia(item);
		}
	}
	
	
	private static void PlaceOrder() {
		if(cart.getItemsOrdered().size() > 0) {
			System.out.println("Order is created!");
			cart.getItemsOrdered().clear();
		}
		else 
			System.out.println("You cart is empty!");	
	}
	
	
	private static int searchCartByTitle(String title) {
		int i = 1;
		for(Media e : cart.getItemsOrdered()) {
			if(e.getName().equals(title)) 
				return i;
			++i;
		}
		return -1;   //Return -1 if not found.
	}
	
	
	private static int searchStoreByTitle(String title) {
		int i = 1;
		for(Media e : store.getItemsInStore())
			if(e.getName().equals(title)) 
				return i;
			++i;
		return -1;   //Return -1 if not found.
	}
	
	
	private static void AddMediaToCart() {
	}
	
	private static void PlayAMedia() {
	}	

	private static void FilterMediaInCart() {
	}	
		
	private static void SortMediaInCart() {
	}	
	
	private static void AddBookToStore() {
	}	
	
	private static void AddDVDToStore() {
	}
		
	private static void AddCDToStore() {
	}
	
	private static void AddToCart() {
	}
		
	private static void Play() {
	}
	
	//cannot fix bug anymore :'))
}
