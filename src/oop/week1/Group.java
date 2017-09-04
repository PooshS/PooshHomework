package oop.week1;

public class Group {

    Student[] list = new Student[3];

    public void studentAdd(Student st) {
        for (int j = 0; j < list.length; j++){
            if (list[j] == null) {
                list[j] = st;
            }
        }
    }

    public Student studentGet(String name){
        for(int i = 0; i < list.length; i++){
            if(list[i].name.equals(name)){
                return list[i];
            }
        }
        return null;
    }


}
