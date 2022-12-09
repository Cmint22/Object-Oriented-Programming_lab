package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// TODO: Auto-generated Javadoc
/**
 * The Class TestPassingParameter.
 */
public class TestPassingParameter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title is: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title is: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title is: " + jungleDVD.getTitle());
	}
	
	/**
	 * Swap.
	 */
	public static void swap(Object o1, Object o2) {
		Object tnp = o1;
		o1 = o2;
		o2 = tnp;
	}
	
	/**
	 * Change title.
	 */
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}




