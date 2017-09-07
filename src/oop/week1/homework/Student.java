package oop.week1.homework;

/**
 * Created by Poosh on 06.09.2017.
 */
public class Student {
    private String name;
    private String address;
    private Subject[] subjectList;

    public Student(String name, String address, Subject[] subject) {
        this.name = name;
        this.address = address;
        this.subjectList = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Subject[] getSubjects() {
        return subjectList;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjectList = subjects;
    }

    private int cntWorkedHoursBeforeChange = 0;

    public void study(Subject subject, int nmbrWorkedHours){
        cntWorkedHoursBeforeChange = subject.getCntWorkedHours();
        if(subject.getNmbrHours() - subject.getCntWorkedHours() == 0){
            System.out.println("allocated time for the subject is over");
        } else if(subject.getNmbrHours() - subject.getCntWorkedHours() < nmbrWorkedHours){
            subject.setCntWorkedHours(subject.getNmbrHours());
        } else subject.setCntWorkedHours(cntWorkedHoursBeforeChange + nmbrWorkedHours);
    }

    public int getCntWorkedHoursBeforeChange(){
        return cntWorkedHoursBeforeChange;
    }

    private int sbjctCounter = 0;

    public int getSbjctCounter(){
        return sbjctCounter;
    }

    public void addSubject(Subject subject){
        if(subject == null){
            System.out.println("Wrong argument \"subject\"");
            return;
        }
        if(sbjctCounter >= subjectList.length){
            System.out.println("Student can't has more subjects");
            return;
        }
        subjectList[sbjctCounter++] = subject;
    }

    public void removeSubject(){
        subjectList[--sbjctCounter] = null;
    }

    public void showAllInfoAboutSubjects(){
        for (int i = 0; i < subjectList.length; i++) {
            subjectList[i].showSubjectInfo();
            System.out.println();
        }
    }

    public double getAverageMark(){
        int sum = 0;
        for (int i = 0; i < subjectList.length; i++) {
            sum += subjectList[i].getStdntMark();
        }
        return (double)sum/subjectList.length;
    }
}
