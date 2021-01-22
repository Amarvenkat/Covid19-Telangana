package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Nagarkurnool {

    @SerializedName("active")
    private  int nagarkurnoolactive;
    @SerializedName("confirmed")
    private  int nagarkurnoolconfirmed;
    @SerializedName("deceased")
    private int nagarkurnooldeceased;
    @SerializedName("recovered")
    private  int nagarkurnoolrecovered;

    public Nagarkurnool(int nagarkurnoolactive, int nagarkurnoolconfirmed, int nagarkurnooldeceased, int nagarkurnoolrecovered) {
        this.nagarkurnoolactive = nagarkurnoolactive;
        this.nagarkurnoolconfirmed = nagarkurnoolconfirmed;
        this.nagarkurnooldeceased = nagarkurnooldeceased;
        this.nagarkurnoolrecovered = nagarkurnoolrecovered;
    }

    public int getNagarkurnoolactive() {
        return nagarkurnoolactive;
    }

    public void setNagarkurnoolactive(int nagarkurnoolactive) {
        this.nagarkurnoolactive = nagarkurnoolactive;
    }

    public int getNagarkurnoolconfirmed() {
        return nagarkurnoolconfirmed;
    }

    public void setNagarkurnoolconfirmed(int nagarkurnoolconfirmed) {
        this.nagarkurnoolconfirmed = nagarkurnoolconfirmed;
    }

    public int getNagarkurnooldeceased() {
        return nagarkurnooldeceased;
    }

    public void setNagarkurnooldeceased(int nagarkurnooldeceased) {
        this.nagarkurnooldeceased = nagarkurnooldeceased;
    }

    public int getNagarkurnoolrecovered() {
        return nagarkurnoolrecovered;
    }

    public void setNagarkurnoolrecovered(int nagarkurnoolrecovered) {
        this.nagarkurnoolrecovered = nagarkurnoolrecovered;
    }
}
