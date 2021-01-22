package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class JogulambaGadwal {

    @SerializedName("active")
    private  int jogulambaGadwalactive;
    @SerializedName("confirmed")
    private  int jogulambaGadwalconfirmed;
    @SerializedName("deceased")
    private int jogulambaGadwaldeceased;
    @SerializedName("recovered")
    private  int jogulambaGadwalrecovered;

    public JogulambaGadwal(int jogulambaGadwalactive, int jogulambaGadwalconfirmed, int jogulambaGadwaldeceased, int jogulambaGadwalrecovered) {
        this.jogulambaGadwalactive = jogulambaGadwalactive;
        this.jogulambaGadwalconfirmed = jogulambaGadwalconfirmed;
        this.jogulambaGadwaldeceased = jogulambaGadwaldeceased;
        this.jogulambaGadwalrecovered = jogulambaGadwalrecovered;
    }

    public int getJogulambaGadwalactive() {
        return jogulambaGadwalactive;
    }

    public void setJogulambaGadwalactive(int jogulambaGadwalactive) {
        this.jogulambaGadwalactive = jogulambaGadwalactive;
    }

    public int getJogulambaGadwalconfirmed() {
        return jogulambaGadwalconfirmed;
    }

    public void setJogulambaGadwalconfirmed(int jogulambaGadwalconfirmed) {
        this.jogulambaGadwalconfirmed = jogulambaGadwalconfirmed;
    }

    public int getJogulambaGadwaldeceased() {
        return jogulambaGadwaldeceased;
    }

    public void setJogulambaGadwaldeceased(int jogulambaGadwaldeceased) {
        this.jogulambaGadwaldeceased = jogulambaGadwaldeceased;
    }

    public int getJogulambaGadwalrecovered() {
        return jogulambaGadwalrecovered;
    }

    public void setJogulambaGadwalrecovered(int jogulambaGadwalrecovered) {
        this.jogulambaGadwalrecovered = jogulambaGadwalrecovered;
    }
}
