package oop.week3.classwork;

public class Recurs {

    public static void main(String[] args) {

        String str = "8388";

        String start = str.substring(0, str.toCharArray().length - 1);
        String end = str.substring(str.toCharArray().length - 1);

        System.out.println(start);
        System.out.println(end);

        System.out.println(Test.rec("8388") ) ;

        System.out.println("1. test \"factorial\" method -> " + codingBat_Recursion1.factorial(6));
        System.out.println("2. test \"bunnyEars\" method -> " + codingBat_Recursion1.bunnyEars(6));
        System.out.println("3. test \"fibonacci\" method -> " + codingBat_Recursion1.fibonacci(7));
        System.out.println("4. test \"bunnyEars2\" method -> " + codingBat_Recursion1.bunnyEars2(5));
        System.out.println("5. test \"triangle\" method -> " + codingBat_Recursion1.triangle(5));
        System.out.println("6. test \"sumDigits\" method -> " + codingBat_Recursion1.sumDigits(146));
        System.out.println("7. test \"count7\" method -> " + codingBat_Recursion1.count7(717));
        System.out.println("8. test \"count8\" method -> " + codingBat_Recursion1.count8(88788528));
        System.out.println("9. test \"powerN\" method -> " + codingBat_Recursion1.powerN(5,8));
        System.out.println("10. test \"countX\" method -> " + codingBat_Recursion1.countX("xxhixx"));
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


    /*Given a non-negative int n, return the sum of its digits recursively (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

    public static int sumDigits(int n) {
        if(n / 10 == 0){
            return n % 10;
        }
        return n % 10 + sumDigits(n/10);
    }


    /*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
    (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

    public static int count7(int n) {

        int res;
        if(n / 10 == 0){
            if(n % 10 == 7){
                return res = 1;
            } else{
                return res = 0;
            }
        }

        if(n % 10 == 7){
            res = 1;
        } else{
            res = 0;
        }

        return res = res + count7(n/10);

    }


    /*Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

    public static int count8(int n) {
        int res;
        if(n / 10 == 0){
            if(n % 10 == 8){
                return res = 1;
            } else{
                return res = 0;
            }
        }

        if(n % 10 == 8 && (n / 10) % 10 == 8){
            res = 2;
        } else if(n % 10 == 8 && (n / 10) % 10 != 8){
            res = 1;
        } else{
            res = 0;
        }

        return res = res + count8(n/10);
    }


    /*Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
    so powerN(3, 2) is 9 (3 squared).*/

    public static int powerN(int base, int n) {

        if(base < 1 || n < 1){
            return 0;
        }

        if(n == 1){
            return base;
        }

        int res;

        return res = base * powerN(base, --n);

    }


    /*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.*/

    public static int countX(String str) {

        if (str == null || str.isEmpty()){
            return 0;
        }

        int counter = str.length();

        int res;

        if(str.codePointAt(--counter)== 120){
            res = 1;
        }else{
            res = 0;
        }

        return res = res + countX(str.substring(0, counter));
    }
}



