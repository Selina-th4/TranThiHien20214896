package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    public boolean removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not in the store.");
        }
		return false;
    }

    public int getQty() {
        return itemsInStore.size();
    }

    public boolean checkMedia(Media media) {
        return itemsInStore.contains(media);
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void available() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Available items in the store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        // Add media
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
       
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "Fantasy", 24.99f, 336);
        book1.addAuthor("J.K. Rowling");

        Book book2 = new Book("To Kill a Mockingbird", "Fiction", 14.99f, 281);
        book2.addAuthor("Harper Lee");

        store.addMedia(book1);
        store.addMedia(book2);

        
     
        
        CompactDisc cd1 = new CompactDisc("CD Title 1", "Category 1", "Artist 1", "Director 1", 19.99f);
        cd1.setTitle("CD Title 1");
        cd1.setCategory("Category 1");
        cd1.setArtist("Artist 1");
        cd1.setDirector("Director 1");
        cd1.setCost(19.99f);

        Track track1 = new Track("Track 1", 180);
        Track track2 = new Track("Track 2", 200);
        cd1.addTrack(track1);
        cd1.addTrack(track2);

        CompactDisc cd2 = new CompactDisc("CD Title 2", "Category 2", "Artist 2", "Director 2", 19.99f);
        cd2.setTitle("CD Title 2");
        cd2.setCategory("Category 2");
        cd2.setArtist("Artist 2");
        cd2.setDirector("Director 2");
        cd2.setCost(19.99f);

        Track track3 = new Track("Track 3", 150);
        Track track4 = new Track("Track 4", 230);
        cd2.addTrack(track3);
        cd2.addTrack(track4);

        store.addMedia(cd1);
        store.addMedia(cd2);
        // Remove media
        //store.removeMedia(book1);

        // Check quantity
        System.out.println("Quantity of media in store: " + store.getQty());

        // Check availability
        store.available();
    }
    public void displayStore() {
        System.out.println("Items in the store:");
        for (Media media : itemsInStore) {
            System.out.println(media.getTitle());
        }
        System.out.println();
    }

    public Media searchMedia(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

	public void displayItems() {
		// TODO Auto-generated method stub
		
	}

	public Media searchMediaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	public Media[] getMediaList() {
		// TODO Auto-generated method stub
		return null;
	}
}
