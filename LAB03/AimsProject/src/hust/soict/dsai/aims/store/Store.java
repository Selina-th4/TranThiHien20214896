package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The DVD has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The DVD has been removed from the store.");
        }
        else {
            System.out.println("The DVD is not in the store.");
        }
    }

    public ArrayList<DigitalVideoDisc> getItemsInStore() {
        return itemsInStore;
    }
}
