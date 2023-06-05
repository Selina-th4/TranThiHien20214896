package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;


public class StoreTest {
    public static void main(String[] args) {
        // Create a new Store object
        Store store = new Store();

        // Create some DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD Title 1", "Category 1", "Director 1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD Title 2", "Category 2", "Director 2", 90, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD Title 3", "Category 3", "Director 3", 105, 24.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display the DVDs in the store
        System.out.println("DVDs in the store:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            System.out.println(dvd.toString());
        }

        // Remove a DVD from the store
        store.removeDVD(dvd2);

        // Display the updated list of DVDs in the store
        System.out.println("\nDVDs in the store after removal:");
        for (DigitalVideoDisc dvd : store.getItemsInStore()) {
            System.out.println(dvd.toString());
        }
    }
}
