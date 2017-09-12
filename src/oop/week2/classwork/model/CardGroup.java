package oop.week2.classwork.model;

import java.util.ArrayList;
import java.util.List;

public class CardGroup {

    //private Card [] group;

    private int groupID;
    private ArrayList<Card> cards;

    public CardGroup() {
        cards = new ArrayList<>();
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
