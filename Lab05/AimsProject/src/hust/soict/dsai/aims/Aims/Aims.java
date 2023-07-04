package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.Book;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner;
    Media book = new Book();

    public static void main(String[] args) {
        scanner = new Scanner(System.in); // Gán giá trị cho biến scanner
        showMenu();
    }

    public static void showMenu() {
        int choice;
        do {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    public static void viewStore() {
        int choice;
        do {
            store.displayItems();
            storeMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set choice to an invalid value to repeat the loop
            }
            switch (choice) {
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void seeMediaDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the title of the media: ");
            if (scanner.hasNextLine()) {
                String title = scanner.nextLine();

                Media media = store.searchMediaByTitle(title);
                if (media != null) {
                    media.displayInfo();

                    int choice;
                    do {
                        mediaDetailsMenu();
                        if (scanner.hasNextInt()) {
                            choice = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character

                            switch (choice) {
                                case 0:
                                    System.out.println("Returning to store menu...");
                                    break;
                                case 1:
                                    addToCartByTitle(title);
                                    break;
                                case 2:
                                    playMediaByTitle(title);
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                            System.out.println();
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.nextLine(); // Consume the invalid input
                            choice = -1; // Set choice to an invalid value to repeat the loop
                        }
                    } while (choice != 0);
                } else {
                    System.out.println("Media not found in the store.");
                }
            } else {
                System.out.println("No input data available.");
            }
        }
    }


    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addToCartByTitle(String title) {
        Media media = store.searchMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Added to cart: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    @SuppressWarnings("unused")
	private static Media findMediaByTitle(String title) {
        for (Media media : store.getMediaList()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }


	public static void playMediaByTitle(String title) {
        Media media = store.searchMediaByTitle(title);
        if (media != null) {
            media.play();
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    public static void addToCart() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the title of the media: ");
			String title = scanner.nextLine();

			addToCartByTitle(title);
		}
    }

    public static void playMedia() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the title of the media: ");
			String title = scanner.nextLine();

			playMediaByTitle(title);
		}
    }

    public static void updateStore() {
        int choice;
        do {
            updateStoreMenu();
            try (Scanner scanner = new Scanner(System.in)) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
			}
            switch (choice) {
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void removeMediaFromStore() {
		// TODO Auto-generated method stub
		
	}

	public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void addMediaToStore() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the title of the media: ");
			String title = scanner.nextLine();
			System.out.println("Enter the category of the media: ");
			System.out.println("Enter the cost of the media: ");
			scanner.nextLine(); // Consume the newline character

			Media media = store.searchMediaByTitle(title);
			if (media != null) {
			    if (store.removeMedia(media)) {
			        System.out.println("Media removed from the store.");
			    } else {
			        System.out.println("Failed to remove media from the store.");
			    }
			} else {
			    System.out.println("Media not found in the store.");
			}
		}
    }

    public static void seeCurrentCart() {
        int choice;
        do {
            cart.displayCart();
            cartMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set choice to an invalid value to repeat the loop
            }

            switch (choice) {
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                case 1:
                    filterCart();
                    break;
                case 2:
                    sortCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaFromCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void filterCart() {
        int choice;
        do {
            filterCartMenu();
            try (Scanner scanner = new Scanner(System.in)) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
			}
            switch (choice) {
                case 0:
                    System.out.println("Returning to cart menu...");
                    break;
                case 1:
                    filterCartById();
                    break;
                case 2:
                    filterCartByTitle();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);
    }

    public static void filterCartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter cart by id");
        System.out.println("2. Filter cart by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void filterCartById() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the id of the media: ");
			int id = scanner.nextInt();

			cart.filterById(id);
		}
    }

    public static void filterCartByTitle() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the title of the media: ");
			String title = scanner.nextLine();

			cart.filterByTitle(title);
		}
    }

    public static void sortCart() {
        int choice;
        do {
            sortCartMenu();
            try (Scanner scanner = new Scanner(System.in)) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume the newline character
			}
            switch (choice) {
                case 0:
                    System.out.println("Returning to cart menu...");
                    break;
                case 1:
                    sortCartByTitle();
                    break;
                case 2:                    sortCartByCost();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        System.out.println();
    } while (choice != 0);
}

public static void sortCartMenu() {
    System.out.println("Options: ");
    System.out.println("--------------------------------");
    System.out.println("1. Sort cart by title");
    System.out.println("2. Sort cart by cost");
    System.out.println("0. Back");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2");
}

public static void sortCartByTitle() {
    cart.sortByTitle();
}

public static void sortCartByCost() {
    cart.sortByCost();
}

public static void removeMediaFromCart() {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the title of the media: ");
		String title = scanner.nextLine();

		if (cart.removeItemByTitle(title)) {
		    System.out.println("Media removed from the cart.");
		} else {
		    System.out.println("Media not found in the cart.");
		}
	}
}

public static void playMediaFromCart() {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the title of the media: ");
		String title = scanner.nextLine();

		if (cart.playItemByTitle(title)) {
		    System.out.println("Playing media from the cart.");
		} else {
		    System.out.println("Media not found in the cart.");
		}
	}
}

public static void placeOrder() {
    cart.displayCart();
    System.out.println("Order placed. The current cart is empty.");
    cart.clearCart();
}
}

