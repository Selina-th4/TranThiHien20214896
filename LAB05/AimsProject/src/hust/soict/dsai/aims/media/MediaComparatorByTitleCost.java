package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        if (media1 == null && media2 == null) {
            return 0;
        } else if (media1 == null) {
            return -1;
        } else if (media2 == null) {
            return 1;
        }
        
        int result = media1.getTitle().compareTo(media2.getTitle());
        if (result == 0) {
            result = Float.compare(media1.getCost(), media2.getCost());
        }
        return result;
    }
}
