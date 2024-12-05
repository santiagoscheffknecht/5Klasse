package at.santi.demo;

import at.santi.demo.objective.Objective; 
import at.santi.demo.picture.Picture; 
import at.santi.demo.sdCard.SDCard;

import java.util.Date;

public class Cam {
    // Camera properties
    private int id;
    private String manufacturerName;
    private String manufacturerCountry;
    private int pixels;
    private double weight;
    private String color;

    
    private Objective objective;

    private SDCard sdCard;

    // Photo settings
    private String resolutionSetting; 

    // Constructor for Cam class
    public Cam(int id, String manufacturerName, String manufacturerCountry, int pixels, double weight, String color,
            Objective objective, SDCard sdCard, String resolutionSetting) {
        this.id = id;
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
        this.pixels = pixels;
        this.weight = weight;
        this.color = color;
        this.objective = objective;
        this.sdCard = sdCard;
        this.resolutionSetting = resolutionSetting;
    }

    // Method to take a picture
    public void takePicture(String name) {
        int pictureSize = 0;

        // Determine picture size based on resolution setting
        switch (resolutionSetting) {
            case "small":
                pictureSize = 2;
                break;
            case "medium":
                pictureSize = 4;
                break;
            case "large":
                pictureSize = 6;
                break;
        }

        if (sdCard != null) {
            if (sdCard.getRemainingCapacity() >= pictureSize) {
                Picture picture = new Picture(name, new Date(), pictureSize);
                sdCard.storePicture(picture);
                System.out.println("Picture taken: " + picture.getName());
            } else {
                System.out.println("Warning: Not enough storage space. Please insert a new SD card.");
            }
        } else {
            System.out.println("No SD card inserted. Cannot take picture.");
        }
    }

    // Getters and setters omitted for brevity...
}
