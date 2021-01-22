package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Covid19Zone {

    @SerializedName("zones")
    private List<Zone> zone;

    public Covid19Zone(List<Zone> zone) {
        this.zone = zone;
    }

    public List<Zone> getZone() {
        return zone;
    }

    public void setZone(List<Zone> zone) {
        this.zone = zone;
    }
}
