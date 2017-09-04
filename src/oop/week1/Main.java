package oop.week1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.initStudent("Petia", 25, 5);

        Student student2 = new Student();
        student2.initStudent("Vasia", 30, 10);

        Student student3 = new Student();
        student3.initStudent("Ivan", 35, 15);

        Group gr1 = new Group();
        gr1.studentAdd(student1);
        gr1.studentAdd(student2);
        gr1.studentAdd(student3);

        testAddStudent(student3);
        System.out.println();
        testGetStudent(student2, gr1);
        System.out.println();
        gr1.showAll();
    }

    private static void testAddStudent(Student student){
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
    }

}
