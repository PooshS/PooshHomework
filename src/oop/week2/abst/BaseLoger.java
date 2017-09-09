package oop.week2.abst;

public abstract class BaseLoger {

    public final void start(){
        System.out.println("Start action");
        action();
        System.out.println("End action");
    }

    public abstract void action();

}
