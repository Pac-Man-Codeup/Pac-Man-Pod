package daynaLeal;
import java.util.*;

public class edabit3 {
    public static void main(String[] args) {
        //1 Array of Multiples
        System.out.println(arrayOfMultiples(7,5)); //[7, 14, 21, 28, 35]
        System.out.println(arrayOfMultiples(12,10)); //[12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
        System.out.println(arrayOfMultiples(17,6)); //[17, 34, 51, 68, 85, 102]

        //2 Perfect Square Patch
        System.out.println(squarePatch(3).toString());
        System.out.println(squarePatch(5));
        System.out.println(squarePatch(1));
        System.out.println(squarePatch(0));
    }

    //1
    //Array of Multiples
    //Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
    //arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
    //arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
    //arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
    //Notice that num is also included in the returned array.
    public static int[] arrayOfMultiples(int num, int length) {
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = (num * (i+1));
            System.out.println(newArray[i]);
        }
        return newArray;
    }


    //2
    //Perfect Square Patch (2D arrays)
    //Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    //squarePatch(3) ➞ [
    //  [3, 3, 3],
    //  [3, 3, 3],
    //  [3, 3, 3]
    //]
    //
    //squarePatch(5) ➞ [
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5],
    //  [5, 5, 5, 5, 5]
    //]
    //
    //squarePatch(1) ➞ [
    //  [1]
    //]
    //
    //squarePatch(0) ➞ [] //if n=0 return an empty array
    public static int[][] squarePatch(int n) {
        int[][] arrayArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayArray[i][j]= n;
            }
        }
        return arrayArray;
    }
}
