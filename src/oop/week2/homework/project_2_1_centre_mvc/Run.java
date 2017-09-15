package oop.week2.homework.project_2_1_centre_mvc;

import oop.week2.homework.project_2_1_centre_mvc.controller.ClientController;
import oop.week2.homework.project_2_1_centre_mvc.model.Client;
import oop.week2.homework.project_2_1_centre_mvc.model.Product;
import oop.week2.homework.project_2_1_centre_mvc.model.ServiceCentre;
import oop.week2.homework.project_2_1_centre_mvc.view.ClientView;

public class Run {
    public static void main(String[] args) {
        Product product1 = new Product(123, "TV", false);
        Product product2 = new Product(4545, "PHONE", false);

        Client client = new Client("Andrey", 12355);

        client.getProducts().add(product1);
        client.getProducts().add(product2);



        ServiceCentre serviceCentre = new ServiceCentre();

        ClientController clientController = new ClientController(serviceCentre);

        ClientView clientView = new ClientView();
        clientView.setClient(client);
        clientView.setClientController(clientController);

        clientView.start();

    }
}
