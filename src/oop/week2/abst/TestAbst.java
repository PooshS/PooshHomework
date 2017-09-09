package oop.week2.abst;

public class TestAbst {

    public static void main(String[] args) {
        startLogging(new ConsoleLoger());

        startLogging(new FileLoger());
    }

    public static void startLogging(BaseLoger loger){
        loger.start();
    }

}
