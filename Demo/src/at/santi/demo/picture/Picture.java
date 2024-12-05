package at.santi.demo.picture;

import java.util.Date;

public class Picture {
    private String name;
    private Date date;
    private int size; // Size in GB based on the resolution (2GB, 4GB, 6GB)

    // Constructor
    public Picture(String name, Date date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }
}
