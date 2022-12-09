package hust.soict.dsai.aims.media;

public class Media {
	protected String title;
	protected String category;
	protected float cost;
	
	public Media() {
	}
	
	public Media(String title) {
		this.title = title;
	}

	public Media(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void print() {
		System.out.printf("Title : %s. \nCategory : %s.\nCost : %s.\n", title, category, cost);
	}
}
