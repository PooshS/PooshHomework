package oop.week1.homework.testing;

import oop.week1.homework.model.Student;
import oop.week1.homework.model.Subject;

/**
 * Created by Poosh on 06.09.2017.
 */
public class Test {
    public static void main(String[] args) {

        testPassExam();
        testShowSublectInfo();
        testGetStdntMark();

        testStudy();
        testAddSubject();
        testRemoveSubject();
        testShowAllInfoAboutSubjects();
        testGetAverageMark();
    }

    public static void testPassExam(){
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject = new Subject("Pascal", 80,0,0);

        subject.passExam(11);

        System.out.println("method \"passExam\" -> " + (subject.getStdntMark() == 11) + ": expected " + 11 +
                ", result " + subject.getStdntMark());
    }

    public static void testShowSublectInfo(){
        Student student = new Student("Vasia", "Kyiv", new Subject[1]);
        Subject subject = new Subject("Basic", 90,10,0);

        System.out.print("method \"showSubjectInfo\" -> " + true + ": ");
        subject.showSubjectInfo();
        System.out.println();
    }

    public static void testGetStdntMark(){
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject = new Subject("VBA", 40,0,10);

        System.out.println("method \"getStdntMark\" -> " + (subject.getStdntMark() == 10) + ": expected " + 10 +
                ", result " + subject.getStdntMark());
    }

    public static void testStudy(){
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject = new Subject("JavaScript", 30,5,0);
        student.addSubject(subject);

        student.study(subject, 10);

        System.out.println("method \"study\" -> " + (subject.getCntWorkedHours() > student.getCntWorkedHoursBeforeChange())
                + ": expected " + ((student.getCntWorkedHoursBeforeChange() + 10) > subject.getNmbrHours() ?
                subject.getNmbrHours() : (student.getCntWorkedHoursBeforeChange() + 10)) + ", result " + subject.getCntWorkedHours());
    }

    public static void testAddSubject(){
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject = new Subject("JAVA", 40,0,0);

        student.addSubject(subject);

        System.out.println("method \"addSubject\" -> " + (student.getSbjctCounter() !=0) + ": expected " + 1 +
                ", result " + student.getSbjctCounter());
    }

    public static void testRemoveSubject(){
        Student student = new Student("Kristi", "Brovary", new Subject[3]);
        Subject subject1 = new Subject("JAVA", 40,0,0);
        Subject subject2 = new Subject("JavaScript", 30,5,0);
        student.addSubject(subject1);
        student.addSubject(subject2);

        student.removeSubject();

        System.out.println("method \"removeSubject\" -> " + (student.getSbjctCounter() == 1) + ": expected " + 1 +
                ", result " + student.getSbjctCounter());
    }

    public static void testShowAllInfoAboutSubjects(){
        Student student = new Student("Kristi", "Brovary", new Subject[3]);
        Subject subject1 = new Subject("JAVA", 40,15,10);
        Subject subject2 = new Subject("JavaScript", 30,10,9);
        Subject subject3 = new Subject("VBA", 20,5,10);
        student.addSubject(subject1);
        student.addSubject(subject2);
        student.addSubject(subject3);

        System.out.println("method \"showAllInfoAboutSubjects\": ->");
        student.showAllInfoAboutSubjects();
    }

    public static void testGetAverageMark(){
        Student student = new Student("Kristi", "Brovary", new Subject[3]);
        Subject subject1 = new Subject("JAVA", 40,15,10);
        Subject subject2 = new Subject("JavaScript", 30,10,9);
        Subject subject3 = new Subject("VBA", 20,5,10);
        student.addSubject(subject1);
        student.addSubject(subject2);
        student.addSubject(subject3);

        System.out.printf("method \"getAverageMark\": -> %.1f", student.getAverageMark());
    }
}
