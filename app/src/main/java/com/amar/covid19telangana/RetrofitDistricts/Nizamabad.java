package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Nizamabad {

    @SerializedName("active")
    private  int nizamabadactive;
    @SerializedName("confirmed")
    private  int nizamabadconfirmed;
    @SerializedName("deceased")
    private int nizamabaddeceased;
    @SerializedName("recovered")
    private  int nizamabadrecovered;

    public Nizamabad(int nizamabadactive, int nizamabadconfirmed, int nizamabaddeceased, int nizamabadrecovered) {
        this.nizamabadactive = nizamabadactive;
        this.nizamabadconfirmed = nizamabadconfirmed;
        this.nizamabaddeceased = nizamabaddeceased;
        this.nizamabadrecovered = nizamabadrecovered;
    }

    public int getNizamabadactive() {
        return nizamabadactive;
    }

    public void setNizamabadactive(int nizamabadactive) {
        this.nizamabadactive = nizamabadactive;
    }

    public int getNizamabadconfirmed() {
        return nizamabadconfirmed;
    }

    public void setNizamabadconfirmed(int nizamabadconfirmed) {
        this.nizamabadconfirmed = nizamabadconfirmed;
    }

    public int getNizamabaddeceased() {
        return nizamabaddeceased;
    }

    public void setNizamabaddeceased(int nizamabaddeceased) {
        this.nizamabaddeceased = nizamabaddeceased;
    }

    public int getNizamabadrecovered() {
        return nizamabadrecovered;
    }

    public void setNizamabadrecovered(int nizamabadrecovered) {
        this.nizamabadrecovered = nizamabadrecovered;
    }
}
