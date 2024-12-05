package at.santi.demo.sdCard;

import java.util.ArrayList;
import java.util.List;

import at.santi.demo.picture.Picture;

public class SDCard {
    private int capacity;
    private List<Picture> pictures;

    // Constructor
    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    // Store a picture
    public void storePicture(Picture picture) {
        pictures.add(picture);
        capacity -= picture.getSize(); // Reduce the capacity by the picture size
    }

    // Get remaining capacity
    public int getRemainingCapacity() {
        return capacity;
    }

    // Getters and Setters
    public int getCapacity() {
        return capacity;
    }

    public List<Picture> getPictures() {
        return pictures;
    }
}
