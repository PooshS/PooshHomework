package oop.week2.classwork.controller;

import oop.week2.classwork.db.AppDB;
import oop.week2.classwork.model.Card;
import oop.week2.classwork.model.CardGroup;

import java.util.ArrayList;

public interface MainController {

    boolean createGroup(CardGroup cardGroup);
    boolean addCard(Card card, int groupID);
    Card searchCard(int cardID);
    Card searchCard(int cardID, int groupID);
    Card removeCard(int cardID);
    Card removeCard(int cardID, int groupID);
    ArrayList<CardGroup> getAllCardGroups();
    ArrayList<Card> getCards(int groupID);

}
