package oop.week1.Model;

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

    public Student getStudent(int arrIndex){
        return list[arrIndex];
    }

    public int getCounter(){
        return counter;
    }

    public Student studentGet(String name){
        for(int i = 0; i < list.length && list[i]!= null; i++){
            if(list[i].getName().equals(name)){
                return list[i];
            }
        }
        System.out.println("Student " + name + " was not found");
        return null;
    }

    public void showAll(){
            for(int i = 0; i < list.length; i++){
                System.out.println(list[i].getName() + ", " + list[i].getAge() + ", " + list[i].getRank() + "\n");
        }
    }

    public Student studentRemove(String name){
        if (name == null || name.equals("")){
            System.out.println("invalid argument");
            return null;
        }
        for(int i = 0; i < list.length && list[i]!= null; i++){
            if(list[i].getName().equals(name)){
                Student student = list[i];
                list[i] = null;
                return student;
            }
        }
        System.out.println("student " + name + " was not found");
        return  null;
    }
}
