package oop.week1.homework;

/**
 * Created by Poosh on 06.09.2017.
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject1 = new Subject("JAVA", 40,0,0);
        Subject subject2 = new Subject("JavaScript", 30,0,0);
        student.addSubject(subject1);
        student.addSubject(subject2);

        testPassExam();
        testShowSublectInfo();
        testGetStdntMark();

        System.out.println("Done");
    }

    public static void testPassExam(){
        Student student = new Student("Kristi", "Brovary", new Subject[5]);
        Subject subject = new Subject("Pascal", 80,0,0);

        subject.passExam(11);

        System.out.println("method \"testPassExam\" -> " + (subject.getStdntMark() == 11) + ": expected " + 11 +
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
}
