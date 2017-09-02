package oop.task1.model;

/**
 * Created by Poosh on 30.08.2017.
 */
public class Student {

    private MyPersonalData myPersonalData;

    private MyDate myDate;

    private MyAddress myAddress;

    private double paidMoney;

    private int taskCount;

    public String convertStudent(){

        return  String.format("name %s, email %s, phone %s, " +
                              "birthYear %d, birthMonth %d, birthDay %d, " +
                              "city %s, street %s, houseNum %s, " +
                              "money %.2f, taskCount %d",
                              myPersonalData.name, myPersonalData.email, myPersonalData.phone,
                              myDate.birthYear, myDate.birthMonth, myDate.birthDay,
                              myAddress.city, myAddress.street, myAddress.houseNum,
                              paidMoney, taskCount);
    }

    /*public void init(String name, String email, String phone,
                     int birthYear, int birthMonth, int birthDay,
                     String city, String street, String houseNum,
                     double paidMoney, int taskCount) {
        myPersonalData.name = name;
        myPersonalData.email = email;
        myPersonalData.phone = phone;

        myDate.birthYear = birthYear;
        myDate.birthMonth = birthMonth;
        myDate.birthDay = birthDay;

        myAddress.city = city;
        myAddress.street = street;
        myAddress.houseNum = houseNum;

        this.paidMoney = paidMoney;
        this.taskCount = taskCount;
    }*/

    public Student (){
        System.out.println("Default constructor");
    }

    /*public Student(String name, String email, String phone,
                     int birthYear, int birthMonth, int birthDay,
                     String city, String street, String houseNum,
                     double paidMoney, int taskCount) {
        myPersonalData.name = name;
        myPersonalData.email = email;
        myPersonalData.phone = phone;

        myDate.birthYear = birthYear;
        myDate.birthMonth = birthMonth;
        myDate.birthDay = birthDay;

        myAddress.city = city;
        myAddress.street = street;
        myAddress.houseNum = houseNum;

        this.paidMoney = paidMoney;
        this.taskCount = taskCount;
    }*/

    public Student(MyPersonalData myPersonalData, MyDate myDate, MyAddress myAddress,
                   double paidMoney, int taskCount) {
        this.myPersonalData = myPersonalData;
        this.myDate = myDate;
        this.myAddress = myAddress;
        this.paidMoney = paidMoney;
        this.taskCount = taskCount;
    }

    public String getName(){
        return myPersonalData.name;
    }

    public void setName(String name){
        if(name == null){
            System.out.println("wrong input name");
            return;
        }
        myPersonalData.name = name;
    }

    public MyDate getMyDate(){
        return myDate;
    }
}
