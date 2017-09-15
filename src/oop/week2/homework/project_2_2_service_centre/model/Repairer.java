package oop.week2.homework.project_2_2_service_centre.model;


public class Repairer extends Stuff {

    private transient RepairerType type = RepairerType.JUNIOR;

    public Repairer() {
    }

    public Repairer(String name, String surname, String post, double salary) {
        super(name, surname, post, salary);
    }


}
