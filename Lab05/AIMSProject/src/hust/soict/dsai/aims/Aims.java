package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store.addMedia(dvd3);
		
		CompactDisc cd = new CompactDisc("CD", "Alternative", "2", 29.95f, "3");		
        store.addMedia(cd);
		
        List<String> authors = new ArrayList<>();
        authors.add("John Smith");
        authors.add("Jane Doe");
        Book book = new Book("Sample Book", "Fiction", authors, 5f);
		Book bbb = new Book("How to be rich", "Huan Rose", 2000f);
		store.addMedia(book);
		store.addMedia(bbb);		
	
		new StoreScreen(store, cart);
	}
}
