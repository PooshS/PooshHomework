package oop.week2.company.model;

import oop.week2.company.model.Worker;

public class Coder extends Worker {

    private  String programmingLanguage;

    public Coder(){
    }

    public Coder(int id, String name, double salary,
                 String phone, String programmingLanguage){
        super(id, name, salary, phone);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void code(){
        System.out.println("coder code()");
    }

    @Override
    public void work() {
        System.out.println("Coder work");
    }

    public String toString(){
        return String.format("id %d, name %s", getId(), getName());
    }
}
