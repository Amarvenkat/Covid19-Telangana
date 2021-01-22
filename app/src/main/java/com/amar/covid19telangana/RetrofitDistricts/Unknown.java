package com.amar.covid19telangana.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class Unknown {
    @SerializedName("active")
    private  int unknownactive;
    @SerializedName("confirmed")
    private  int unknownconfirmed;
    @SerializedName("deceased")
    private int unknowndeceased;
    @SerializedName("recovered")
    private  int unknownrecovered;

    public Unknown(int unknownactive, int unknownconfirmed, int unknowndeceased, int unknownrecovered) {
        this.unknownactive = unknownactive;
        this.unknownconfirmed = unknownconfirmed;
        this.unknowndeceased = unknowndeceased;
        this.unknownrecovered = unknownrecovered;
    }

    public int getUnknownactive() {
        return unknownactive;
    }

    public void setUnknownactive(int unknownactive) {
        this.unknownactive = unknownactive;
    }

    public int getUnknownconfirmed() {
        return unknownconfirmed;
    }

    public void setUnknownconfirmed(int unknownconfirmed) {
        this.unknownconfirmed = unknownconfirmed;
    }

    public int getUnknowndeceased() {
        return unknowndeceased;
    }

    public void setUnknowndeceased(int unknowndeceased) {
        this.unknowndeceased = unknowndeceased;
    }

    public int getUnknownrecovered() {
        return unknownrecovered;
    }

    public void setUnknownrecovered(int unknownrecovered) {
        this.unknownrecovered = unknownrecovered;
    }
}
