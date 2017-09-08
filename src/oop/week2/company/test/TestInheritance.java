package oop.week2.company.test;

import oop.week2.company.model.Coder;
import oop.week2.company.model.Tester;
import oop.week2.company.model.Worker;

public class TestInheritance {
    public static void main(String[] args) {

        Coder coder = new Coder(1, "Vania", 3000,
                "+380", "JAVA");
        coder.setId(1);
        coder.code();

        /*Worker worker = new Worker();
        Worker worker1 = new Coder();
        Worker worker2 = new Tester();*/

        Tester tester = new Tester(2, "Tester Kolia", 2500, "2", "Auto");
    }

    public static void startWorker(Worker worker){
        if(worker instanceof Coder){
            Coder coderRef = (Coder) worker;
            coderRef.code();
        } else if(worker.getClass() == Tester.class){
            Tester tester = (Tester) worker;
        } else {
            worker.work();
        }
    }

    public static void startWorker2(Worker worker){
        worker.work();
    }
}
