package oop.week2.classwork.model;

public class Card {

    private int cardID;
    private String front;
    private String back;


    public Card() {
    }

    public Card(int cardID, String front, String back) {
        this.cardID = cardID;
        this.front = front;
        this.back = back;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
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
        return "\tCard\n{" +
                "cardID=" + cardID +
                ", front='" + front + '\'' +
                ", back='" + back + '\'' +
                '}' + "\n";
    }


}
