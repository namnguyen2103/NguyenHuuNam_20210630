package hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.Objects;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}	
	public int getID() {
		return id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	// "toString()" method
	public String toString() {
	    return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
	}
	
	// Create methods for comparison between DigitalVideoDisc objects
	@Override
	public int hashCode() {
		return Objects.hash(category, cost, director, length, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DigitalVideoDisc other = (DigitalVideoDisc) obj;
		return Objects.equals(category, other.category)
				&& Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost)
				&& Objects.equals(director, other.director) && length == other.length
				&& Objects.equals(title, other.title);
	}
	
		
}
