import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HungExercises {
    public static void main(String[] args) {
        //Exercise 1
//        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
//        System.out.println(comp(new int[]{}, new int[]{}));

        //Exercise 2
//        factors(50);
//        factors(86240);
//        jumpingNumber(556847);
        System.out.println(sumDigPow(2627876, 2647441));
        /*2627876
2647441*/
    }e
    public static List<Long> sumDigPow(long a, long b) {
        long sum;
        List<Long> returnList = new ArrayList<>();
        String[] strArray;
        for (long i = a; i <= b; i++) {
            strArray = Long.toString(i).split("");
            sum = 0;
            for (int j = 0; j < strArray.length; j++) {
                sum += Math.pow(Long.parseLong(strArray[j]), j + 1);
            }
            if (sum == i) {
                returnList.add(i);
            }
        }
        return returnList;
    }

/*    public static String jumpingNumber(int number) {
        String[] strNum = Integer.toString(number).split("");
        System.out.println(Arrays.toString(strNum));
//        for (int i = 0; i < strNum.length(); i++) {
//            if ()
//        }
        return "Do your magic!";
    }*/


    /*Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
     "(p1**n1)(p2**n2)...(pk**nk)"
    with the p(i) in increasing order and n(i) empty if n(i) is 1.
    Example: n = 86240 should return "(2**5)(5)(7**2)(11)"*/
    public static String factors(int n) {
        int remaining = n;
        String returnStr = "";
        ArrayList<Integer> primeFactors = new ArrayList<>();
        // Creates the prime factors array
        for (int i = 2; i <= remaining; i++) {
            while (remaining % i == 0) {
                remaining = remaining / i;
                primeFactors.add(i);
                if (remaining % i != 0) {
                    break;
                }
            }
        }
        // Creates the returnString format
        int count = 1;
        for (int i = 0; i < primeFactors.size(); i++) {
            // If the index reaches the last element, concat the last element based on count.
            if ((i == primeFactors.size() - 1) && count <= 1) {
                returnStr += "(" + primeFactors.get(i) + ")";
                continue;
            } else if ((i == primeFactors.size() - 1) && count > 1) {
                returnStr += "(" + primeFactors.get(i) + "**" + count + ")";
                continue;
            }
            if (primeFactors.get(i).equals(primeFactors.get(i + 1))) {
                count++;
            } else {
                if (count > 1) {
                    returnStr += "(" + primeFactors.get(i) + "**" + count + ")";
                } else {
                    returnStr += "(" + primeFactors.get(i) + ")";
                }
                count = 1;
            }
        }
        return returnStr;
    }

    /*Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

    Examples
    Valid arrays
    a = [121, 144, 19, 161, 19, 144, 19, 11]
    b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
    comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

    a = [121, 144, 19, 161, 19, 144, 19, 11]
    b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]*/
    public static boolean comp(int[] a, int[] b) {
        boolean equal = true;
        int[] testArray = new int[a.length];
        if (a == null || b == null) {
            return false;
        } else if (a.length == 0 && b.length == 0) {
            return true;
        } else if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            testArray[i] = (int) Math.pow(a[i], 2);
        }
        Arrays.sort(b);
        Arrays.sort(testArray);
        for (int i = 0; i < a.length; i++) {
            if (!(testArray[i] == b[i])) {
                equal = false;
                break;
            }
        }
        return equal;
    }
}
