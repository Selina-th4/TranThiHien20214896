package hust.soict.dsai.aims.media;

public interface Playable {
    void play();
    void stop();
    void pause();
    void resume();
    boolean isPlaying();
}
