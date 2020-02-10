package daynaLeal;

public class edabit2 {
    public static void main(String[] args) {
        int[] test1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] test2 = {44, 32, 86, 19};
//        System.out.println(differenceMaxMin(test1)); //82
        System.out.println(differenceMaxMin(test2)); //67

    }



    public static int differenceMaxMin(int[] arr) {
        int max = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(i + ":" + max);
            } else if(arr[i] < min || arr[i] < arr[i - 1]){
                min = arr[i];
                System.out.println(i + ":" + min);
            }
        }
        return max - min;
    }
}
