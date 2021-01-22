package com.amar.covid19telangana.RetrofitClass;

import com.google.gson.annotations.SerializedName;

public class Resource {
    @SerializedName("category")
    private String category;
    @SerializedName("city")
    private  String city;
    @SerializedName("contact")
    private String contact;
    @SerializedName("descriptionandorserviceprovided")
    private  String description;
    @SerializedName("nameoftheorganisation")
    private  String name_of_organization;
    @SerializedName("phonenumber")
    private  String phonenumber;
    @SerializedName("state")
    private  String state;

    public Resource(String category, String city, String contact, String description, String name_of_organization, String phonenumber, String state) {
        this.category = category;
        this.city = city;
        this.contact = contact;
        this.description = description;
        this.name_of_organization = name_of_organization;
        this.phonenumber = phonenumber;
        this.state = state;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName_of_organization() {
        return name_of_organization;
    }

    public void setName_of_organization(String name_of_organization) {
        this.name_of_organization = name_of_organization;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
