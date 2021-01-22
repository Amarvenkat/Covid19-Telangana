package com.amar.covid19telangana.HealthWorkerAssigning;

import com.amar.covid19telangana.Services.HealthWorkerService;

public class HealthWorkerPojo {

    String name,phoneno,gender,address,healthtype,speciality,subspeciality,healthemail,healthresume,healthdob,healthnationallity,paid,living,retired;
    public HealthWorkerPojo(){

    }
    public HealthWorkerPojo(String name, String phoneno, String gender, String address, String healthtype, String speciality, String subspeciality, String healthemail, String healthresume, String healthdob, String healthnationallity, String paid, String living, String retired) {

        this.name = name;
        this.phoneno = phoneno;
        this.gender = gender;
        this.address = address;
        this.healthtype = healthtype;
        this.speciality = speciality;
        this.subspeciality = subspeciality;
        this.healthemail = healthemail;
        this.healthresume = healthresume;
        this.healthdob = healthdob;
        this.healthnationallity = healthnationallity;
        this.paid = paid;
        this.living = living;
        this.retired = retired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthtype() {
        return healthtype;
    }

    public void setHealthtype(String healthtype) {
        this.healthtype = healthtype;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSubspeciality() {
        return subspeciality;
    }

    public void setSubspeciality(String subspeciality) {
        this.subspeciality = subspeciality;
    }

    public String getHealthemail() {
        return healthemail;
    }

    public void setHealthemail(String healthemail) {
        this.healthemail = healthemail;
    }

    public String getHealthresume() {
        return healthresume;
    }

    public void setHealthresume(String healthresume) {
        this.healthresume = healthresume;
    }

    public String getHealthdob() {
        return healthdob;
    }

    public void setHealthdob(String healthdob) {
        this.healthdob = healthdob;
    }

    public String getHealthnationallity() {
        return healthnationallity;
    }

    public void setHealthnationallity(String healthnationallity) {
        this.healthnationallity = healthnationallity;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getLiving() {
        return living;
    }

    public void setLiving(String living) {
        this.living = living;
    }

    public String getRetired() {
        return retired;
    }

    public void setRetired(String retired) {
        this.retired = retired;
    }
}
