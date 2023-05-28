package hust.soict.dsai.test.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		// Create a new store
		Store store = new Store(5);
		
		// Create new DVDs and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		Track track1 = new Track("Track 1", 4);
        Track track2 = new Track("Track 2", 3);
        Track track3 = new Track("Track 3", 5);

        // Create a CompactDisc with tracks
        CompactDisc cd = new CompactDisc("My Album", "Artist Name");
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        // Print the CompactDisc object using the toString() method
        DigitalVideoDisc dvd100 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
        List<String> authors = new ArrayList<>();
        authors.add("John Smith");
        authors.add("Jane Doe");
        Book book = new Book("Sample Book", "Fiction", authors, 5f);
		store.addMedia(dvd3);
		store.addMedia(dvd3);
		store.addMedia(book);
		store.addMedia(dvd100);
		store.addMedia(cd);
		store.addMedia(book);
		store.printItemsInStore();
		store.removeMedia(dvd2);
		store.removeMedia(dvd2);
		store.removeMedia(dvd1);
		store.removeMedia(dvd3);
	}
	
}
