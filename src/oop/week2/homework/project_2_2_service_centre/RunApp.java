package oop.week2.homework.project_2_2_service_centre;


import oop.week2.homework.project_2_2_service_centre.controller.ServiceCentre;
import oop.week2.homework.project_2_2_service_centre.model.Client;
import oop.week2.homework.project_2_2_service_centre.model.Repairer;
//import oop.week2.homework.project_2_2_service_centre.utils.StringServiceCentreIOHelper;
import oop.week2.homework.project_2_2_service_centre.view.ClientView;
import oop.week2.homework.project_2_2_service_centre.view.RepairView;

import java.util.Scanner;

public class RunApp {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO6/temp/service_centre.out";
    public static final String PATH_STR = "/home/serhii/IdeaProjects/ACO6/temp/service_centre.txt";

    public static void main(String[] args) {

        //IOHelper<ServiceCentre> serviceCentreIOSerialHelper = new StringServiceCentreIOHelper();
        //LoginHelper loginHelper = new LoginHelper();

        ServiceCentre serviceCentre = new ServiceCentre();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Client");
            System.out.println("2. Repairer");
            System.out.println("3. save");
            System.out.println("4. load");
            System.out.println("6. save as string");
            System.out.println("5. Exit");
            int ch = scanner.nextInt();

            /*if(ch != 4 && serviceCentre == null){
                System.err.println("please load service centre");
            }  else*/ if (ch == 1) {
                Client client = serviceCentre.logInAsClient();
                new ClientView(client, serviceCentre).start();
            } else if (ch == 2) {
                Repairer repairer = serviceCentre.logInAsRepairer();
                new RepairView(repairer, serviceCentre).start();
            } else if(ch == 3){
                serviceCentre.initTestData();
              //  serviceCentreIOSerialHelper.save(PATH_STR, serviceCentre);
            } else if(ch == 4){
               // serviceCentre = serviceCentreIOSerialHelper.load(PATH_STR);
            } else if(ch == 5){
                break;
            }

        }

    }
}
