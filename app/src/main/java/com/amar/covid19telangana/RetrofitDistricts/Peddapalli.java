package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Peddapalli {

    @SerializedName("active")
    private  int peddapalliactive;
    @SerializedName("confirmed")
    private  int peddapalliconfirmed;
    @SerializedName("deceased")
    private int peddapallideceased;
    @SerializedName("recovered")
    private  int peddapallirecovered;

    public Peddapalli(int peddapalliactive, int peddapalliconfirmed, int peddapallideceased, int peddapallirecovered) {
        this.peddapalliactive = peddapalliactive;
        this.peddapalliconfirmed = peddapalliconfirmed;
        this.peddapallideceased = peddapallideceased;
        this.peddapallirecovered = peddapallirecovered;
    }

    public int getPeddapalliactive() {
        return peddapalliactive;
    }

    public void setPeddapalliactive(int peddapalliactive) {
        this.peddapalliactive = peddapalliactive;
    }

    public int getPeddapalliconfirmed() {
        return peddapalliconfirmed;
    }

    public void setPeddapalliconfirmed(int peddapalliconfirmed) {
        this.peddapalliconfirmed = peddapalliconfirmed;
    }

    public int getPeddapallideceased() {
        return peddapallideceased;
    }

    public void setPeddapallideceased(int peddapallideceased) {
        this.peddapallideceased = peddapallideceased;
    }

    public int getPeddapallirecovered() {
        return peddapallirecovered;
    }

    public void setPeddapallirecovered(int peddapallirecovered) {
        this.peddapallirecovered = peddapallirecovered;
    }
}
