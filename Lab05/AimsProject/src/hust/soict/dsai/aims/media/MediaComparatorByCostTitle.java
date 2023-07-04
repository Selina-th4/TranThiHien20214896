package hust.soict.dsai.aims.media;

import java.util.Comparator;


public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        if (media1 == null && media2 == null) {
            return 0;
        } else if (media1 == null) {
            return -1;
        } else if (media2 == null) {
            return 1;
        }
        
        int result = Float.compare(media1.getCost(), media2.getCost());
        if (result == 0) {
            result = media1.getTitle().compareTo(media2.getTitle());
        }
        return result;
    }
}
