package com.amar.covid19telangana.Orphan;

public class OrphanPojo {

    String help,orphanliving,orphanorphanliving,orphanshelding,name,phoneno,gender,address;
    public OrphanPojo(){

    }
    public OrphanPojo(String name, String phoneno, String gender, String address, String help, String orphanliving, String orphanorphanliving, String orphanshelding) {

        this.help = help;
        this.orphanliving = orphanliving;
        this.orphanorphanliving = orphanorphanliving;
        this.orphanshelding = orphanshelding;
        this.name = name;
        this.phoneno = phoneno;
        this.gender = gender;
        this.address = address;

    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getOrphanliving() {
        return orphanliving;
    }

    public void setOrphanliving(String orphanliving) {
        this.orphanliving = orphanliving;
    }

    public String getOrphanorphanliving() {
        return orphanorphanliving;
    }

    public void setOrphanorphanliving(String orphanorphanliving) {
        this.orphanorphanliving = orphanorphanliving;
    }

    public String getOrphanshelding() {
        return orphanshelding;
    }

    public void setOrphanshelding(String orphanshelding) {
        this.orphanshelding = orphanshelding;
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
}
