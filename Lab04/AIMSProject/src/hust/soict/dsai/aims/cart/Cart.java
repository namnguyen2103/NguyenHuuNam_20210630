package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
		public static final int MAX_NUMBERS_ORDERED = 20;
		private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
		
		public void addMedia(Media media) {
		    if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
		        System.out.println("The cart has been full already.");
		    } else {
		    	if (!itemsOrdered.contains(media)) {
		    		itemsOrdered.add(media);
	                System.out.println("The media has been added.");
	            } else {
	                System.out.println("The media is already in the cart.");
	            }
		    }
		}
		
		public void removeMedia(Media media) {
		    if (itemsOrdered.contains(media)) {
		        itemsOrdered.remove(media);
		        System.out.println("The media has been removed sucessfully.");
		    } else {
		        System.out.println("The media was not found in the cart.");
		    }
		}
		
		public float totalCost() {
		    float totalCost = 0;
		    
		    for (Media media : itemsOrdered) {
		        totalCost += media.getCost();
		    }
		    
		    return totalCost;
		}		
		
		public void sortCartCostTitle() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	    }
	    
	    public void sortCartTitleCost() {
	    	Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	    }
		
	    
	    public ArrayList<Media> getItemsOrdered() {
			return itemsOrdered;
		}

		// Print the list of ordered items of a cart
	    public void printCart() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        if (itemsOrdered.isEmpty()) {
	            System.out.println("The cart is empty.");
	        } else {
	        	for (int i = 0; i < itemsOrdered.size(); i++) {
		            Media media = itemsOrdered.get(i);
		            System.out.println((i + 1) + ". " + media.toString());
		            System.out.println("---------------------------------------------------------------------");
		        }
	        }   	        
	        float totalCost = totalCost();
	        System.out.printf("Total cost: %.2f\n", totalCost);
	        System.out.println("***************************************************");
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

}
