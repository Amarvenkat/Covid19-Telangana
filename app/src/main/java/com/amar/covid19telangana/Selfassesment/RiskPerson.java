package com.amar.covid19telangana.Selfassesment;

public class RiskPerson {

    private String riskname,riskphoneno,riskgender,riskaddress,latitude,longitude;

  public   RiskPerson(){

    }
    public RiskPerson(String riskname, String riskgender, String riskphoneno, String riskaddress, String latitude,String longitude) {

        this.riskaddress = riskaddress;
        this.riskgender = riskgender;
        this.riskname = riskname;
        this.riskphoneno =riskphoneno;
        this.latitude = latitude;
        this.longitude = longitude;


    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname;
    }

    public String getRiskphoneno() {
        return riskphoneno;
    }

    public void setRiskphoneno(String riskphoneno) {
        this.riskphoneno = riskphoneno;
    }

    public String getRiskgender() {
        return riskgender;
    }

    public void setRiskgender(String riskgender) {
        this.riskgender = riskgender;
    }

    public String getRiskaddress() {
        return riskaddress;
    }

    public void setRiskaddress(String riskaddress) {
        this.riskaddress = riskaddress;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
