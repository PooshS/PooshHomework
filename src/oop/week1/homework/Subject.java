package oop.week1.homework;

/**
 * Created by Poosh on 06.09.2017.
 */
public class Subject {
    private String name;
    private int nmbrHours;
    private int cntWorkedHours;
    private int stdntMark;

    public Subject(String name, int nmbrHours, int cntWorkedHours, int stdntMark) {
        this.name = name;
        this.nmbrHours = nmbrHours;
        this.cntWorkedHours = cntWorkedHours;
        this.stdntMark = stdntMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNmbrHours() {
        return nmbrHours;
    }

    public void setNmbrHours(int nmbrHours) {
        this.nmbrHours = nmbrHours;
    }

    public int getCntWorkedHours() {
        return cntWorkedHours;
    }

    public void setCntWorkedHours(int cntWorkedHours) {
        this.cntWorkedHours = cntWorkedHours;
    }

    public int getStdntMark() {
        return stdntMark;
    }

    public void showSubjectInfo(){
        System.out.printf("Subject info: name %s, number of hours for study %d, " +
                "number of passed studying hours %d, student mark %d", name, nmbrHours, cntWorkedHours, stdntMark);
    }

    public void passExam(int stdntMark) {
        if(stdntMark < 0 || stdntMark > 12){
            System.out.println("wrong argument in method \"passExam\", class \"Subject\"!\nMark should be in diapason from 0 to 12");
            return;
        }
        this.stdntMark = stdntMark;
    }
}
