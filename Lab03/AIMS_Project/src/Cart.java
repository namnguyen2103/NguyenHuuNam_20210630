// 9. Create the Cart class to work with DigitalVideoDisc
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
	    
		// Method Overloading
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

}
