package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Mahabubnagar {

    @SerializedName("active")
    private  int mahabubnagaractive;
    @SerializedName("confirmed")
    private  int mahabubnagarconfirmed;
    @SerializedName("deceased")
    private int mahabubnagardeceased;
    @SerializedName("recovered")
    private  int mahabubnagarrecovered;

    public Mahabubnagar(int mahabubnagaractive, int mahabubnagarconfirmed, int mahabubnagardeceased, int mahabubnagarrecovered) {
        this.mahabubnagaractive = mahabubnagaractive;
        this.mahabubnagarconfirmed = mahabubnagarconfirmed;
        this.mahabubnagardeceased = mahabubnagardeceased;
        this.mahabubnagarrecovered = mahabubnagarrecovered;
    }

    public int getMahabubnagaractive() {
        return mahabubnagaractive;
    }

    public void setMahabubnagaractive(int mahabubnagaractive) {
        this.mahabubnagaractive = mahabubnagaractive;
    }

    public int getMahabubnagarconfirmed() {
        return mahabubnagarconfirmed;
    }

    public void setMahabubnagarconfirmed(int mahabubnagarconfirmed) {
        this.mahabubnagarconfirmed = mahabubnagarconfirmed;
    }

    public int getMahabubnagardeceased() {
        return mahabubnagardeceased;
    }

    public void setMahabubnagardeceased(int mahabubnagardeceased) {
        this.mahabubnagardeceased = mahabubnagardeceased;
    }

    public int getMahabubnagarrecovered() {
        return mahabubnagarrecovered;
    }

    public void setMahabubnagarrecovered(int mahabubnagarrecovered) {
        this.mahabubnagarrecovered = mahabubnagarrecovered;
    }
}
