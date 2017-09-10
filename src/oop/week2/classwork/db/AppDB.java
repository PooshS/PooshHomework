package oop.week2.classwork.db;

import oop.week2.classwork.model.Group;

import java.util.ArrayList;

public class AppDB {

    //private Group [] groups;

    private ArrayList<Group> groups;

    public AppDB(){

        groups  = new ArrayList<>();

    }

    public AppDB(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
