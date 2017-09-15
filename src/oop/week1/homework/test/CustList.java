package oop.week1.homework.test;

import java.util.ArrayList;

/**
 * Created by Poosh on 14.09.2017.
 */
public class CustList {

    ArrayList<Customer> customers;

    public CustList(){
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCust(Customer customer){
       return customers.add(customer);
    }

    @Override
    public String toString() {
        return "CustList{" +
                "customers=" + customers +
                '}';
    }
}
