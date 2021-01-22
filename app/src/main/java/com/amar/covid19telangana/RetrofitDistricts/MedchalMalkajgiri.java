package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class MedchalMalkajgiri {

    @SerializedName("active")
    private  int medchalMalkajgiriactive;
    @SerializedName("confirmed")
    private  int medchalMalkajgiriconfirmed;
    @SerializedName("deceased")
    private int medchalMalkajgirideceased;
    @SerializedName("recovered")
    private  int medchalMalkajgirirecovered;

    public MedchalMalkajgiri(int medchalMalkajgiriactive, int medchalMalkajgiriconfirmed, int medchalMalkajgirideceased, int medchalMalkajgirirecovered) {
        this.medchalMalkajgiriactive = medchalMalkajgiriactive;
        this.medchalMalkajgiriconfirmed = medchalMalkajgiriconfirmed;
        this.medchalMalkajgirideceased = medchalMalkajgirideceased;
        this.medchalMalkajgirirecovered = medchalMalkajgirirecovered;
    }

    public int getMedchalMalkajgiriactive() {
        return medchalMalkajgiriactive;
    }

    public void setMedchalMalkajgiriactive(int medchalMalkajgiriactive) {
        this.medchalMalkajgiriactive = medchalMalkajgiriactive;
    }

    public int getMedchalMalkajgiriconfirmed() {
        return medchalMalkajgiriconfirmed;
    }

    public void setMedchalMalkajgiriconfirmed(int medchalMalkajgiriconfirmed) {
        this.medchalMalkajgiriconfirmed = medchalMalkajgiriconfirmed;
    }

    public int getMedchalMalkajgirideceased() {
        return medchalMalkajgirideceased;
    }

    public void setMedchalMalkajgirideceased(int medchalMalkajgirideceased) {
        this.medchalMalkajgirideceased = medchalMalkajgirideceased;
    }

    public int getMedchalMalkajgirirecovered() {
        return medchalMalkajgirirecovered;
    }

    public void setMedchalMalkajgirirecovered(int medchalMalkajgirirecovered) {
        this.medchalMalkajgirirecovered = medchalMalkajgirirecovered;
    }
}
