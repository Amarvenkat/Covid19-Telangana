package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Khammam {

    @SerializedName("active")
    private  int khammamactive;
    @SerializedName("confirmed")
    private  int khammamconfirmed;
    @SerializedName("deceased")
    private int khammamdeceased;
    @SerializedName("recovered")
    private  int khammamrecovered;

    public Khammam(int khammamactive, int khammamconfirmed, int khammamdeceased, int khammamrecovered) {
        this.khammamactive = khammamactive;
        this.khammamconfirmed = khammamconfirmed;
        this.khammamdeceased = khammamdeceased;
        this.khammamrecovered = khammamrecovered;
    }

    public int getKhammamactive() {
        return khammamactive;
    }

    public void setKhammamactive(int khammamactive) {
        this.khammamactive = khammamactive;
    }

    public int getKhammamconfirmed() {
        return khammamconfirmed;
    }

    public void setKhammamconfirmed(int khammamconfirmed) {
        this.khammamconfirmed = khammamconfirmed;
    }

    public int getKhammamdeceased() {
        return khammamdeceased;
    }

    public void setKhammamdeceased(int khammamdeceased) {
        this.khammamdeceased = khammamdeceased;
    }

    public int getKhammamrecovered() {
        return khammamrecovered;
    }

    public void setKhammamrecovered(int khammamrecovered) {
        this.khammamrecovered = khammamrecovered;
    }
}
