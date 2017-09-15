package oop.week2.homework.project_2_2_service_centre.view;


import oop.week2.homework.project_2_2_service_centre.controller.ServiceCentre;
import oop.week2.homework.project_2_2_service_centre.exception.NoTechniqueFound;
import oop.week2.homework.project_2_2_service_centre.model.Repairer;
import oop.week2.homework.project_2_2_service_centre.model.Technics;

import java.util.Scanner;

public class RepairView {

    private Repairer repairer;
    private Technics currentTechnique;
    private ServiceCentre serviceCentre;
    private Scanner sc = new Scanner(System.in);

    public RepairView() {
    }

    public RepairView(Repairer repairer, ServiceCentre serviceCentre) {
        this.repairer = repairer;
        this.serviceCentre = serviceCentre;
    }

    public void showMainMenu(){
        System.out.println("1. show buffer products");
        System.out.println("2. repair product");
        System.out.println("3. take product");
        System.out.println("4. exit");
    }

    public void start(){
        while(true){
            showMainMenu();
            int choice = sc.nextInt();

            if(choice == 1){
                serviceCentre.showBufferTechinics();
            }else if(choice == 2){
                repairProductMenu();
            } else if(choice == 3){
                try {
                    takeProductMenu();
                } catch (NoTechniqueFound e){
                    System.err.println("No tech fount " + e.getMessage());
                }
            }else if(choice == 4){
                return;
            }
        }
    }

    public void takeProductMenu() throws NoTechniqueFound {
        System.out.println("enter product for repair id");
        int id = sc.nextInt();
        currentTechnique = serviceCentre.getTechnique(id);
    }

    public void repairProductMenu(){
        serviceCentre.repair(repairer,currentTechnique);
    }

}
