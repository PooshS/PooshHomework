package oop.week1.classwork;

public class Main {
    public static void main(String[] args) {

        testAddStudent();
        testGetStudent();
        testRemoveStudent();

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

}
