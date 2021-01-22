package com.amar.covid19telangana.Unorganizedworker;

public class UnorganizedPojo {

    String name,phoneno,gender,address,natureofwork,maritalstatus,help,age,maledependent,femaledependant;
    public  UnorganizedPojo(){

    }

    public UnorganizedPojo(String name, String phoneno, String gender, String address, String natureofwork, String maritalstatus, String help,String age,String maledependent,String femaledependant) {

        this.name= name;
        this.phoneno = phoneno;
        this.gender = gender;
        this.address = address;
        this.natureofwork = natureofwork;
        this.maritalstatus = maritalstatus;
        this.help = help;
        this.maledependent = maledependent;
        this.femaledependant = femaledependant;
        this.age = age;
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

    public String getNatureofwork() {
        return natureofwork;
    }

    public void setNatureofwork(String natureofwork) {
        this.natureofwork = natureofwork;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaledependent() {
        return maledependent;
    }

    public void setMaledependent(String maledependent) {
        this.maledependent = maledependent;
    }

    public String getFemaledependant() {
        return femaledependant;
    }

    public void setFemaledependant(String femaledependant) {
        this.femaledependant = femaledependant;
    }
}
