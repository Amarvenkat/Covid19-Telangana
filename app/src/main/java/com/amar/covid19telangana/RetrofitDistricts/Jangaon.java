package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Jangaon {

    @SerializedName("active")
    private  int jangaonactive;
    @SerializedName("confirmed")
    private  int jangaonconfirmed;
    @SerializedName("deceased")
    private int jangaondeceased;
    @SerializedName("recovered")
    private  int jangaonrecovered;

    public Jangaon(int jangaonactive, int jangaonconfirmed, int jangaondeceased, int jangaonrecovered) {
        this.jangaonactive = jangaonactive;
        this.jangaonconfirmed = jangaonconfirmed;
        this.jangaondeceased = jangaondeceased;
        this.jangaonrecovered = jangaonrecovered;
    }

    public int getJangaonactive() {
        return jangaonactive;
    }

    public void setJangaonactive(int jangaonactive) {
        this.jangaonactive = jangaonactive;
    }

    public int getJangaonconfirmed() {
        return jangaonconfirmed;
    }

    public void setJangaonconfirmed(int jangaonconfirmed) {
        this.jangaonconfirmed = jangaonconfirmed;
    }

    public int getJangaondeceased() {
        return jangaondeceased;
    }

    public void setJangaondeceased(int jangaondeceased) {
        this.jangaondeceased = jangaondeceased;
    }

    public int getJangaonrecovered() {
        return jangaonrecovered;
    }

    public void setJangaonrecovered(int jangaonrecovered) {
        this.jangaonrecovered = jangaonrecovered;
    }
}
