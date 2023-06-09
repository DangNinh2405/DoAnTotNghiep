package com.example.app3do.models.personal;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class IdentityPersonal implements Serializable {

    @SerializedName("number")
    private String number;

    @SerializedName("front_image")
    private String frontImage;

    @SerializedName("back_image")
    private String backImage;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(String frontImage) {
        this.frontImage = frontImage;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }
}
