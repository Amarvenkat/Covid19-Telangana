package com.amar.covid19telangana.RetrofitClass;

import com.amar.covid19telangana.RetrofitDistricts.DistricData;
import com.google.gson.annotations.SerializedName;

public class Telangana {

@SerializedName("districtData")
    private DistricData districData;

    public Telangana(DistricData districData) {
        this.districData = districData;
    }

    public DistricData getDistricData() {
        return districData;
    }

    public void setDistricData(DistricData districData) {
        this.districData = districData;
    }
}
