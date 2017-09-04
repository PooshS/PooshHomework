package oop.week1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Petia";
        student1.age = 25;
        student1.rank = 5;

        Student student2 = new Student();
        student1.name = "Vasia";
        student1.age = 30;
        student1.rank = 10;

        Student student3 = new Student();
        student1.name = "Ivan";
        student1.age = 35;
        student1.rank = 15;

        Group gr1 = new Group();
        gr1.studentAdd(student1);

        /*System.out.println("method \"studentAdd\": \n" +
                "expected: " + student1.name + ", " + student1.age + ", " + student1.rank + "\n" +
                "get: " + gr1.list[0].name + ", " + gr1.list[0].age + ", " + gr1.list[0].rank + "\n" +
                "test result: " + (student1.name.equals(gr1.list[0].name) && student1.age == gr1.list[0].age &&
                student1.rank == gr1.list[0].rank));*/

        testAddStudent(student1);
        System.out.println();
        testGetStudent(student1, gr1);

        //System.out.println(testGetStudent(student1, gr1));
    }

    public static void testAddStudent(Student student){
        System.out.println("method \"studentAdd\": \n" +
                "expected: " + "Petia, 25, 5 \n" +
                "get: " + student.name + ", " + student.age + ", " + student.rank + "\n" +
                "test result: " + (student.name.equals("Petia") && student.age == 25 &&
                student.rank == 5));
    }

    public static void testGetStudent(Student student, Group gr){
        System.out.println("method \"studentGet\": \n" +
                "expected: " + student.name + ", " + student.age + ", " + student.rank + "\n" +
                "get: " + gr.list[0].name + ", " + gr.list[0].age + ", " + gr.list[0].rank + "\n" +
                "test result: " + (student.name.equals(gr.list[0].name) && student.age == gr.list[0].age &&
                student.rank == gr.list[0].rank));
    }

}
