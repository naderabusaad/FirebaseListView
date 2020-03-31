package com.example.firebaselistview;

import android.widget.ImageView;

public class ListImage {
    String imageName;
    int imageId;

    public ListImage() {
    }

    public ListImage(String name, int imgId)
    {
        this.imageName = name;
        this.imageId = imgId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
