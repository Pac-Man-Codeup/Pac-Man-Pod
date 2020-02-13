package daynaLeal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class edabit2 {
    public static void main(String[] args) {
        //1
        int[] test1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] test2 = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(test1)); //82 examplest taken from edabit
        System.out.println(differenceMaxMin(test2)); //67

        //2
        String testString = "The last letters of this string will be capitalized when done";
        System.out.println(capLast(testString));
        System.out.println(capLast("My Name Is Edabit"));
        System.out.println(capLast("HELp THe LASt LETTERs CAPITALISe"));

    }


    //1
    //Difference of Max and Min Numbers in Array
    //Create a function that takes an array and returns the difference between the biggest and smallest numbers.
    public static int differenceMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
//                System.out.println(i + ":" + max);
            } else if(arr[i] < min){
                min = arr[i];
//                System.out.println(i + ":" + min);
            }
        }
        return max - min;
    }

    //2
    //Capitalize the last letter
    //capLast("hello") ➞ "hellO"
    //capLast("My Name Is Edabit") ➞ "MY NamE IS EdabiT"
    //capLast("HELp THe LASt LETTERs CAPITALISe") ➞ "HELP THE LAST LETTERS CAPITALISE"
    public static String capLast(String str) {
        String[] stringArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String string : stringArr){
            int stringLength = string.length() ;
            int stringLengthMinus1 = string.length() -1;

            String lastLetter = string.substring(stringLengthMinus1, stringLength);
            string = string.substring(0, stringLengthMinus1) + lastLetter.toUpperCase();
            sb.append(string + " "); //to add a space between words
            System.out.println(sb);
        }
        sb.setLength(sb.length() - 1); //to take out the added space after the last word
        return (sb.toString());
    }

}


