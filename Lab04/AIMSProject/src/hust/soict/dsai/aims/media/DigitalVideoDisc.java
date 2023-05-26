package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	
	private static int nbDigitalVideoDiscs = 0;
		
	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs + 1, title);
		nbDigitalVideoDiscs ++;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, cost);
		nbDigitalVideoDiscs ++;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, director, cost);
		nbDigitalVideoDiscs ++;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDiscs + 1, title, category, director, length, cost);
		nbDigitalVideoDiscs ++;
	}
	
	
	// "toString()" method
	public String toString() {
	    return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
	}
		
}
