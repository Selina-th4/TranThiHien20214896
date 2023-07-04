package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
    	// Create a new store
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Create some Books
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "Fantasy", 24.99f, 336);
        Book book2 = new Book("To Kill a Mockingbird", "Fiction", 14.99f, 281);


        // Create some Compact Discs
        CompactDisc cd1 = new CompactDisc("CD Title 1", "Category 1", "Artist 1", "Director 1", 19.99f);
        CompactDisc cd2 = new CompactDisc("CD Title 2", "Category 2", "Artist 2", "Director 2", 19.99f);

        // Set information for Compact Discs
        cd1.setTracks(new String[]{"Track 1", "Track 2", "Track 3"});
        cd2.setTracks(new String[]{"Track 4", "Track 5", "Track 6"});

        // Add the media to the 
        store.addMedia(dvd1);
        store.addMedia(dvd2);
       
        store.addMedia(dvd3);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(cd1);
        store.addMedia(cd2);

      
        // Display the contents of the cart
        store.displayStore();
    
 // Remove media from the store
    store.removeMedia(book1);

    // Check the quantity of media in the store
    System.out.println("Quantity of media in store: " + store.getQty());

    // Check the availability of media in the store
    store.available();
   }
}
