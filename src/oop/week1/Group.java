package oop.week1;

public class Group {

    Student[] list = new Student[3];

    private int counter = 0;

    public void studentAdd(Student student) {
        if(student == null) {
            System.out.println("Invalid argument");
        } else  if (counter == list.length){
            System.out.println("Group is full");
        } else  {
            list[counter] = student;
            counter ++;
        }
        /*for (int j = 0; j < list.length; j++){
            if (list[j] == null) {
                list[j] = student;
            }
        }*/
    }

    public Student studentGet(String name){
        for(int i = 0; i < list.length && list[i]!= null; i++){
            if(list[i].name.equals(name)){
                return list[i];
            }
        }
        System.out.println("Student " + name + " was not found");
        return null;
    }

    public void showAll(){
            for(int i = 0; i < list.length; i++){
                System.out.println(list[i].name + ", " + list[i].age + ", " + list[i].rank + "\n");
        }
    }
}
