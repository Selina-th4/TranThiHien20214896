package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart myCart = new Cart();

        // Create a new DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Was", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Add the DVD to the cart
        myCart.addDigitalVideoDisc(dvd1);
        myCart.addDigitalVideoDisc(dvd2);
        myCart.addDigitalVideoDisc(dvd3);

        // Print the contents of the cart
        myCart.displayCart();
    }
}
