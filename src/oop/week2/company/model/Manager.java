package oop.week2.company.model;

public class Manager {

    private Worker[] workers;

    public void addWorker(Worker worker){
        // add to the array
    }

    public void doTeamWork(){
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }
}
