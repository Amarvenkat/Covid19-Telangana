package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class Zone {

    @SerializedName("district")
    private String zonedistrict;
    @SerializedName("districtcode")
    private  String zonedistrictcode;
    @SerializedName("lastupdated")
    private  String zonelastupdated;
    @SerializedName("source")
    private  String zonesource;
    @SerializedName("state")
    private String zonestate;
    @SerializedName("statecode")
    private String zonestatecode;
    @SerializedName("zone")
    private  String zonecolour;

    public Zone(String zonedistrict, String zonedistrictcode, String zonelastupdated, String zonesource, String zonestate, String zonestatecode, String zonecolour) {
        this.zonedistrict = zonedistrict;
        this.zonedistrictcode = zonedistrictcode;
        this.zonelastupdated = zonelastupdated;
        this.zonesource = zonesource;
        this.zonestate = zonestate;
        this.zonestatecode = zonestatecode;
        this.zonecolour = zonecolour;
    }

    public String getZonedistrict() {
        return zonedistrict;
    }

    public void setZonedistrict(String zonedistrict) {
        this.zonedistrict = zonedistrict;
    }

    public String getZonedistrictcode() {
        return zonedistrictcode;
    }

    public void setZonedistrictcode(String zonedistrictcode) {
        this.zonedistrictcode = zonedistrictcode;
    }

    public String getZonelastupdated() {
        return zonelastupdated;
    }

    public void setZonelastupdated(String zonelastupdated) {
        this.zonelastupdated = zonelastupdated;
    }

    public String getZonesource() {
        return zonesource;
    }

    public void setZonesource(String zonesource) {
        this.zonesource = zonesource;
    }

    public String getZonestate() {
        return zonestate;
    }

    public void setZonestate(String zonestate) {
        this.zonestate = zonestate;
    }

    public String getZonestatecode() {
        return zonestatecode;
    }

    public void setZonestatecode(String zonestatecode) {
        this.zonestatecode = zonestatecode;
    }

    public String getZonecolour() {
        return zonecolour;
    }

    public void setZonecolour(String zonecolour) {
        this.zonecolour = zonecolour;
    }
}
