package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String artist, String director, int length, float cost) {
        super(title, category, director, length, cost);
        this.artist = artist;
        tracks = new ArrayList<>();
    }
    public CompactDisc(String title, String category, String artist, String director, float cost) {
        super(title, category, director, cost);
        this.artist = artist;
        tracks = new ArrayList<>();
    }
    public CompactDisc(String title) {
        super(title);
        tracks = new ArrayList<>();
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
        tracks = new ArrayList<>();
    }

    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        tracks = new ArrayList<>();
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        tracks = new ArrayList<>();
    }

    public CompactDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost, director, length);
        tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(String[] trackTitles) {
        tracks.clear();
        for (String title : trackTitles) {
            Track track = new Track(title, getLength());
            tracks.add(track);
        }
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track does not exist.");
        }
    }

    public int getTotalDuration() {
        int totalDuration = 0;
        for (Track track : tracks) {
            totalDuration += track.getLength();
        }
        return totalDuration;
    }

    public int getNumberOfTracks() {
        return tracks.size();
    }

    @Override
    public void play() {
        System.out.println("Playing Compact Disc: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Total Length: " + getLength() + " seconds");
        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracks:");
        System.out.println(tracksToString());
        System.out.println();
    }

    private char[] tracksToString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(getTitle()).append("\n");
        sb.append("Category: ").append(getCategory()).append("\n");
        sb.append("Artist: ").append(getArtist()).append("\n");
        sb.append("Director: ").append(getDirector()).append("\n");
        sb.append("Price: ").append(getCost()).append(" $").append("\n");
        sb.append("Tracks:").append("\n");
        
        for (Track track : getTracks()) {
            sb.append("Title: ").append(track.getTitle());
            sb.append("Length: ").append(track.getLength()).append(" seconds").append("\n");
        }
        return sb.toString();
    }

    public String getTotalLength() {
        int totalSeconds = 0;
        for (Track track : tracks) {
            totalSeconds += track.getLength();
        }
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
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
