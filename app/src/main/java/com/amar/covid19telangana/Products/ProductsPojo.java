package com.amar.covid19telangana.Products;

public class ProductsPojo {

    private String stringcompanyname;
    private String stringaddress;
    private String stringsellcontactnumber;
    private String stringsellemail;
    private String stringtradelisencedetails;
    private String stringproductname;
    private String stringbrandname;
    private String stringstockavailability;
    private String stringprice;
    private String stringproductdescription;
    private String url;


    public  ProductsPojo(){

    }

    public ProductsPojo(String stringcompanyname, String stringaddress, String stringsellcontactnumber, String stringsellemail, String stringtradelisencedetails, String stringproductname, String stringbrandname, String stringstockavailability, String stringprice, String stringproductdescription, String url) {

        this.stringcompanyname = stringcompanyname;
        this.stringaddress = stringaddress;
        this.stringsellcontactnumber = stringsellcontactnumber;
        this.stringsellemail = stringsellemail;
        this.stringtradelisencedetails = stringtradelisencedetails;
        this.stringproductname = stringproductname;
        this.stringbrandname = stringbrandname;
        this.stringstockavailability = stringstockavailability;
        this.stringprice = stringprice;
        this.stringproductdescription = stringproductdescription;
        this.url = url;


    }

    public String getStringcompanyname() {
        return stringcompanyname;
    }

    public void setStringcompanyname(String stringcompanyname) {
        this.stringcompanyname = stringcompanyname;
    }

    public String getStringaddress() {
        return stringaddress;
    }

    public void setStringaddress(String stringaddress) {
        this.stringaddress = stringaddress;
    }

    public String getStringsellcontactnumber() {
        return stringsellcontactnumber;
    }

    public void setStringsellcontactnumber(String stringsellcontactnumber) {
        this.stringsellcontactnumber = stringsellcontactnumber;
    }

    public String getStringsellemail() {
        return stringsellemail;
    }

    public void setStringsellemail(String stringsellemail) {
        this.stringsellemail = stringsellemail;
    }

    public String getStringtradelisencedetails() {
        return stringtradelisencedetails;
    }

    public void setStringtradelisencedetails(String stringtradelisencedetails) {
        this.stringtradelisencedetails = stringtradelisencedetails;
    }

    public String getStringproductname() {
        return stringproductname;
    }

    public void setStringproductname(String stringproductname) {
        this.stringproductname = stringproductname;
    }

    public String getStringbrandname() {
        return stringbrandname;
    }

    public void setStringbrandname(String stringbrandname) {
        this.stringbrandname = stringbrandname;
    }

    public String getStringstockavailability() {
        return stringstockavailability;
    }

    public void setStringstockavailability(String stringstockavailability) {
        this.stringstockavailability = stringstockavailability;
    }

    public String getStringprice() {
        return stringprice;
    }

    public void setStringprice(String stringprice) {
        this.stringprice = stringprice;
    }

    public String getStringproductdescription() {
        return stringproductdescription;
    }

    public void setStringproductdescription(String stringproductdescription) {
        this.stringproductdescription = stringproductdescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
