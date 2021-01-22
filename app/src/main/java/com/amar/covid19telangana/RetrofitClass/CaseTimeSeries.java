package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class CaseTimeSeries {

    @SerializedName("dailyconfirmed")
    private  int dailyconfirmed;
    @SerializedName("dailydeceased")
    private  int dailydeceased;
    @SerializedName("dailyrecovered")
    private  int dailyrecovered;
    @SerializedName("date")
    private String date;
    @SerializedName("totalconfirmed")
    private  int totalconfirmed;
    @SerializedName("totaldeceased")
    private int totaldeceased;
    @SerializedName("totalrecovered")
    private  int totalrecovered;

    public CaseTimeSeries(int dailyconfirmed, int dailydeceased, int dailyrecovered, String date, int totalconfirmed, int totaldeceased, int totalrecovered) {
        this.dailyconfirmed = dailyconfirmed;
        this.dailydeceased = dailydeceased;
        this.dailyrecovered = dailyrecovered;
        this.date = date;
        this.totalconfirmed = totalconfirmed;
        this.totaldeceased = totaldeceased;
        this.totalrecovered = totalrecovered;
    }

    public int getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(int dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public int getDailydeceased() {
        return dailydeceased;
    }

    public void setDailydeceased(int dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    public int getDailyrecovered() {
        return dailyrecovered;
    }

    public void setDailyrecovered(int dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalconfirmed() {
        return totalconfirmed;
    }

    public void setTotalconfirmed(int totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    public int getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(int totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    public int getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(int totalrecovered) {
        this.totalrecovered = totalrecovered;
    }
}
