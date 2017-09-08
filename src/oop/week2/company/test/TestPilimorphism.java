package oop.week2.company.test;

import oop.week2.company.controller.CompanyController;
import oop.week2.company.model.Director;

public class TestPilimorphism {

    public static void main(String[] args) {
        Director director = new Director();
        CompanyController.startWork(director);
    }

}
