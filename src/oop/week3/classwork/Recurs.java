package oop.week3.classwork;

public class Recurs {

    public static void main(String[] args) {

        String str = "8388";

        String start = str.substring(0, str.toCharArray().length - 1);
        String end = str.substring(str.toCharArray().length - 1);

        System.out.println(start);
        System.out.println(end);

        System.out.println(Test.rec("8388") ) ;
        System.out.println("test \"factorial\" method -> " + codingBat_Recursion1.factorial(6));
        System.out.println("test \"bunnyEars\" method -> " + codingBat_Recursion1.bunnyEars(6));
        System.out.println("test \"fibonacci\" method -> " + codingBat_Recursion1.fibonacci(7));
        System.out.println("test \"bunnyEars2\" method -> " + codingBat_Recursion1.bunnyEars2(5));
        System.out.println("test \"triangle\" method -> " + codingBat_Recursion1.triangle(5));
        }
}

class Test{

    public static int rec(String string) {

        if (string == null || string.isEmpty()) {
            return 0;
        }

        int res;

        String start = string.substring(0, string.toCharArray().length - 1);
        String end = string.substring(string.toCharArray().length - 1);

        if (end.equals("8")) {
            res = 1;
        } else {
            res = 0;
        }
        return res + rec(start);

    }
}
class codingBat_Recursion1 {

    /*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
    Compute the result recursively (without loops).*/

    public static int factorial(int n){

        if(n == 1){
            return 1;
        }

        return  n * (factorial(n - 1));

    }

    /*We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).*/

    public static int bunnyEars(int bunnies){
        if(bunnies == 0){
            return 0;
        }
        if(bunnies == 1){
            return 2;
        }

        return 2 + bunnyEars(--bunnies);

    }

    /*The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
    and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number,
    with n=0 representing the start of the sequence.*/

    public static int fibonacci(int n) {

        if(n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    /*We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).*/

    public static int bunnyEars2(int bunnies) {
        int ears;
        if (bunnies ==0){
            return 0;
        }
        if(bunnies%2 == 0){
            ears = 3;
        }else {
            ears = 2;
        }

        return (ears + bunnyEars2(--bunnies));
    }

    /*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
    the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
    the total number of blocks in such a triangle with the given number of rows.*/

    public static int triangle(int rows) {

        if(rows == 0){
            return 0;
        }
        if(rows == 1){
            return 1;
        }

        return rows + triangle(--rows);

    }
}



