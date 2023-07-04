package hust.soict.dsai.test.cart;

import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class CartTest {

    private Cart cart;

    public CartTest() {
        cart = new Cart();
    }

    public static void main(String[] args) {
        // Create a new Cart
        Cart cart = new Cart();

        // Create some media items
        Book book1 = new Book();
        book1.setTitle("The Catcher in the Rye");
        book1.setCategory("Novel");
        book1.setCost(9.99f);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc();
        dvd1.setTitle("The Avengers");
        dvd1.setCategory("Action");
        dvd1.setDirector("Joss Whedon");
        dvd1.setLength(120);
        dvd1.setCost(19.99f);

        CompactDisc cd1 = new CompactDisc("Abbey Road", "Rock", "The Beatles", "Director 1", 19.99f);
        cd1.setTitle("Abbey Road");
        cd1.setCategory("Rock");
        cd1.setArtist("The Beatles");
        cd1.setCost(19.99f);

        // Add items to the cart
        cart.addItem(book1);
        cart.addItem(dvd1);
        cart.addItem(cd1);

        // Display the cart
        System.out.println("Cart items:");
        cart.displayCart();

        // Remove an item from the cart
        //cart.removeMedia(book1);
    }

    public List<Media> getProductList() {
        return cart.getItemsOrdered();
    }
}
