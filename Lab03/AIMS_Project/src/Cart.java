public class Cart {

		public static final int MAX_NUMBERS_ORDERED = 20;
		private DigitalVideoDisc itemsOrdered[] =
				new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		private int qtyOrdered;
		
		public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
	            System.out.println("The cart has been full already.");
	        } else {
	            itemsOrdered[qtyOrdered] = disc;
	            qtyOrdered++;
	            System.out.println("The disc has been added.");
	        }
	    }
	    
		// 2. Method Overloading
		public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		    int spaceLeft = MAX_NUMBERS_ORDERED - qtyOrdered;
		    if (dvdList.length > spaceLeft) {
		        System.out.println("There is not enough space in the cart.");
		        return;
		    }
		    for (DigitalVideoDisc disc : dvdList) {
		        addDigitalVideoDisc(disc);
		    }
		}
		
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		    if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
		        System.out.println("There is not enough space in the cart");
		        return;
		    }
		    addDigitalVideoDisc(dvd1);
		    addDigitalVideoDisc(dvd2);
		}
		
	    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].equals(disc)) {
	                itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
	                itemsOrdered[qtyOrdered - 1] = null;
	                qtyOrdered--;
	                System.out.println("The disc has been removed sucessfully.");
	                return;
	            }
	        }
	        System.out.println("The disc was not found in the cart");
	    }
	    
	    public float totalCost() {
	        float totalCost = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            totalCost += itemsOrdered[i].getCost();
	        }
	        return totalCost;
	    }
	    
	    // 6. Open the Cart class
	    // Print the list of ordered items of a cart
	    public void printCart() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");

	        double totalCost = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            DigitalVideoDisc dvd = itemsOrdered[i];
	            int id = dvd.getID();
	            System.out.println(id + ". " + dvd.toString());
	        }
	        System.out.printf("Total cost: %.2f\n", totalCost);
	        System.out.println("***************************************************");
	    }
	    
	    // Search DVD by ID
	    public void searchByID(int id) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].getID() == id) {
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
	    }

}
