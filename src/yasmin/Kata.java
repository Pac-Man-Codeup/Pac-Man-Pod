package yasmin;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        System.out.println(remove("yasmin"));
        System.out.println(oddCount(8));
    }


    // TODO Count Odd Numbers below n.
    //  Given a number n, return the number of positive odd numbers below n, EASY!

    public static int oddCount(int n) {
        return n / 2;
    }


    // TODO Remove First and Last Character

    public static String remove(String str) {
        //substring(int beginIndex, int endIndex)
        return str.substring(1, str.length() - 1);
    }
}


// TODO Check a Leap Year
class LeapYear {
    public static void main(String[] args) {
        int inputYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        inputYear = scan.nextInt();

        // evenly divisible by 4 and 100 or 400
        if (((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0))
            System.out.format("%s year is a leap year", inputYear);
        else
            System.out.format("%s year is a not a leap year", inputYear);
    }
}