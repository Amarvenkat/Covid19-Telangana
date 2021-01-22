package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Mulugu {

    @SerializedName("active")
    private  int muluguactive;
    @SerializedName("confirmed")
    private  int muluguconfirmed;
    @SerializedName("deceased")
    private int mulugudeceased;
    @SerializedName("recovered")
    private  int mulugurecovered;

    public Mulugu(int muluguactive, int muluguconfirmed, int mulugudeceased, int mulugurecovered) {
        this.muluguactive = muluguactive;
        this.muluguconfirmed = muluguconfirmed;
        this.mulugudeceased = mulugudeceased;
        this.mulugurecovered = mulugurecovered;
    }

    public int getMuluguactive() {
        return muluguactive;
    }

    public void setMuluguactive(int muluguactive) {
        this.muluguactive = muluguactive;
    }

    public int getMuluguconfirmed() {
        return muluguconfirmed;
    }

    public void setMuluguconfirmed(int muluguconfirmed) {
        this.muluguconfirmed = muluguconfirmed;
    }

    public int getMulugudeceased() {
        return mulugudeceased;
    }

    public void setMulugudeceased(int mulugudeceased) {
        this.mulugudeceased = mulugudeceased;
    }

    public int getMulugurecovered() {
        return mulugurecovered;
    }

    public void setMulugurecovered(int mulugurecovered) {
        this.mulugurecovered = mulugurecovered;
    }
}
