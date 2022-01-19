package com.example.hm42;

public class Model {
    private int image;
    private String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
