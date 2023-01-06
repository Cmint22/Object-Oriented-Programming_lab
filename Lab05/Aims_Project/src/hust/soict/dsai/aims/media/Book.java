package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.Scanner;


public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<>();
	private static Scanner keyboard;
	
	public Book() {
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, ArrayList<String> authors) {
		super(title, category);
		this.setAuthors(authors); //Check author condition
	}



	public static Book getBook() {
		Book newBook = new Book();
		keyboard = new Scanner(System.in);
		String temp;
		System.out.println("Enter the title: ");
			newBook.setTitle(keyboard.nextLine());
		System.out.println("Enter the category: ");
			newBook.setCategory(keyboard.nextLine());
		System.out.println("Enter the price: ");
			temp = keyboard.nextLine();
			try {
				if(!temp.isEmpty());
				newBook.setCost(Float.parseFloat(temp));
			} catch(NumberFormatException e) {
				System.err.println("Error occurs!");
			}
		do {
			System.out.println("Enter the author name (enter to skip): ");
			temp = keyboard.nextLine();
			if(!temp.isEmpty())
				newBook.addAuthor(temp);
			else
				return newBook;
		} while (true);
	}



	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}



	public void addAuthor(String authorName) {
		for(int i = 0; i < authors.size(); ++i) {
			if(authors.get(i).equals(authorName)) {
				System.out.println("Dukicated Name.");
				return;
			} 
		}
		authors.add(authorName);
	}

	public void removeAuthor(String authorName) {
		for(int i = 0; i < authors.size(); ++i) {
			if(authors.get(i).equals(authorName)) {
				authors.remove(i);
				System.out.println("Name has been deleted.");
				return;
			}
		}
	}
	
	
	public void print() {
		StringBuilder authorsList = new StringBuilder();
		if(!authors.isEmpty()) {
			authorsList.append(authors.get(0));
			for(int i = 0; i < authors.size(); ++i) {
				authorsList.append(",");
				authorsList.append(authors.get(i));
			}
		}
		System.out.printf("Book - " + getTitle() + " - " + getCategory() + " - " + authorsList + " : %.2f $.", getCost());
	}

		
}
