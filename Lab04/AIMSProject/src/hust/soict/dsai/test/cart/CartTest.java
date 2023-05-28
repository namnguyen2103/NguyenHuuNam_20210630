package hust.soict.dsai.test.cart;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class CartTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new DVDs and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addMedia(dvd3);
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
        cart.addMedia(book);
        cart.addMedia(dvd100);
        cart.addMedia(cd);
        cart.sortCartTitleCost();
		cart.printCart();
		cart.removeMedia(dvd3);
		cart.removeMedia(dvd3);
		cart.removeMedia(dvd1);
		cart.removeMedia(dvd2);
	}
}
