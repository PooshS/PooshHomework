package oop.week2.homework.project_2_2_service_centre.view;


import oop.week2.homework.project_2_2_service_centre.model.Client;
import oop.week2.homework.project_2_2_service_centre.model.Repairer;
import oop.week2.homework.project_2_2_service_centre.model.Technics;

import java.util.Date;

public class LoginHelper  {

    private Client client;
    private Repairer repairer;

    public LoginHelper() {
        initTestData();
    }

    private void initTestData() {
        client = new Client("Oleg", "Ivanov");
        repairer = new Repairer("Yuriy", "Liskov", "repairer", 1000);

        Technics technics1 = new Technics("new", new Date(), 677,345);
        Technics technics2 = new Technics("new", new Date(), 5656,222);
        Technics technics3 = new Technics("new", new Date(), 2332,111);

        client.getTechnicsList().addToList(technics1);
        client.getTechnicsList().addToList(technics2);
        client.getTechnicsList().addToList(technics3);
    }


    public Client logInAsClient(){
        return client;
    }

    public Repairer logInAsRepairer(){
        return repairer;
    }
}
