package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    private int numberOfPages;

    public Book() {
        super();
    }

    public Book(String title, String category, float cost, int numberOfPages) {
        super(title, category, cost);
        this.numberOfPages = numberOfPages;
    }

    // Accessor methods for authors field
    public List<String> getAuthors() {
        return authors;
    }

    // Add an author to the authors list
    public void addAuthor(String authorName) {
        if (isValidAuthor(authorName)) {
            if (!authors.contains(authorName)) {
                authors.add(authorName);
            }
        } else {
            System.out.println("Invalid author name.");
        }
    }

    // Remove an author from the authors list
    public void removeAuthor(String authorName) {
        if (isValidAuthor(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Invalid author name.");
        }
    }

    private boolean isValidAuthor(String authorName) {
        return !authorName.isEmpty();
    }

    private String authorsToString() {
        StringBuilder sb = new StringBuilder();
        for (String author : authors) {
            sb.append(author).append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
    public void displayInfo() {
            System.out.println("Title: " + getTitle());
            System.out.println("Category: " + getCategory());
            System.out.println("Cost: " + getCost());
            System.out.println("Authors: " + authorsToString());
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.println();
        }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(getTitle()).append("\n");
        sb.append("Category: ").append(getCategory()).append("\n");
        sb.append("Cost: ").append(getCost()).append("\n");
        sb.append("Authors: ").append(authorsToString()).append("\n");
        sb.append("Number of Pages: ").append(numberOfPages);
       
        sb.append("\n");

        return sb.toString();
    }

    public String getType() {
        return "Book";
    }

    public String getDirector() {
        return "";
    }

    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }

    public boolean filterByCategory(String category) {
        return getCategory().equalsIgnoreCase(category);
    }

	public Object addAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
}
