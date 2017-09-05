package oop.week1.Testing;

import oop.week1.Model.Group;
import oop.week1.Model.Student;

public class Main {
    public static void main(String[] args) {

        testAddStudent();
        testGetStudent();
        testRemoveStudent();

        /*Student student1 = new Student("Petia", 25, 5);

        Student student2 = new Student("Vasia", 30, 10);

        Student student3 = new Student("Ivan", 35, 15);*/

        /*Group gr1 = new Group();
        gr1.studentAdd(student1);
        gr1.studentAdd(student2);
        gr1.studentAdd(student3);*/

        /*testAddStudent(student3);
        System.out.println();
        testGetStudent(student2, gr1);
        System.out.println();
        gr1.showAll();*/

    }

    private static void testAddStudent(){
        Group gr1 = new Group();
        Student student = new Student("Petia", 25, 5);
        gr1.studentAdd(student);

        System.out.println("method \"testAddStudent\" -> " + (true == (gr1.getCounter() == 1)) +
                            ":\n\t expected " + true + ", result " + (gr1.getCounter() == 1));
    }

    private static void testGetStudent(){
        Group gr1 = new Group();
        Student student1 = new Student("Petia", 25, 5);
        gr1.studentAdd(student1);
        Student student2 = new Student("Vasia", 30, 10);
        gr1.studentAdd(student2);
        Student student3 = new Student("Ivan", 35, 15);
        gr1.studentAdd(student3);

        Student student = gr1.studentGet("Vasia");

        System.out.println("method \"testGetStudent\" -> " + (true == (student == gr1.getStudent(1))) +
                ":\n\t expected " + true + ", result " + (student == gr1.getStudent(1)));
    }

    private static void testRemoveStudent(){
        Group gr1 = new Group();
        Student student1 = new Student("Petia", 25, 5);
        gr1.studentAdd(student1);
        Student student2 = new Student("Vasia", 30, 10);
        gr1.studentAdd(student2);
        Student student3 = new Student("Ivan", 35, 15);
        gr1.studentAdd(student3);

        Student student = gr1.studentRemove("Vasia");

        System.out.println("method \"testRemoveStudent\" -> " + (true == (student == student2)) +
                ":\n\t expected " + true + ", result " + (student == student2));
    }

    /*private static void testAddStudent(Student student){
        System.out.println("method \"studentAdd\": \n" +
                "expected: " + "Ivan, 35, 15 \n" +
                "get: " + student.name + ", " + student.age + ", " + student.rank + "\n" +
                "test result: " + (student.name.equals("Ivan") && student.age == 35 &&
                student.rank == 15));
    }

    private static void testGetStudent(Student student, Group gr){
        System.out.println("method \"studentGet\": \n" +
                "expected: " + student.name + ", " + student.age + ", " + student.rank + "\n" +
                "get: " + gr.list[1].name + ", " + gr.list[1].age + ", " + gr.list[1].rank + "\n" +
                "test result: " + (student.name.equals(gr.list[1].name) && student.age == gr.list[1].age &&
                student.rank == gr.list[1].rank));
    }*/

}
