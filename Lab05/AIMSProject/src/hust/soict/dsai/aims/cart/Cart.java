package hust.soict.dsai.aims.cart;

import java.util.Collections;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public String addMedia(Media media) throws LimitExceededException, IllegalArgumentException {	
		try {
			if (itemsOrdered.contains(media)) {
				throw new IllegalArgumentException("ERROR: Media has already been added to cart.");
			}
			else {
				try {
					if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {	
						itemsOrdered.add(media);
						return "Media added to cart successfully";
					}
					else {
						throw new LimitExceededException("ERROR: The number of medias has reached its limit.");
					} 
				}
				catch (LimitExceededException e) {
					return "Cart's capacity reached its limit.";
				}
			}
		}
		catch (IllegalArgumentException e){
			return "Media has already been added to cart";
		}
	}
	public String removeMedia(Media media) throws IllegalArgumentException {
		try {
			if (!(itemsOrdered.contains(media))) {
				throw new IllegalArgumentException("ERROR: Media has not been added to cart");
			}
			else {
				itemsOrdered.remove(media);
				return "Media removed from cart successfully";
			}
		}
		catch (IllegalArgumentException e) {
			return "Media has not been added to cart";
		}
	}
	
	public double totalCost() {
		
		float total = 0;
		
		if (itemsOrdered.size() >= 1) {
			for (int i = 0; i < itemsOrdered.size(); i++) {
				total += itemsOrdered.get(i).getCost();
			}
		}
		
		return(total);
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		if (itemsOrdered.size() != 0) {
			for (int i = 1; i < itemsOrdered.size() + 1; i++) {
				System.out.println(Integer.toString(i) + ". " + itemsOrdered.get(i - 1));
			}
		}
		System.out.println("Total cost: " +Double.toString(totalCost()));
		System.out.println("**************************************************");
	}
	
	/*
    // Search DVD by ID
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("DVD found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with the given ID " + id + ".");
        }
    }
    
    // Search DVD by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle() == title) {
                System.out.println("DVD found: " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with the given title " + title + ".");
        }
    } */
	
	public void reset() {
		itemsOrdered = FXCollections.observableArrayList();
	}
	
    public void sortMediaListByTitleThenCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by title, and then by cost");
    }
    public void sortMediaListByCostThenTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by cost, and then by title");
    }
    public ObservableList<Media> getItemsOrdered() {
    	return itemsOrdered;
    }
}
