package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Jagtial {

    @SerializedName("active")
    private  int jagtialactive;
    @SerializedName("confirmed")
    private  int jagtialconfirmed;
    @SerializedName("deceased")
    private int jagtialdeceased;
    @SerializedName("recovered")
    private  int jagtialrecovered;

    public Jagtial(int jagtialactive, int jagtialconfirmed, int jagtialdeceased, int jagtialrecovered) {
        this.jagtialactive = jagtialactive;
        this.jagtialconfirmed = jagtialconfirmed;
        this.jagtialdeceased = jagtialdeceased;
        this.jagtialrecovered = jagtialrecovered;
    }

    public int getJagtialactive() {
        return jagtialactive;
    }

    public void setJagtialactive(int jagtialactive) {
        this.jagtialactive = jagtialactive;
    }

    public int getJagtialconfirmed() {
        return jagtialconfirmed;
    }

    public void setJagtialconfirmed(int jagtialconfirmed) {
        this.jagtialconfirmed = jagtialconfirmed;
    }

    public int getJagtialdeceased() {
        return jagtialdeceased;
    }

    public void setJagtialdeceased(int jagtialdeceased) {
        this.jagtialdeceased = jagtialdeceased;
    }

    public int getJagtialrecovered() {
        return jagtialrecovered;
    }

    public void setJagtialrecovered(int jagtialrecovered) {
        this.jagtialrecovered = jagtialrecovered;
    }
}
