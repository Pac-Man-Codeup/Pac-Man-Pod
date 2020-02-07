package daynaLeal;

public class edabit {
    public static void main(String[] args){
        System.out.println("test1\n"+ equal(1,1,2)); //2
        System.out.println("test2\n"+ equal(1,1,1)); //3
        System.out.println("test3\n"+ equal(1,2,3)); //0
    }

    //equality of 3 values (MEDIUM):
    //Create a function that takes three integer arguments (a, b, c) and returns the number of equal values.
    //Your function must return 0, 2 or 3.
    //examples:
    //equal(3, 4, 3) ➞ 2
    //equal(1, 1, 1) ➞ 3
    //equal(3, 4, 1) ➞ 0
    public static int equal(int a, int b, int c) {
        //successful attempt
        if (a == b && b == c) {
            return 3;
        }
        if (a ==b || a == c || b == c){
            return 2;
        }
        return 0;
    }

        //first attempt
//        int total = 0;
//
//        if (a == b){
//            total++;
//            System.out.println("a=b:" + total);
//        } else if (a == c){
//            total++;
//            System.out.println("a=c:" + total);
//        } else if (b == c){
//            total++;
//            System.out.println("b=c:" + total);
//        }
//        return total;
//    }

}
