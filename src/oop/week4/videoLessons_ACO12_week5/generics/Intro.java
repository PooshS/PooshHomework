package oop.week4.videoLessons_ACO12_week5.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Intro {

    public static void main(String[] args) {

        Container container = new Container();
        container.setEl(23);
        Double d = (Double) container.getEl();

        // since java 7
        Container<Integer> container1 = new Container<>();
        // before java 7
        // Container<Integer> container1 = new Container<Integer>();

        container1.setEl(23);
        Integer el = container1.getEl();

        Intro.<Integer,String>convert(23);


        // ? extends Number => Integer, Byte...
        // ? super Number => Number, Object
         List<? super Integer> l = new ArrayList<Number>();
         Object ob = l.get(0);

         compare(String.class, "Ivan", "3");

         Comparator<String> comparator = new MyStringComparator();
         compare2("Ivan", "Oleg", comparator);
    }

    public static<T extends Comparable<T>> int compare(Class<T> cl, T o1, T o2){
        return o1.compareTo(o2);
    }

    public static<E> int compare2(E o1, E o2, Comparator<E> comparator){
        return comparator.compare(o1, o2);
    }

    public static void iterateOver(List<?> al){

        for (Object o : al) {
            System.out.println(o);
        }

    }

    public static<X,Z> Z convert(X x){
        return null;
    }

    public static class MyStringComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return 0;
        }
    }

}
