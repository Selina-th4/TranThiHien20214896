package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.test.cart.CartTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    private final int MAX_NUMBERS_ORDERED = 20;
    
   


    public static void main(String[] args) {
        Cart cart = new Cart();
        CartTest cartTest = new CartTest();

        List<Media> productList = cartTest.getProductList();
        for (Media product : productList) {
            cart.addMedia(product);
        }

        System.out.println("Cart items:");
        cart.displayCart();
    }
   
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void removeMedia(Media media) {
        System.out.println("Removing media: " + media.toString());
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("The media is not in the cart.");
        }
    }

    public void clearCart() {
        itemsOrdered.clear();
        System.out.println("The cart has been cleared.");
    }

    public float totalCost() {
        float totalCost = 0.0f;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    public void displayCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int count = 1;
        for (Media media : itemsOrdered) {
            System.out.print(count + ". ");
            System.out.println(media.toString());
            count++;
        }
        System.out.printf("Total cost: $%.2f%n", totalCost());
        System.out.println("***************************************************");
    }


    public void searchMediaById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, no matching media with the given ID found.");
        }
    }

    public void searchMediaByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no matching media with the given title found.");
        }
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, new Comparator<Media>() {
            @Override
            public int compare(Media media1, Media media2) {
                String title1 = media1.getTitle();
                String title2 = media2.getTitle();

                if (title1 == null && title2 == null) {
                    return 0;
                } else if (title1 == null) {
                    return -1;
                } else if (title2 == null) {
                    return 1;
                }
                return title1.compareTo(title2);
            }
        });
        System.out.println("The cart has been sorted by title.");
    }

        public void sortByCost() {
            Collections.sort(itemsOrdered, new Comparator<Media>() {
                @Override
                public int compare(Media media1, Media media2) {
                    return Float.compare(media1.getCost(), media2.getCost());
                }
            });
            System.out.println("The cart has been sorted by cost.");
        }

        public List<Media> filterByCategory(String category) {
            List<Media> filteredList = new ArrayList<>();
            for (Media media : itemsOrdered) {
                if (media.getCategory().equals(category)) {
                    filteredList.add(media);
                }
            }
            return filteredList;
        }

        public boolean addItem(Media media) {
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(media);
                System.out.println("The media has been added.");
                return true;
            } else {
                System.out.println("The cart is almost full.");
                return false;
            }
        }

        public void filterById(int id) {
            List<Media> filteredList = new ArrayList<>();
            for (Media media : itemsOrdered) {
                if (media.getId() == id) {
                    filteredList.add(media);
                }
            }
            displayFilteredList(filteredList);
        }

        public boolean playItemByTitle(String title) {
            for (Media media : itemsOrdered) {
                if (media.getTitle().equals(title) && media instanceof Playable) {
                    ((Playable) media).play();
                    return true;
                }
            }
            System.out.println("Cannot find a playable item with the given title.");
            return false;
        }

        public boolean removeItemByTitle(String title) {
            for (Media media : itemsOrdered) {
                if (media.getTitle().equals(title)) {
                    itemsOrdered.remove(media);
                    System.out.println("The item has been removed.");
                    return true;
                }
            }
            System.out.println("Cannot find an item with the given title.");
            return false;
        }
       
        public void filterByTitle(String title) {
            List<Media> filteredList = new ArrayList<>();
            for (Media media : itemsOrdered) {
                if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    filteredList.add(media);
                }
            }
            displayFilteredList(filteredList);
        }

        private void displayFilteredList(List<Media> filteredList) {
            if (filteredList.isEmpty()) {
                System.out.println("No matching items found.");
            } else {
                System.out.println("Matching Items:");
                for (Media media : filteredList) {
                    System.out.println(media.toString());
                }
            }
        }
        public List<Media> getItemsOrdered() {
            return itemsOrdered;
        }
}