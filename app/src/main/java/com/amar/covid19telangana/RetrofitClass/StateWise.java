package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class StateWise {

    @SerializedName("active")
    private int active;
    @SerializedName("confirmed")
    private  int confirmed;
    @SerializedName("deaths")
    private int deaths;
    @SerializedName("deltaconfirmed")
    private int deltaconfirmed;
    @SerializedName("deltadeaths")
    private int deltadeaths;
    @SerializedName("deltarecovered")
    private int deltarecovered;
    @SerializedName("lastupdatedtime")
    private  String lastupdatetime;
    @SerializedName("recovered")
    private int recovered;
    @SerializedName("state")
    private String state;
    @SerializedName("statecode")
    private String statecode;
    @SerializedName("statenotes")
    private  String statenotes;


    public StateWise(int active, int confirmed, int deaths, int deltaconfirmed, int deltadeaths, int deltarecovered, String lastupdatetime, int recovered, String state, String statecode, String statenotes) {
        this.active = active;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.deltaconfirmed = deltaconfirmed;
        this.deltadeaths = deltadeaths;
        this.deltarecovered = deltarecovered;
        this.lastupdatetime = lastupdatetime;
        this.recovered = recovered;
        this.state = state;
        this.statecode = statecode;
        this.statenotes = statenotes;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getDeltaconfirmed() {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed(int deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    public int getDeltadeaths() {
        return deltadeaths;
    }

    public void setDeltadeaths(int deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    public int getDeltarecovered() {
        return deltarecovered;
    }

    public void setDeltarecovered(int deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    public String getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(String lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatenotes() {
        return statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }
}
