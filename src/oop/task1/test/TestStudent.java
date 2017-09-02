package oop.task1.test;

import oop.task1.model.MyAddress;
import oop.task1.model.MyDate;
import oop.task1.model.MyPersonalData;
import oop.task1.model.Student;
import oop.task1.util.StudentUtils;

import java.util.Scanner;

/**
 * Created by Poosh on 30.08.2017.
 */
public class TestStudent {

    public static void main(String[] args) {

        /*System.out.println("Enter student name:");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println("Enter student email:");
        String email  = sc.nextLine();
        System.out.println("Enter student phone:");
        String phone  = sc.nextLine();
        System.out.println("Enter student birthYear:");
        int birthYear  = sc.nextInt();
        System.out.println("Enter student birthMonth:");
        int birthMonth  = sc.nextInt();
        System.out.println("Enter student birthDay:");
        int birthDay  = sc.nextInt();
        System.out.println("Enter student address:");
        System.out.println(" -  city:");
        String citty  = sc.nextLine();
        String city  = sc.nextLine();
        System.out.println(" -  street:");
        String street  = sc.nextLine();
        System.out.println(" -  houseNum:");
        String houseNum  = sc.nextLine();
        System.out.println("Enter student paidMoney:");
        double paidMoney  = sc.nextDouble();
        System.out.println("Enter student taskCount:");
        int taskCount  = sc.nextInt();*/

        //Student student1 = new Student();

        /*student1.init(name, email, phone,
                    birthYear, birthMonth, birthDay,
                    city, street, houseNum,
                    paidMoney, taskCount);*/

        /*student1.init("Oksana", "oksi@gmail.com", "+380979478422",
                1983, 01, 15,
                "Brovary", "Korolenka", "123",
                4255.99, 10);*/

        /*Student student1 = new Student("Oksana", "oksi@gmail.com", "+380979478422",
                1983, 01, 15,
                "Brovary", "Korolenka", "123",
                4255.99, 10);*/
        Student student1;
        student1 = new Student(new MyPersonalData("Oksana", "oksi@gmail.com", "+380979478422"),
                   new MyDate(1983,1,15),
                   new MyAddress("Brovary", "Korolenka", "123"), 4891.99,9);

        //System.out.println(StudentUtils.convertStudent(student1));
        System.out.println(student1.convertStudent());

        student1.setName("Ksenia");
        System.out.println("new name = " + "\"" + student1.getName() + "\"");

        MyDate myDate = student1.getMyDate();
    }
}
