package hust.soict.dsai.aims.media;
import java.util.Scanner;


public class Track implements Playable{
	private String title;
	private int length;
	private static Scanner keyboard;

	public Track() {
	}

	public Track(String title) {
		this.title = title;
	}
	
	public Track(int length) {
		this.length = length;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return length;
	}
	
	public static Track getTrack() {
		Track newTrack;
		keyboard = new Scanner(System.in);
		String titleTemp, temp;
		int lenTemp = 0;
		System.out.println("Enter the track's title : ");
		titleTemp = keyboard.nextLine();
		System.out.println("Enter the track's length : ");
		temp = keyboard.nextLine();
		try {
			if(!temp.isEmpty())
				lenTemp = Integer.parseInt(temp);
			if(lenTemp < 0)
				lenTemp = 0; //Not accept negative value.
		} catch (NumberFormatException e) {
			System.out.println("Error occurs!");
		}
		newTrack = new Track(titleTemp, lenTemp);
		return newTrack;
		//Do not need to close scanner now because may get error.
	}
	

	public void play() {
		System.out.println("Playing DVD : " + this.getTitle());
		System.out.println("DVD length : " + this.getLength());
	}

}
