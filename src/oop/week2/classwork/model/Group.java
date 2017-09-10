package oop.week2.classwork.model;

import java.util.List;

public class Group {

    //private Card [] group;

    private String groupName;
    private List<Card> arrayList;

    @Override
    public String toString() {
        return "Group{" +
                "arrayList=" + arrayList +
                '}';
    }
}
