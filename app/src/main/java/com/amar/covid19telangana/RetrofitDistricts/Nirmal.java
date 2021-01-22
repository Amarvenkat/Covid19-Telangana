package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Nirmal {

    @SerializedName("active")
    private  int nirmalactive;
    @SerializedName("confirmed")
    private  int nirmalconfirmed;
    @SerializedName("deceased")
    private int nirmaldeceased;
    @SerializedName("recovered")
    private  int nirmalrecovered;

    public Nirmal(int nirmalactive, int nirmalconfirmed, int nirmaldeceased, int nirmalrecovered) {
        this.nirmalactive = nirmalactive;
        this.nirmalconfirmed = nirmalconfirmed;
        this.nirmaldeceased = nirmaldeceased;
        this.nirmalrecovered = nirmalrecovered;
    }

    public int getNirmalactive() {
        return nirmalactive;
    }

    public void setNirmalactive(int nirmalactive) {
        this.nirmalactive = nirmalactive;
    }

    public int getNirmalconfirmed() {
        return nirmalconfirmed;
    }

    public void setNirmalconfirmed(int nirmalconfirmed) {
        this.nirmalconfirmed = nirmalconfirmed;
    }

    public int getNirmaldeceased() {
        return nirmaldeceased;
    }

    public void setNirmaldeceased(int nirmaldeceased) {
        this.nirmaldeceased = nirmaldeceased;
    }

    public int getNirmalrecovered() {
        return nirmalrecovered;
    }

    public void setNirmalrecovered(int nirmalrecovered) {
        this.nirmalrecovered = nirmalrecovered;
    }
}
