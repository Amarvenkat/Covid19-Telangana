package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Nalgonda {

    @SerializedName("active")
    private  int nalgondaactive;
    @SerializedName("confirmed")
    private  int nalgondaconfirmed;
    @SerializedName("deceased")
    private int nalgondadeceased;
    @SerializedName("recovered")
    private  int nalgondarecovered;

    public Nalgonda(int nalgondaactive, int nalgondaconfirmed, int nalgondadeceased, int nalgondarecovered) {
        this.nalgondaactive = nalgondaactive;
        this.nalgondaconfirmed = nalgondaconfirmed;
        this.nalgondadeceased = nalgondadeceased;
        this.nalgondarecovered = nalgondarecovered;
    }

    public int getNalgondaactive() {
        return nalgondaactive;
    }

    public void setNalgondaactive(int nalgondaactive) {
        this.nalgondaactive = nalgondaactive;
    }

    public int getNalgondaconfirmed() {
        return nalgondaconfirmed;
    }

    public void setNalgondaconfirmed(int nalgondaconfirmed) {
        this.nalgondaconfirmed = nalgondaconfirmed;
    }

    public int getNalgondadeceased() {
        return nalgondadeceased;
    }

    public void setNalgondadeceased(int nalgondadeceased) {
        this.nalgondadeceased = nalgondadeceased;
    }

    public int getNalgondarecovered() {
        return nalgondarecovered;
    }

    public void setNalgondarecovered(int nalgondarecovered) {
        this.nalgondarecovered = nalgondarecovered;
    }
}
