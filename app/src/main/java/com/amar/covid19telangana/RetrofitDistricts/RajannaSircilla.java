package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class RajannaSircilla {

    @SerializedName("active")
    private  int rajannaSircillaactive;
    @SerializedName("confirmed")
    private  int rajannaSircillaconfirmed;
    @SerializedName("deceased")
    private int rajannaSircilladeceased;
    @SerializedName("recovered")
    private  int rajannaSircillarecovered;

    public RajannaSircilla(int rajannaSircillaactive, int rajannaSircillaconfirmed, int rajannaSircilladeceased, int rajannaSircillarecovered) {
        this.rajannaSircillaactive = rajannaSircillaactive;
        this.rajannaSircillaconfirmed = rajannaSircillaconfirmed;
        this.rajannaSircilladeceased = rajannaSircilladeceased;
        this.rajannaSircillarecovered = rajannaSircillarecovered;
    }

    public int getRajannaSircillaactive() {
        return rajannaSircillaactive;
    }

    public void setRajannaSircillaactive(int rajannaSircillaactive) {
        this.rajannaSircillaactive = rajannaSircillaactive;
    }

    public int getRajannaSircillaconfirmed() {
        return rajannaSircillaconfirmed;
    }

    public void setRajannaSircillaconfirmed(int rajannaSircillaconfirmed) {
        this.rajannaSircillaconfirmed = rajannaSircillaconfirmed;
    }

    public int getRajannaSircilladeceased() {
        return rajannaSircilladeceased;
    }

    public void setRajannaSircilladeceased(int rajannaSircilladeceased) {
        this.rajannaSircilladeceased = rajannaSircilladeceased;
    }

    public int getRajannaSircillarecovered() {
        return rajannaSircillarecovered;
    }

    public void setRajannaSircillarecovered(int rajannaSircillarecovered) {
        this.rajannaSircillarecovered = rajannaSircillarecovered;
    }
}
