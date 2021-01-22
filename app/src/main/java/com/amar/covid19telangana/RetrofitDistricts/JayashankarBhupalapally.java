package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class JayashankarBhupalapally {

    @SerializedName("active")
    private  int jayashankarBhupalapallyactive;
    @SerializedName("confirmed")
    private  int jayashankarBhupalapallyconfirmed;
    @SerializedName("deceased")
    private int jayashankarBhupalapallydeceased;
    @SerializedName("recovered")
    private  int jayashankarBhupalapallyrecovered;


    public JayashankarBhupalapally(int jayashankarBhupalapallyactive, int jayashankarBhupalapallyconfirmed, int jayashankarBhupalapallydeceased, int jayashankarBhupalapallyrecovered) {
        this.jayashankarBhupalapallyactive = jayashankarBhupalapallyactive;
        this.jayashankarBhupalapallyconfirmed = jayashankarBhupalapallyconfirmed;
        this.jayashankarBhupalapallydeceased = jayashankarBhupalapallydeceased;
        this.jayashankarBhupalapallyrecovered = jayashankarBhupalapallyrecovered;
    }

    public int getJayashankarBhupalapallyactive() {
        return jayashankarBhupalapallyactive;
    }

    public void setJayashankarBhupalapallyactive(int jayashankarBhupalapallyactive) {
        this.jayashankarBhupalapallyactive = jayashankarBhupalapallyactive;
    }

    public int getJayashankarBhupalapallyconfirmed() {
        return jayashankarBhupalapallyconfirmed;
    }

    public void setJayashankarBhupalapallyconfirmed(int jayashankarBhupalapallyconfirmed) {
        this.jayashankarBhupalapallyconfirmed = jayashankarBhupalapallyconfirmed;
    }

    public int getJayashankarBhupalapallydeceased() {
        return jayashankarBhupalapallydeceased;
    }

    public void setJayashankarBhupalapallydeceased(int jayashankarBhupalapallydeceased) {
        this.jayashankarBhupalapallydeceased = jayashankarBhupalapallydeceased;
    }

    public int getJayashankarBhupalapallyrecovered() {
        return jayashankarBhupalapallyrecovered;
    }

    public void setJayashankarBhupalapallyrecovered(int jayashankarBhupalapallyrecovered) {
        this.jayashankarBhupalapallyrecovered = jayashankarBhupalapallyrecovered;
    }
}
