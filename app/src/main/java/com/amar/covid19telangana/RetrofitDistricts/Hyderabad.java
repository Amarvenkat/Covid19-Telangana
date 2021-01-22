package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Hyderabad {

    @SerializedName("active")
    private  int hyderabadactive;
    @SerializedName("confirmed")
    private  int hyderabadconfirmed;
    @SerializedName("deceased")
    private int hyderabaddeceased;
    @SerializedName("recovered")
    private  int hyderabadrecovered;

    public Hyderabad(int hyderabadactive, int hyderabadconfirmed, int hyderabaddeceased, int hyderabadrecovered) {
        this.hyderabadactive = hyderabadactive;
        this.hyderabadconfirmed = hyderabadconfirmed;
        this.hyderabaddeceased = hyderabaddeceased;
        this.hyderabadrecovered = hyderabadrecovered;
    }

    public int getHyderabadactive() {
        return hyderabadactive;
    }

    public void setHyderabadactive(int hyderabadactive) {
        this.hyderabadactive = hyderabadactive;
    }

    public int getHyderabadconfirmed() {
        return hyderabadconfirmed;
    }

    public void setHyderabadconfirmed(int hyderabadconfirmed) {
        this.hyderabadconfirmed = hyderabadconfirmed;
    }

    public int getHyderabaddeceased() {
        return hyderabaddeceased;
    }

    public void setHyderabaddeceased(int hyderabaddeceased) {
        this.hyderabaddeceased = hyderabaddeceased;
    }

    public int getHyderabadrecovered() {
        return hyderabadrecovered;
    }

    public void setHyderabadrecovered(int hyderabadrecovered) {
        this.hyderabadrecovered = hyderabadrecovered;
    }
}
