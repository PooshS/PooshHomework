package oop.week4.videoLessons_ACO15_week6.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        //iteration();

        int[] mas1 = {1,2,3,4,5,6,7};
        Arrays.stream(mas1);

        List<String> doubles = Stream.generate(Math::random).limit(1000).map(Object::toString).collect(Collectors.toList());
        String resDoubl = String.join(" | ", doubles);

        System.out.println(resDoubl);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        /*Function<Integer, Integer> multFunct = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
            ||
        Function<Integer, Integer> multFunct = num -> num * 2;*/


        /*Function<Integer, Integer> minusFunct = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer - 10;
            }
        };
            ||
        Function<Integer, Integer> minusFunct = a -> a - 10;*/


        /*Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
            ||
        Predicate<Integer> evenPredicate = (num) -> num % 2 == 0;*/


        /*IntFunction<Integer[]> intFunction = new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[]{value};
            }
        };*/

        Object[] mas = numbers.stream().map(num -> num * 2).map(a -> a - 10).filter(num -> num % 2 == 0).toArray();

        System.out.println(Arrays.toString(mas));

        numbers.stream().flatMap((integer) -> Stream.of(integer / 2, integer % 2)).sorted()
                .forEach(System.out::print);// the same like this --> ((num) -> System.out.print(num + " "));

        List<Integer> integers = numbers.stream().flatMap((integer) -> Stream.of(integer / 2, integer % 2)).sorted()
                .collect(Collectors.toList());

        System.out.println();

        String res = numbers.stream().flatMap((integer) -> Stream.of(integer / 2, integer % 2)).sorted()
                .map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(res);

    }

    public static void iteration(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        // mult by 2, - 9, only even, toString, formatting

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i) * 2);
            numbers.set(i,numbers.get(i) - 9);
            if (numbers.get(i)%2 != 0){
                numbers.remove(i);
            }
            sb.append(numbers.get(i));

        }

        System.out.println(sb.toString());
    }

}
