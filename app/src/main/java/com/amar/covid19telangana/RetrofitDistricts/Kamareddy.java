package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Kamareddy {

    @SerializedName("active")
    private  int kamareddyactive;
    @SerializedName("confirmed")
    private  int kamareddyconfirmed;
    @SerializedName("deceased")
    private int kamareddydeceased;
    @SerializedName("recovered")
    private  int kamareddyrecovered;

    public Kamareddy(int kamareddyactive, int kamareddyconfirmed, int kamareddydeceased, int kamareddyrecovered) {
        this.kamareddyactive = kamareddyactive;
        this.kamareddyconfirmed = kamareddyconfirmed;
        this.kamareddydeceased = kamareddydeceased;
        this.kamareddyrecovered = kamareddyrecovered;
    }

    public int getKamareddyactive() {
        return kamareddyactive;
    }

    public void setKamareddyactive(int kamareddyactive) {
        this.kamareddyactive = kamareddyactive;
    }

    public int getKamareddyconfirmed() {
        return kamareddyconfirmed;
    }

    public void setKamareddyconfirmed(int kamareddyconfirmed) {
        this.kamareddyconfirmed = kamareddyconfirmed;
    }

    public int getKamareddydeceased() {
        return kamareddydeceased;
    }

    public void setKamareddydeceased(int kamareddydeceased) {
        this.kamareddydeceased = kamareddydeceased;
    }

    public int getKamareddyrecovered() {
        return kamareddyrecovered;
    }

    public void setKamareddyrecovered(int kamareddyrecovered) {
        this.kamareddyrecovered = kamareddyrecovered;
    }
}
