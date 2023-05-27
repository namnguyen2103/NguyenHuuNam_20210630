package hust.soict.dsai.aims.media;

public class Disc extends Media {
	
	private String director;
	private int length;		
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
		
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(String title) {
		super();
		setTitle(title);		
	}
	public Disc(String title, String category, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	public Disc(String title, String category, String director, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		this.director = director;
		setCost(cost);
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
		setCost(cost);
	}
}
