package oop.week2.classwork.db;

import oop.week2.classwork.model.CardGroup;

import java.util.ArrayList;


public class AppDB implements GroupDAO {

    private static int groupCounter = 0;

    private ArrayList<CardGroup> cardGroups;

    public AppDB(){

        cardGroups = new ArrayList<>();

    }


    public ArrayList<CardGroup> getCardGroups() {
        return cardGroups;
    }

    public void setCardGroups(ArrayList<CardGroup> cardGroups) {
        this.cardGroups = cardGroups;
    }

    @Override
    public CardGroup create(CardGroup cardGroup) {
        cardGroup.setGroupID(generatedGroupID());
        cardGroups.add(cardGroup);
        return cardGroup;
    }

    private int generatedGroupID() {
        return groupCounter++;
    }

    public static int getGroupCounter() {
        return groupCounter;
    }

    @Override
    public CardGroup search(int groupID) {
        for (int i = 0; i < cardGroups.size(); i++) {
            CardGroup current = cardGroups.get(i);
            if(current.getGroupID() == groupID){
                return current;
            }
        }

        return null;
    }

    @Override
    public CardGroup update(CardGroup newCardGroup, int groupID) {
        for (int i = 0; i < cardGroups.size(); i++) {
            CardGroup current = cardGroups.get(i);
            if(current.getGroupID() == groupID){
                return cardGroups.set(i, newCardGroup);
            }
        }

        System.out.println("Group was't found & was't update");
        return null;
    }

    @Override
    public CardGroup delete(int groupID) {
        for (int i = 0; i < cardGroups.size(); i++) {
            CardGroup current = cardGroups.get(i);
            if(current.getGroupID() == groupID){
                return cardGroups.remove(i);
            }
        }

        System.out.println("Group was't found & was't delete");
        return null;
    }

    @Override
    public String toString() {
        return "AppDB{" +
                "cardGroups=" + cardGroups +
                '}';
    }
}
