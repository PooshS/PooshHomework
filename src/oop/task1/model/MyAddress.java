package oop.task1.model;

/**
 * Created by Poosh on 30.08.2017.
 */
public class MyAddress {

    public String city;
    public String street;
    public String houseNum;

    public MyAddress(String city, String street, String houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }
}
