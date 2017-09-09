package oop.week2.comp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {

    public static void main(String[] args) {
        int[] mas = {67, 3, 47, 58, 61, 17};

        int[] cloned =
                Arrays.copyOf(mas, mas.length);

        int[] range =
                Arrays.copyOfRange(mas, 1, 3);

        boolean equal = Arrays.equals(mas, cloned);

        String strMas = Arrays.toString(mas);

        Arrays.fill(mas, 2);

        Arrays.sort(mas);


        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Vaska", 5,5);
        cats[1] = new Cat("Murchik", 5,8);
        cats[2] = new Cat("Rizik", 6,7);
        cats[3] = new Cat("Cote", 5,4);
        cats[4] = new Cat("Bonia", 4,6);

        Object[] m = cats;

        Arrays.sort(cats);

        String res = Arrays.toString(cats);

        System.out.println(res);

        Arrays.sort(cats, new CatNameComparator());

        System.out.println(Arrays.toString(cats).replaceAll("\\}","\\}\n"));
    }

}

class  Cat implements Comparable{

    private String petName;
    private double weight;
    private int age;

    public Cat(String petName, double weight, int age) {
        this.petName = petName;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;

        /*return this.age > other.age ? 1 : this.age < other.age ? -1 : 0;*/
        return this.age - other.age;
    }
}

class CatNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getPetName().compareTo(o2.getPetName());
    }
}