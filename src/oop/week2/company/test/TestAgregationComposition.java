package oop.week2.company.test;

import oop.week2.company.model.Director;
import oop.week2.company.model.Manager;

public class TestAgregationComposition {

    public static void main(String[] args) {

        // lifecycle object
        // aggregation
        Manager manager = new Manager();
        Director director = new Director();
        director.setRightHand(manager);
        director = null;

        // Composition
        Director director1 = new Director();
        director1.setRightHand(new Manager());
        director1 = null;
    }

}
