package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Siddipet {

    @SerializedName("active")
    private  int siddipetactive;
    @SerializedName("confirmed")
    private  int siddipetconfirmed;
    @SerializedName("deceased")
    private int siddipetdeceased;
    @SerializedName("recovered")
    private  int siddipetrecovered;

    public Siddipet(int siddipetactive, int siddipetconfirmed, int siddipetdeceased, int siddipetrecovered) {
        this.siddipetactive = siddipetactive;
        this.siddipetconfirmed = siddipetconfirmed;
        this.siddipetdeceased = siddipetdeceased;
        this.siddipetrecovered = siddipetrecovered;
    }

    public int getSiddipetactive() {
        return siddipetactive;
    }

    public void setSiddipetactive(int siddipetactive) {
        this.siddipetactive = siddipetactive;
    }

    public int getSiddipetconfirmed() {
        return siddipetconfirmed;
    }

    public void setSiddipetconfirmed(int siddipetconfirmed) {
        this.siddipetconfirmed = siddipetconfirmed;
    }

    public int getSiddipetdeceased() {
        return siddipetdeceased;
    }

    public void setSiddipetdeceased(int siddipetdeceased) {
        this.siddipetdeceased = siddipetdeceased;
    }

    public int getSiddipetrecovered() {
        return siddipetrecovered;
    }

    public void setSiddipetrecovered(int siddipetrecovered) {
        this.siddipetrecovered = siddipetrecovered;
    }
}


