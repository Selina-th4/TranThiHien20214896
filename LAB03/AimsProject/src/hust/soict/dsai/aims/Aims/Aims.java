package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


// 5. Create Aims class
public class Aims {
	public static void main(String[] args) {		
		// 10. Create Carts of DigitalVideoDiscs
		// Create a new cart
		Cart anOrder = new Cart();
		
		// Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		 //11. Remove an item from the cart
		//anOrder.removeDigitalVideoDisc(dvd1);
		//anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.removeDigitalVideoDisc(dvd3);

		// Print the total cost of the cart
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}
}

