package hust.soict.dsai.aims.media;
import java.util.Objects;

public class DigitalVideoDisc extends Media {
	
	private String director;
	private int length;	
	private static int nbDigitalVideoDiscs = 0;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
		
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
		setTitle(title);		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
		setTitle(title);
		setCategory(category);
		this.director = director;
		setCost(cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		setId(nbDigitalVideoDiscs);
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
		setCost(cost);
	}
	
	
	// "toString()" method
	public String toString() {
	    return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
	}
		
}
