import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();
    private final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
        }
        else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            if (itemsOrdered.remove(disc)) {
                qtyOrdered--;
                System.out.println("The disc has been removed.");
            }
            else {
                System.out.println("The disc is not in the cart.");
            }
        }
        else {
            System.out.println("The cart is empty.");
        }
    }

    public void clearCart() {
        itemsOrdered.clear();
        qtyOrdered = 0;
        System.out.println("The cart has been cleared.");
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (DigitalVideoDisc disc : itemsOrdered) {
            totalCost += disc.getCost();
        }
        return totalCost;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public ArrayList<DigitalVideoDisc> getItemsOrdered() {
        return itemsOrdered;
    }
}

