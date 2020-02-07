package daynaLeal;

public class edabit {
    public static void main(String[] args){

        //#1
        System.out.println("test1\n"+ equal(1,1,2)); //2
        System.out.println("test2\n"+ equal(1,1,1)); //3
        System.out.println("test3\n"+ equal(1,2,3)); //0

        //#2
        System.out.println(canAlternate("0001111")); // true
        System.out.println(canAlternate("010011")); // true
        System.out.println(canAlternate("010001")); // false
        System.out.println(canAlternate("1111")); // false

        //#3
        System.out.println(totalCups(6)); //7
        System.out.println(totalCups(12)); //14
        System.out.println(totalCups(213)); //248
    }

    //1
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
//        }
//        if (a == c){
//            total++;
//            System.out.println("a=c:" + total);
//        }
//        if (b == c){
//            total++;
//            System.out.println("b=c:" + total);
//        }
//        return total;
//    }


        //2
        //Alternating Ones and Zeroes
        //Write a function that returns true if the binary string can be rearranged to form a string of alternating 0s and 1s.
        //NOTES:
        //No substring of the output may contain more than one consecutive repeating character (e.g. 00 or 11 are not allowed).
        //Return false if a string only contains 0s or only contains 1s.
        // EXAMPLES:
        // canAlternate("0001111") ➞ true
        //// Can make: "1010101"
        //
        //canAlternate("01001") ➞ true
        //// Can make: "01010"
        //
        //canAlternate("010001") ➞ false
        //
        //canAlternate("1111") ➞ false
        public static boolean canAlternate(String str) {
            int one = 0;
            int zero = 0;

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    one += 1;
                } else {
                    zero += 1;
                }
            }

            if(one == 0 || zero == 0){
                return false;
            } else if(Math.abs(zero - one) <= 1){
                return true;
            } else {
                return false;
            }
        }


        //3
        //Free Coffee Cups
        //Per 6 coffee cups I buy, I get a 7th cup free. In total, I get 7 cups. Create a function that takes n cups bought and return as an integer the total number of cups I would get.
        //NOTES:
        //Number of cups I bought + number of cups I got for free.
        //Only valid inputs will be given.
        // EXAMPLES:
        //totalCups(6) ➞ 7
        //totalCups(12) ➞ 14
        //totalCups(213) ➞ 248
        public static int totalCups(int n) {
            int freeCups = 0;
            for(int i = 1; i <= n; i++){
                if (i % 6 == 0){
                    freeCups += 1;
                    System.out.println(i + "+" + freeCups);
                }
            }
            return freeCups + n;
        }

}
