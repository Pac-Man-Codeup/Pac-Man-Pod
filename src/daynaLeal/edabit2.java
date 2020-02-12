package daynaLeal;

import java.util.ArrayList;
import java.util.Collections;

public class edabit2 {
    public static void main(String[] args) {
        int[] test1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] test2 = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(test1)); //82 examplest taken from edabit
        System.out.println(differenceMaxMin(test2)); //67

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
}
