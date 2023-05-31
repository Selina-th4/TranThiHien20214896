package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0; // Class attribute for tracking the number of DVDs

    public DigitalVideoDisc() {
        super();
        setId(++nbDigitalVideoDiscs); // Update the nbDigitalVideoDiscs and assign the id
    }

    public DigitalVideoDisc(String title) {
        super(title);
        setId(++nbDigitalVideoDiscs); // Update the nbDigitalVideoDiscs and assign the id
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        setId(++nbDigitalVideoDiscs); // Update the nbDigitalVideoDiscs and assign the id
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        this.director = director;
        setId(++nbDigitalVideoDiscs); // Update the nbDigitalVideoDiscs and assign the id
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.director = director;
        this.length = length;
        setId(++nbDigitalVideoDiscs); // Update the nbDigitalVideoDiscs and assign the id
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFormattedLength() {
        int hours = length / 3600;
        int minutes = (length % 3600) / 60;
        int seconds = length % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static int getNumberOfDVDs() {
        return nbDigitalVideoDiscs;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getFormattedLength());
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(getTitle()).append("\n");
        sb.append("Category: ").append(getCategory()).append("\n");
        sb.append("Director: ").append(getDirector()).append("\n");
        sb.append("Length: ").append(getFormattedLength()).append("\n");
        sb.append("Price: ").append(getCost()).append(" $").append("\n");
        
        sb.append("\n");

        return sb.toString();
    }


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlaying() {
		// TODO Auto-generated method stub
		return false;
	}
}
