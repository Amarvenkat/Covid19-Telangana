package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Suryapet {

    @SerializedName("active")
    private  int suryapetactive;
    @SerializedName("confirmed")
    private  int suryapetconfirmed;
    @SerializedName("deceased")
    private int suryapetdeceased;
    @SerializedName("recovered")
    private  int suryapetrecovered;

    public Suryapet(int suryapetactive, int suryapetconfirmed, int suryapetdeceased, int suryapetrecovered) {
        this.suryapetactive = suryapetactive;
        this.suryapetconfirmed = suryapetconfirmed;
        this.suryapetdeceased = suryapetdeceased;
        this.suryapetrecovered = suryapetrecovered;
    }

    public int getSuryapetactive() {
        return suryapetactive;
    }

    public void setSuryapetactive(int suryapetactive) {
        this.suryapetactive = suryapetactive;
    }

    public int getSuryapetconfirmed() {
        return suryapetconfirmed;
    }

    public void setSuryapetconfirmed(int suryapetconfirmed) {
        this.suryapetconfirmed = suryapetconfirmed;
    }

    public int getSuryapetdeceased() {
        return suryapetdeceased;
    }

    public void setSuryapetdeceased(int suryapetdeceased) {
        this.suryapetdeceased = suryapetdeceased;
    }

    public int getSuryapetrecovered() {
        return suryapetrecovered;
    }

    public void setSuryapetrecovered(int suryapetrecovered) {
        this.suryapetrecovered = suryapetrecovered;
    }
}
