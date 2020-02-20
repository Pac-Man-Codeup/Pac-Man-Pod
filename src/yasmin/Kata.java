package yasmin;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {

//        System.out.println(remove("yasmin"));
//        System.out.println(oddCount(8));
//        System.out.println(zeroFuel(50, 25, 2));// true
//        System.out.println(zeroFuel(100, 50, 1)); // false

        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(nearestSq(17));

    }


    // TODO Count Odd Numbers below n.
    //  Given a number n, return the number of positive odd numbers below n, EASY!

//    public static int oddCount(int n) {
//        return n / 2;
//    }


    // TODO Remove First and Last Character

//    public static String remove(String str) {
    //substring(int beginIndex, int endIndex)
//        return str.substring(1, str.length() - 1);
//    }

    //TODO You were camping with your friends far away from home, but when it's time to go back, you realize that you fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left. Considering these factors, write a function that tells you if it is possible to get to the pump or not. Function should return true if it is possible and false if not. The input values are always positive.

//    static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
//        return distanceToPump <= mpg * fuelLeft;
//    }
//}

// TODO Check a Leap Year
//class LeapYear {
//    public static void main(String[] args) {
//        int inputYear;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any Year:");
//        inputYear = scan.nextInt();
//
//        // divisible by 4 and not 100 or divisible by 400
//        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0))
//            System.out.format("%s year is a leap year", inputYear);
//        else
//            System.out.format("%s year is a not a leap year", inputYear);
//    }

    // TODO Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ().
//    https://www.codewars.com/kata/expressions-matter

    static int expressionsMatter(int a, int b, int c) {
        return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
    }

    // TODO Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.

    //https://www.codewars.com/kata/find-nearest-square-number

    static int nearestSq(int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}