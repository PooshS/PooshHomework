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

    private int sbjctCounter = 0;

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
}
