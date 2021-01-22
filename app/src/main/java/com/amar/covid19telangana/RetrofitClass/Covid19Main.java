package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Covid19Main {

    @SerializedName("cases_time_series")
    private List<CaseTimeSeries> caseTimeSeries;
    @SerializedName("statewise")
    private  List<StateWise> state;
    @SerializedName("tested")
    private  List<Tested> tested;

    public Covid19Main(List<CaseTimeSeries> caseTimeSeries, List<StateWise> state, List<Tested> tested) {
        this.caseTimeSeries = caseTimeSeries;
        this.state = state;
        this.tested = tested;
    }

    public List<CaseTimeSeries> getCaseTimeSeries() {
        return caseTimeSeries;
    }

    public void setCaseTimeSeries(List<CaseTimeSeries> caseTimeSeries) {
        this.caseTimeSeries = caseTimeSeries;
    }

    public List<StateWise> getState() {
        return state;
    }

    public void setState(List<StateWise> state) {
        this.state = state;
    }

    public List<Tested> getTested() {
        return tested;
    }

    public void setTested(List<Tested> tested) {
        this.tested = tested;
    }
}
