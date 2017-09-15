package oop.week1.homework.test;

/**
 * Created by Poosh on 14.09.2017.
 */
public class Run {

    public static void main(String[] args) {
        /*Control control = new Control(new CustList());
        control.addCuns(new Customer("Petia"));
        System.out.println(control.getCustList().getCustomers().get(0).getName());*/

        CustList custList = new CustList();
        Customer cust1 = new Customer("Vasia");
        Customer cust2 = new Customer("Kolia");
        Customer cust3 = new RegCustomer("Ivan", "325");
        custList.addCust(cust1);
        custList.addCust(cust2);
        custList.addCust(cust3);

        System.out.println(custList.getCustomers().size() + "\n " + custList.getCustomers().get(0).getName() + " \n " + custList.getCustomers().get(2).name);
    }

}
