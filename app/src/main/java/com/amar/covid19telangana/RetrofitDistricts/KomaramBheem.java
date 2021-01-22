package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class KomaramBheem {

    @SerializedName("active")
    private  int komaramBheemactive;
    @SerializedName("confirmed")
    private  int komaramBheemconfirmed;
    @SerializedName("deceased")
    private int komaramBheemdeceased;
    @SerializedName("recovered")
    private  int komaramBheemrecovered;

    public KomaramBheem(int komaramBheemactive, int komaramBheemconfirmed, int komaramBheemdeceased, int komaramBheemrecovered) {
        this.komaramBheemactive = komaramBheemactive;
        this.komaramBheemconfirmed = komaramBheemconfirmed;
        this.komaramBheemdeceased = komaramBheemdeceased;
        this.komaramBheemrecovered = komaramBheemrecovered;
    }

    public int getKomaramBheemactive() {
        return komaramBheemactive;
    }

    public void setKomaramBheemactive(int komaramBheemactive) {
        this.komaramBheemactive = komaramBheemactive;
    }

    public int getKomaramBheemconfirmed() {
        return komaramBheemconfirmed;
    }

    public void setKomaramBheemconfirmed(int komaramBheemconfirmed) {
        this.komaramBheemconfirmed = komaramBheemconfirmed;
    }

    public int getKomaramBheemdeceased() {
        return komaramBheemdeceased;
    }

    public void setKomaramBheemdeceased(int komaramBheemdeceased) {
        this.komaramBheemdeceased = komaramBheemdeceased;
    }

    public int getKomaramBheemrecovered() {
        return komaramBheemrecovered;
    }

    public void setKomaramBheemrecovered(int komaramBheemrecovered) {
        this.komaramBheemrecovered = komaramBheemrecovered;
    }
}

