package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(disc);
                qtyOrdered++;
                System.out.println("The disc has been added.");
            }
            else {
                System.out.println("The cart is almost full.");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
            itemsOrdered.add(dvd1);
            itemsOrdered.add(dvd2);
            qtyOrdered += 2;
            System.out.println("The discs have been added.");
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

    public void displayCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.printf("%d. DVD - [%s] - [%s] - [%s] - [%d]: [%s] $%n", count, disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
            count++;
        }
        System.out.printf("Total cost: $%.2f%n", totalCost());
    }
}
