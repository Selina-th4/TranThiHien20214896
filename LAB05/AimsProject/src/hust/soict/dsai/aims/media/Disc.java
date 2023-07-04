package hust.soict.dsai.aims.media;

public class Disc extends Media {

    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Disc() {
        super();
    }

    public Disc(String title) {
        super();
        setTitle(title);
    }

    public Disc(String title, String category, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        setCost(cost);
    }

    public Disc(String title, String category, String director, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setCost(cost);
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setCost(cost);
    }

    public Disc(int id, String title, String category, float cost, String director, int length) {
        super();
        setId(id);
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Director: " + getDirector());
        System.out.println("Length: " + getFormattedLength());
        System.out.println("Cost: " + getFormattedCost());
    }

    public String getType() {
        return "Disc";
    }

    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }

    public boolean filterByCategory(String category) {
        return getCategory().equalsIgnoreCase(category);
    }

    public String getFormattedLength() {
        int hours = length / 3600;
        int minutes = (length % 3600) / 60;
        int seconds = length % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String getFormattedCost() {
        return String.format("$%.2f", getCost());
    }
}
