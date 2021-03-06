package oop.week2.company.model;

public abstract class Worker {

    private int id;
    private String name;
    private double salary;
    protected String phone;

    public Worker() {
    }

    public Worker(int id, String name, double salary, String phone) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract void work(); // no body, must be override, within abstract class
}
