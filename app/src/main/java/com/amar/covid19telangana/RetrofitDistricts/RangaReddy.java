package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class RangaReddy {

    @SerializedName("active")
    private  int rangaReddyactive;
    @SerializedName("confirmed")
    private  int rangaReddyconfirmed;
    @SerializedName("deceased")
    private int rangaReddydeceased;
    @SerializedName("recovered")
    private  int rangaReddyrecovered;

    public RangaReddy(int rangaReddyactive, int rangaReddyconfirmed, int rangaReddydeceased, int rangaReddyrecovered) {
        this.rangaReddyactive = rangaReddyactive;
        this.rangaReddyconfirmed = rangaReddyconfirmed;
        this.rangaReddydeceased = rangaReddydeceased;
        this.rangaReddyrecovered = rangaReddyrecovered;
    }

    public int getRangaReddyactive() {
        return rangaReddyactive;
    }

    public void setRangaReddyactive(int rangaReddyactive) {
        this.rangaReddyactive = rangaReddyactive;
    }

    public int getRangaReddyconfirmed() {
        return rangaReddyconfirmed;
    }

    public void setRangaReddyconfirmed(int rangaReddyconfirmed) {
        this.rangaReddyconfirmed = rangaReddyconfirmed;
    }

    public int getRangaReddydeceased() {
        return rangaReddydeceased;
    }

    public void setRangaReddydeceased(int rangaReddydeceased) {
        this.rangaReddydeceased = rangaReddydeceased;
    }

    public int getRangaReddyrecovered() {
        return rangaReddyrecovered;
    }

    public void setRangaReddyrecovered(int rangaReddyrecovered) {
        this.rangaReddyrecovered = rangaReddyrecovered;
    }
}
