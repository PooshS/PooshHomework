package oop.week2.classwork.model;

public class Card {

    private int ID;
    private String front;
    private String back;


    public Card() {

    }


    public Card(int ID, String front, String back) {
        this.ID = ID;
        this.front = front;
        this.back = back;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Card{" +
                "ID=" + ID +
                ", front='" + front + '\'' +
                ", back='" + back + '\'' +
                '}';
    }
}
