package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Karimnagar {

    @SerializedName("active")
    private  int karimnagaractive;
    @SerializedName("confirmed")
    private  int karimnagarconfirmed;
    @SerializedName("deceased")
    private int karimnagardeceased;
    @SerializedName("recovered")
    private  int karimnagarrecovered;

    public Karimnagar(int karimnagaractive, int karimnagarconfirmed, int karimnagardeceased, int karimnagarrecovered) {
        this.karimnagaractive = karimnagaractive;
        this.karimnagarconfirmed = karimnagarconfirmed;
        this.karimnagardeceased = karimnagardeceased;
        this.karimnagarrecovered = karimnagarrecovered;
    }

    public int getKarimnagaractive() {
        return karimnagaractive;
    }

    public void setKarimnagaractive(int karimnagaractive) {
        this.karimnagaractive = karimnagaractive;
    }

    public int getKarimnagarconfirmed() {
        return karimnagarconfirmed;
    }

    public void setKarimnagarconfirmed(int karimnagarconfirmed) {
        this.karimnagarconfirmed = karimnagarconfirmed;
    }

    public int getKarimnagardeceased() {
        return karimnagardeceased;
    }

    public void setKarimnagardeceased(int karimnagardeceased) {
        this.karimnagardeceased = karimnagardeceased;
    }

    public int getKarimnagarrecovered() {
        return karimnagarrecovered;
    }

    public void setKarimnagarrecovered(int karimnagarrecovered) {
        this.karimnagarrecovered = karimnagarrecovered;
    }
}
