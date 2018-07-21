package com.groundgurus.day2;

/**
 *
 * @author penguin
 */
public class Address {
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String province;
    private String postalCode;

    public Address(String streetAddress1, String streetAddress2, String city, String province, String postalCode) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
    
    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public void getAddressDetails() {
        System.out.println("Street Address 1: " + streetAddress1);
        System.out.println("Street Address 2: " + streetAddress2);
        System.out.println("City: " + city);
        System.out.println("Province: " + province);
        System.out.println("Postal Code: " + postalCode);
    }
}
