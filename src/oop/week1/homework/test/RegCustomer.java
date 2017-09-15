package oop.week1.homework.test;

/**
 * Created by Poosh on 14.09.2017.
 */
public class RegCustomer extends Customer {

    String phone;

    public RegCustomer(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
