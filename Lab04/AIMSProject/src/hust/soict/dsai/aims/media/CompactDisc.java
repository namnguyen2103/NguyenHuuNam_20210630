package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
    private ArrayList<Track> tracks;     
    
    public CompactDisc(String title, String artist) {
		super(title);
		this.artist = artist;
		this.tracks = new ArrayList<>();
	}
    
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
	public CompactDisc(int id, String title, String category, String director, float cost, String artist) {
		super(id, title, category, director, cost);
		this.artist = artist;
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
    
    public void play() {
        System.out.println("Playing Compact Disc: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Total Length: " + getLength() + " seconds");
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compact Disc - ").append(this.getTitle()).append("\n");
        sb.append("Category: ").append(this.getCategory()).append("\n");        
        sb.append("Artist: ").append(this.artist).append("\n");
        sb.append("Director: ").append(this.getDirector()).append("\n");
        sb.append("Cost: ").append(this.getCost()).append("\n");
        sb.append("Tracks: ").append(tracks.size()).append("\n");
        for (Track track : this.tracks) {
            sb.append(" - ").append(track.getTitle()).append("\n");
        }
        sb.append("Total Length: ").append(getLength()).append(" minutes");

        return sb.toString();
    }

}
