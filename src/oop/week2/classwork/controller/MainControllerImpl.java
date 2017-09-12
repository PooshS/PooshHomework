package oop.week2.classwork.controller;

import com.sun.org.apache.xpath.internal.SourceTree;
import oop.week2.classwork.db.AppDB;
import oop.week2.classwork.model.Card;
import oop.week2.classwork.model.CardGroup;

import java.util.ArrayList;

/**
 * Created by Poosh on 11.09.2017.
 */
public class MainControllerImpl implements MainController{

    private AppDB appDB;

    public MainControllerImpl(AppDB appDB) {
        this.appDB = appDB;
    }

    public AppDB getAppDB() {
        return appDB;
    }

    @Override
    public boolean createGroup(CardGroup cardGroup) {
        return appDB.create(cardGroup) != null;
    }

    @Override
    public boolean addCard(Card card, int groupID) {
        CardGroup searchRes = appDB.search(groupID);

        if (searchRes == null){
            return false;
        }
        return searchRes.getCards().add(card);
    }

    @Override
    public Card searchCard(int cardID) {
        for (int i = 0; i < appDB.getCardGroups().size(); i++) {
            CardGroup currentCG = appDB.getCardGroups().get(i);
            for (int j = 0; j < currentCG.getCards().size(); j++) {
                Card currentCard = currentCG.getCards().get(j);
                if(currentCard.getCardID() == cardID){
                    return currentCG.getCards().get(j);
                }
            }
        }
        return null;
    }

    @Override
    public Card searchCard(int cardID, int groupID) {
        CardGroup searchRes = appDB.search(groupID);
        for (int j = 0; j < searchRes.getCards().size(); j++) {
            Card currentCard = searchRes.getCards().get(j);
            if(currentCard.getCardID() == cardID){
                return searchRes.getCards().get(j);
            }
        }
        return null;
    }

    @Override
    public Card removeCard(int cardID) {
        for (int i = 0; i < appDB.getCardGroups().size(); i++) {
            CardGroup currentCG = appDB.getCardGroups().get(i);
            for (int j = 0; j < currentCG.getCards().size(); j++) {
                Card currentCard = currentCG.getCards().get(j);
                if(currentCard.getCardID() == cardID){
                    return currentCG.getCards().remove(j);
                }
            }
        }
        return null;
    }

    @Override
    public Card removeCard(int cardID, int groupID) {
        CardGroup searchRes = appDB.search(groupID);
            for (int j = 0; j < searchRes.getCards().size(); j++) {
                Card currentCard = searchRes.getCards().get(j);
                if(currentCard.getCardID() == cardID){
                    return searchRes.getCards().remove(j);
                }
            }
        return null;
    }

    @Override
    public ArrayList<CardGroup> getAllCardGroups() {
        return appDB.getCardGroups();
    }

    @Override
    public ArrayList<Card> getCards(int groupID) {
        CardGroup searchRes = appDB.search(groupID);
        if (searchRes != null){
            return searchRes.getCards();
        }
        return null;
    }
}
