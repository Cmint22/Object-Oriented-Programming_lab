package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected int length;
	
	public Disc() {
	}
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category) {
		super(title, category);
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Disc(int length) {
		this.length = length;
	}
	
	public Disc(int length, String title) {
		super(title);
		this.length = length;
	}
	
	public Disc(int length, String title, String category) {
		super(title, category);
		this.length = length;
	}

	public Disc(int length, String title, String category, float cost) {
		super(title, category, cost);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	@Override
	public void print() {
		System.out.printf("Title : %s.\nCategory : %s.\nCost : %s.\n", title, category, cost);
	}

}
