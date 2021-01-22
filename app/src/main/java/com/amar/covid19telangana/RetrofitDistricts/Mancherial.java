package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Mancherial {

    @SerializedName("active")
    private  int mancherialactive;
    @SerializedName("confirmed")
    private  int mancherialconfirmed;
    @SerializedName("deceased")
    private int mancherialdeceased;
    @SerializedName("recovered")
    private  int mancherialrecovered;

    public Mancherial(int mancherialactive, int mancherialconfirmed, int mancherialdeceased, int mancherialrecovered) {
        this.mancherialactive = mancherialactive;
        this.mancherialconfirmed = mancherialconfirmed;
        this.mancherialdeceased = mancherialdeceased;
        this.mancherialrecovered = mancherialrecovered;
    }

    public int getMancherialactive() {
        return mancherialactive;
    }

    public void setMancherialactive(int mancherialactive) {
        this.mancherialactive = mancherialactive;
    }

    public int getMancherialconfirmed() {
        return mancherialconfirmed;
    }

    public void setMancherialconfirmed(int mancherialconfirmed) {
        this.mancherialconfirmed = mancherialconfirmed;
    }

    public int getMancherialdeceased() {
        return mancherialdeceased;
    }

    public void setMancherialdeceased(int mancherialdeceased) {
        this.mancherialdeceased = mancherialdeceased;
    }

    public int getMancherialrecovered() {
        return mancherialrecovered;
    }

    public void setMancherialrecovered(int mancherialrecovered) {
        this.mancherialrecovered = mancherialrecovered;
    }
}
