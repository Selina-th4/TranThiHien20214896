package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

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

        // Add the media to the cart
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.addMedia(book1);
        cart.addMedia(book2);
        cart.addMedia(cd1);
        cart.addMedia(cd2);

        // Sort the media in the cart by title and cost
        cart.sortByTitle();
        cart.sortByCost();

        // Display the contents of the cart
        cart.displayCart();
    }
}
