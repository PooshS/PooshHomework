package oop.week2.classwork.test;

import oop.week2.classwork.controller.MainController;
import oop.week2.classwork.controller.MainControllerImpl;
import oop.week2.classwork.db.AppDB;
import oop.week2.classwork.model.Card;
import oop.week2.classwork.model.CardGroup;

/**
 * Created by Poosh on 10.09.2017.
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        testCreateGroup();
        System.out.println("--------------------------------------------------------");
        testAddCard(new Card(0, "dog", "kind of pet"), 1);
        System.out.println("--------------------------------------------------------");
        removeCard(1,2);
        System.out.println("--------------------------------------------------------");
        testGetAllCardGroups();
        System.out.println("--------------------------------------------------------");
        testGetCards();

    }

    public static void testCreateGroup(){
        MainController mainController = new MainControllerImpl(new AppDB());

        boolean expected = true;
        boolean result = mainController.createGroup(new CardGroup());

        System.out.println("test \"CreateGroup\" -> " + (result == expected) + ": expected " +
                    expected + ", result " + result);
    }

    public static void testAddCard(Card card, int groupID){
        MainController mainController = new MainControllerImpl(new AppDB());
        mainController.createGroup(new CardGroup());

        boolean expected = true;
        boolean result = mainController.addCard(card, groupID);

        System.out.println("test \"AddCard\" -> " + (result == expected) + ": expected " +
                expected + ", result " + result);
            System.out.println((mainController.getCards(groupID) != null) ? mainController.getCards(groupID).toString() :
                                "group with ID " + groupID + " is missing, attempt to add the card is failure");
    }

    public static void removeCard(int cardID){
        MainController mainController = new MainControllerImpl(new AppDB());
        mainController.createGroup(new CardGroup());
        mainController.addCard(new Card(1, "dog", "kind of pet"), 2);
        mainController.addCard(new Card(2, "lion", "king of animal"), 2);

        Card expected = mainController.searchCard(cardID);
        Card result = mainController.removeCard(cardID);


        System.out.println("test \"RemoveCard\" -> " + (result == expected) + ": expected \n" +
                expected + ", result \n" + result);
    }

    public static void removeCard(int cardID, int groupID){
        MainController mainController = new MainControllerImpl(new AppDB());
        mainController.createGroup(new CardGroup());
        mainController.addCard(new Card(1, "dog", "kind of pet"), 2);
        mainController.addCard(new Card(2, "lion", "king of animal"), 2);

        Card expected = mainController.searchCard(cardID, groupID);
        Card result = mainController.removeCard(cardID, groupID);


        System.out.println("test \"RemoveCard\" -> " + (result == expected) + ": expected \n" +
                expected + ", result \n" + result);
    }

    public static void testGetAllCardGroups(){
        MainController mainController = new MainControllerImpl(new AppDB());
        mainController.createGroup(new CardGroup());

        boolean expected = true;
        boolean result = (mainController.getAllCardGroups() != null);

        System.out.println("test \"GetAllCardGroups\" -> " + (result == expected) + ": expected " +
                expected + ", result " + result);
    }

    public static void testGetCards(){
        MainController mainController = new MainControllerImpl(new AppDB());
        mainController.createGroup(new CardGroup());
        mainController.addCard(new Card(1, "car", "most popular machine"), 4);

        boolean expected = true;
        boolean result = (mainController.getCards(4) != null);

        System.out.println("test \"GetCards\" -> " + (result == expected) + ": expected " +
                expected + ", result " + result);
    }
}
