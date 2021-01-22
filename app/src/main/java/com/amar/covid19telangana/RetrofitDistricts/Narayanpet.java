package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Narayanpet {


    @SerializedName("active")
    private  int narayanpetactive;
    @SerializedName("confirmed")
    private  int narayanpetconfirmed;
    @SerializedName("deceased")
    private int narayanpetdeceased;
    @SerializedName("recovered")
    private  int narayanpetrecovered;

    public Narayanpet(int narayanpetactive, int narayanpetconfirmed, int narayanpetdeceased, int narayanpetrecovered) {
        this.narayanpetactive = narayanpetactive;
        this.narayanpetconfirmed = narayanpetconfirmed;
        this.narayanpetdeceased = narayanpetdeceased;
        this.narayanpetrecovered = narayanpetrecovered;
    }

    public int getNarayanpetactive() {
        return narayanpetactive;
    }

    public void setNarayanpetactive(int narayanpetactive) {
        this.narayanpetactive = narayanpetactive;
    }

    public int getNarayanpetconfirmed() {
        return narayanpetconfirmed;
    }

    public void setNarayanpetconfirmed(int narayanpetconfirmed) {
        this.narayanpetconfirmed = narayanpetconfirmed;
    }

    public int getNarayanpetdeceased() {
        return narayanpetdeceased;
    }

    public void setNarayanpetdeceased(int narayanpetdeceased) {
        this.narayanpetdeceased = narayanpetdeceased;
    }

    public int getNarayanpetrecovered() {
        return narayanpetrecovered;
    }

    public void setNarayanpetrecovered(int narayanpetrecovered) {
        this.narayanpetrecovered = narayanpetrecovered;
    }
}
