package oop.week1.homework.test;

/**
 * Created by Poosh on 14.09.2017.
 */
public class Control {

    CustList custList;

    public Control(CustList custList) {
        this.custList = custList;
    }

    public boolean addCuns(Customer customer){
        return custList.getCustomers().add(customer);
    }

    public CustList getCustList() {
        return custList;
    }

    public void setCustList(CustList custList) {
        this.custList = custList;
    }
}
