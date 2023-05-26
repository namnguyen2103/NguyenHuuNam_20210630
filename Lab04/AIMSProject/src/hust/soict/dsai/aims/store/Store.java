package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

// 7. Implement the Store class
public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private static int currentIndex = 0;      
    
    public Store(int storeSize) {
		super();
		this.itemsInStore = new DigitalVideoDisc[storeSize];
	}

	public void addDVD(DigitalVideoDisc disc) {
		if (currentIndex < itemsInStore.length) {
            itemsInStore[currentIndex] = disc;
            currentIndex++;
            System.out.println("DVD added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(int id) {
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (itemsInStore[i].getId() == id) {
                // shift items to fill the gap
                for (int j = i; j < currentIndex - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[currentIndex - 1] = null;
                currentIndex--;
                found = true;
                System.out.println("DVD removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD with ID " + id + " not found in the store.");
        }
    }
}
