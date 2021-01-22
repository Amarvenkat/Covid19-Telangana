package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Sangareddy {

    @SerializedName("active")
    private  int sangareddyactive;
    @SerializedName("confirmed")
    private  int sangareddyconfirmed;
    @SerializedName("deceased")
    private int sangareddydeceased;
    @SerializedName("recovered")
    private  int sangareddyrecovered;

    public Sangareddy(int sangareddyactive, int sangareddyconfirmed, int sangareddydeceased, int sangareddyrecovered) {
        this.sangareddyactive = sangareddyactive;
        this.sangareddyconfirmed = sangareddyconfirmed;
        this.sangareddydeceased = sangareddydeceased;
        this.sangareddyrecovered = sangareddyrecovered;
    }

    public int getSangareddyactive() {
        return sangareddyactive;
    }

    public void setSangareddyactive(int sangareddyactive) {
        this.sangareddyactive = sangareddyactive;
    }

    public int getSangareddyconfirmed() {
        return sangareddyconfirmed;
    }

    public void setSangareddyconfirmed(int sangareddyconfirmed) {
        this.sangareddyconfirmed = sangareddyconfirmed;
    }

    public int getSangareddydeceased() {
        return sangareddydeceased;
    }

    public void setSangareddydeceased(int sangareddydeceased) {
        this.sangareddydeceased = sangareddydeceased;
    }

    public int getSangareddyrecovered() {
        return sangareddyrecovered;
    }

    public void setSangareddyrecovered(int sangareddyrecovered) {
        this.sangareddyrecovered = sangareddyrecovered;
    }
}
