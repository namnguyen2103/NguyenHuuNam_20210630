package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
	
	private String artist;
    private ArrayList<Track> tracks;     
    
    public CompactDisc(String title, String artist, ArrayList tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}
    
    public CompactDisc(String title, String category, float cost, String artist, ArrayList tracks) {
		super(title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, String director, float cost, String artist, ArrayList tracks) {
		super(title, category, director, cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list of tracks.");
        } else {
            tracks.add(track);
            System.out.println("The track has been added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("The track has been removed successfully.");
        } else {
            System.out.println("The track does not exist in the list of tracks.");
        }
    }
    
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
