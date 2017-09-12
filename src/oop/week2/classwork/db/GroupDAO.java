package oop.week2.classwork.db;

import oop.week2.classwork.model.CardGroup;

/**
 * Created by Poosh on 11.09.2017.
 */
public interface GroupDAO {

    CardGroup create(CardGroup cardGroup);
    CardGroup search (int groupID);
    CardGroup update (CardGroup newCardGroup, int groupID);
    CardGroup delete (int groupID);

}
