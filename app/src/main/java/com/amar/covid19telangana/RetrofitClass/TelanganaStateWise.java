package com.amar.covid19telangana.RetrofitClass;

import com.amar.covid19telangana.RetrofitClass.Telangana;
import com.google.gson.annotations.SerializedName;

 public class TelanganaStateWise {


    @SerializedName("Telangana")
    private Telangana telangana;

    public TelanganaStateWise(Telangana telangana) {
        this.telangana = telangana;
    }

    public Telangana getTelangana() {
        return telangana;
    }

    public void setTelangana(Telangana telangana) {
        this.telangana = telangana;
    }
}
