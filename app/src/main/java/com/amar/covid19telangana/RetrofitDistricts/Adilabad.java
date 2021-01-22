package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Adilabad {

    @SerializedName("active")
    private  int adilabadactive;
    @SerializedName("confirmed")
    private  int adilabadconfirmed;
    @SerializedName("deceased")
    private int adilabaddeceased;
    @SerializedName("recovered")
    private  int adilabadrecovered;

    public Adilabad(int adilabadactive, int adilabadconfirmed, int adilabaddeceased, int adilabadrecovered) {
        this.adilabadactive = adilabadactive;
        this.adilabadconfirmed = adilabadconfirmed;
        this.adilabaddeceased = adilabaddeceased;
        this.adilabadrecovered = adilabadrecovered;
    }

    public int getAdilabadactive() {
        return adilabadactive;
    }

    public void setAdilabadactive(int adilabadactive) {
        this.adilabadactive = adilabadactive;
    }

    public int getAdilabadconfirmed() {
        return adilabadconfirmed;
    }

    public void setAdilabadconfirmed(int adilabadconfirmed) {
        this.adilabadconfirmed = adilabadconfirmed;
    }

    public int getAdilabaddeceased() {
        return adilabaddeceased;
    }

    public void setAdilabaddeceased(int adilabaddeceased) {
        this.adilabaddeceased = adilabaddeceased;
    }

    public int getAdilabadrecovered() {
        return adilabadrecovered;
    }

    public void setAdilabadrecovered(int adilabadrecovered) {
        this.adilabadrecovered = adilabadrecovered;
    }
}
