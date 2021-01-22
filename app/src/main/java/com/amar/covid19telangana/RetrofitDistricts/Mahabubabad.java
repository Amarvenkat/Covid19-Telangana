package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Mahabubabad {

    @SerializedName("active")
    private  int mahabubabadactive;
    @SerializedName("confirmed")
    private  int mahabubabadconfirmed;
    @SerializedName("deceased")
    private int mahabubabaddeceased;
    @SerializedName("recovered")
    private  int mahabubabadrecovered;

    public Mahabubabad(int mahabubabadactive, int mahabubabadconfirmed, int mahabubabaddeceased, int mahabubabadrecovered) {
        this.mahabubabadactive = mahabubabadactive;
        this.mahabubabadconfirmed = mahabubabadconfirmed;
        this.mahabubabaddeceased = mahabubabaddeceased;
        this.mahabubabadrecovered = mahabubabadrecovered;
    }

    public int getMahabubabadactive() {
        return mahabubabadactive;
    }

    public void setMahabubabadactive(int mahabubabadactive) {
        this.mahabubabadactive = mahabubabadactive;
    }

    public int getMahabubabadconfirmed() {
        return mahabubabadconfirmed;
    }

    public void setMahabubabadconfirmed(int mahabubabadconfirmed) {
        this.mahabubabadconfirmed = mahabubabadconfirmed;
    }

    public int getMahabubabaddeceased() {
        return mahabubabaddeceased;
    }

    public void setMahabubabaddeceased(int mahabubabaddeceased) {
        this.mahabubabaddeceased = mahabubabaddeceased;
    }

    public int getMahabubabadrecovered() {
        return mahabubabadrecovered;
    }

    public void setMahabubabadrecovered(int mahabubabadrecovered) {
        this.mahabubabadrecovered = mahabubabadrecovered;
    }
}
