package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
	
	private String artist;
    private ArrayList<Track> tracks;

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(int id, String title) {
		super(id, title);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(int id, String title, String category, String director, float cost) {
		super(id, title, category, director, cost);
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, director, length, cost);
		// TODO Auto-generated constructor stub
	}

}
