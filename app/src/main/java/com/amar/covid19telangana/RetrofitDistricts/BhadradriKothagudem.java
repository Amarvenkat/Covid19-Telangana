package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class BhadradriKothagudem {


    @SerializedName("active")
    private  int bhadradriKothagudemactive;
    @SerializedName("confirmed")
    private  int bhadradriKothagudemconfirmed;
    @SerializedName("deceased")
    private int bhadradriKothagudemdeceased;
    @SerializedName("recovered")
    private  int bhadradriKothagudemrecovered;

    public BhadradriKothagudem(int bhadradriKothagudemactive, int bhadradriKothagudemconfirmed, int bhadradriKothagudemdeceased, int bhadradriKothagudemrecovered) {
        this.bhadradriKothagudemactive = bhadradriKothagudemactive;
        this.bhadradriKothagudemconfirmed = bhadradriKothagudemconfirmed;
        this.bhadradriKothagudemdeceased = bhadradriKothagudemdeceased;
        this.bhadradriKothagudemrecovered = bhadradriKothagudemrecovered;
    }

    public int getBhadradriKothagudemactive() {
        return bhadradriKothagudemactive;
    }

    public void setBhadradriKothagudemactive(int bhadradriKothagudemactive) {
        this.bhadradriKothagudemactive = bhadradriKothagudemactive;
    }

    public int getBhadradriKothagudemconfirmed() {
        return bhadradriKothagudemconfirmed;
    }

    public void setBhadradriKothagudemconfirmed(int bhadradriKothagudemconfirmed) {
        this.bhadradriKothagudemconfirmed = bhadradriKothagudemconfirmed;
    }

    public int getBhadradriKothagudemdeceased() {
        return bhadradriKothagudemdeceased;
    }

    public void setBhadradriKothagudemdeceased(int bhadradriKothagudemdeceased) {
        this.bhadradriKothagudemdeceased = bhadradriKothagudemdeceased;
    }

    public int getBhadradriKothagudemrecovered() {
        return bhadradriKothagudemrecovered;
    }

    public void setBhadradriKothagudemrecovered(int bhadradriKothagudemrecovered) {
        this.bhadradriKothagudemrecovered = bhadradriKothagudemrecovered;
    }
}
