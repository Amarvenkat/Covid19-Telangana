package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Vikarabad {

    @SerializedName("active")
    private  int vikarabadactive;
    @SerializedName("confirmed")
    private  int vikarabadconfirmed;
    @SerializedName("deceased")
    private int vikarabaddeceased;
    @SerializedName("recovered")
    private  int vikarabadrecovered;

    public Vikarabad(int vikarabadactive, int vikarabadconfirmed, int vikarabaddeceased, int vikarabadrecovered) {
        this.vikarabadactive = vikarabadactive;
        this.vikarabadconfirmed = vikarabadconfirmed;
        this.vikarabaddeceased = vikarabaddeceased;
        this.vikarabadrecovered = vikarabadrecovered;
    }

    public int getVikarabadactive() {
        return vikarabadactive;
    }

    public void setVikarabadactive(int vikarabadactive) {
        this.vikarabadactive = vikarabadactive;
    }

    public int getVikarabadconfirmed() {
        return vikarabadconfirmed;
    }

    public void setVikarabadconfirmed(int vikarabadconfirmed) {
        this.vikarabadconfirmed = vikarabadconfirmed;
    }

    public int getVikarabaddeceased() {
        return vikarabaddeceased;
    }

    public void setVikarabaddeceased(int vikarabaddeceased) {
        this.vikarabaddeceased = vikarabaddeceased;
    }

    public int getVikarabadrecovered() {
        return vikarabadrecovered;
    }

    public void setVikarabadrecovered(int vikarabadrecovered) {
        this.vikarabadrecovered = vikarabadrecovered;
    }
}
