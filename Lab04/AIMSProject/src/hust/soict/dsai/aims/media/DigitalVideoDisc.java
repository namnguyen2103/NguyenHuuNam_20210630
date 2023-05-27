package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	
	private static int nbDigitalVideoDiscs = 0;
		
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
	}
	
	
	// "toString()" method
	public String toString() {
	    return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
	}
		
}
