package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class WarangalUrban {

    @SerializedName("active")
    private  int warangalUrbanactive;
    @SerializedName("confirmed")
    private  int warangalUrbanconfirmed;
    @SerializedName("deceased")
    private int warangalUrbandeceased;
    @SerializedName("recovered")
    private  int warangalUrbanrecovered;

    public WarangalUrban(int warangalUrbanactive, int warangalUrbanconfirmed, int warangalUrbandeceased, int warangalUrbanrecovered) {
        this.warangalUrbanactive = warangalUrbanactive;
        this.warangalUrbanconfirmed = warangalUrbanconfirmed;
        this.warangalUrbandeceased = warangalUrbandeceased;
        this.warangalUrbanrecovered = warangalUrbanrecovered;
    }

    public int getWarangalUrbanactive() {
        return warangalUrbanactive;
    }

    public void setWarangalUrbanactive(int warangalUrbanactive) {
        this.warangalUrbanactive = warangalUrbanactive;
    }

    public int getWarangalUrbanconfirmed() {
        return warangalUrbanconfirmed;
    }

    public void setWarangalUrbanconfirmed(int warangalUrbanconfirmed) {
        this.warangalUrbanconfirmed = warangalUrbanconfirmed;
    }

    public int getWarangalUrbandeceased() {
        return warangalUrbandeceased;
    }

    public void setWarangalUrbandeceased(int warangalUrbandeceased) {
        this.warangalUrbandeceased = warangalUrbandeceased;
    }

    public int getWarangalUrbanrecovered() {
        return warangalUrbanrecovered;
    }

    public void setWarangalUrbanrecovered(int warangalUrbanrecovered) {
        this.warangalUrbanrecovered = warangalUrbanrecovered;
    }
}
