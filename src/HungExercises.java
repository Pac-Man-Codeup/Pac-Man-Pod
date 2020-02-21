import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HungExercises {
    public static void main(String[] args) {
        //Exercise 1
//        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
//        System.out.println(comp(new int[]{}, new int[]{}));

        //Exercise 2
//        factors(50);
//        factors(86240);
//        jumpingNumber(556847);
//        System.out.println(sumDigPow(2627876, 2647441));
        /*2627876
2647441*/
//        System.out.println(tidyNumber(212));
//        System.out.println(remove("eloquent"));
//        System.out.println(solution("world"));
/*        System.out.println(Arrays.toString(snail(new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}})));*/

/*        System.out.println(sixBitNumber(""));
        System.out.println(sixBitNumber("0"));
        System.out.println(sixBitNumber("00"));
        System.out.println(sixBitNumber("55"));
        System.out.println(sixBitNumber("63"));
        System.out.println(sixBitNumber("64"));
        System.out.println(sixBitNumber("-0"));
        System.out.println(sixBitNumber("-5"));
        System.out.println(sixBitNumber("05"));
        System.out.println(sixBitNumber("5"));*/

/*        System.out.println(isVowel(""));
        System.out.println(isVowel("a"));
        System.out.println(isVowel("E"));
        System.out.println(isVowel("ou"));
        System.out.println(isVowel("z"));
        System.out.println(isVowel("lol"));*/
       /* int clues[][] = {
                {2, 2, 1, 3,
                        2, 2, 3, 1,
                        1, 2, 2, 3,
                        3, 2, 1, 3},

                {0, 0, 1, 2,
                        0, 2, 0, 0,
                        0, 3, 0, 0,
                        0, 1, 0, 0}
        };


        int outcomes[][][] = {
                        {{1, 3, 4, 2},
                        {4, 2, 1, 3},
                        {3, 4, 2, 1},
                        {2, 1, 3, 4}},

                {{2, 1, 4, 3},
                        {3, 4, 1, 2},
                        {4, 2, 3, 1},
                        {1, 3, 2, 4}}
        };

        int[] clue1 = {2, 2, 1, 3,
                2, 2, 3, 1,
                1, 2, 2, 3,
                3, 2, 1, 3};
        solvePuzzle(clue1);*/
//        System.out.println(number(Arrays.asList("a", "b", "c")));
//        System.out.println(number(Arrays.asList("", "", "", "", "")));

//        System.out.println(duplicateCount("indivisibility"));
//        System.out.println(duplicateCount("abcdea"));
//        System.out.println(duplicateCount("abcde"));

        System.out.println(divide(2));
        System.out.println(divide(3));
        System.out.println(divide(4));
        System.out.println(divide(5));
        System.out.println(divide(6));
    }
    /*It's too hot, and they can't even…
    One hot summer day Pete and his friend Billy decided to buy watermelons. They chose the biggest crate. They rushed home, dying of thirst, and decided to divide their loot, however they faced a hard problem.
    Pete and Billy are great fans of even numbers, that's why they want to divide the number of watermelons in such a way that each of the two parts consists of an even number of watermelons. However, it is not obligatory that the parts are equal.
    Example: the boys can divide a stack of 8 watermelons into 2+6 melons, or 4+4 melons.
    The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, whether they can divide the fruits in the way they want. For sure, each of them should get a part of positive weight.
    Task
    Given an integral number of watermelons w (1 ≤ w ≤ 100; 1 ≤ w in Haskell), check whether Pete and Billy can divide the melons so that each of them gets an even amount.
    Examples
    divide(2) == false // 2 = 1 + 1
    divide(3) == false // 3 = 1 + 2
    divide(4) == true  // 4 = 2 + 2
    divide(5) == false // 5 = 2 + 3
    divide(6) == true  // 6 = 2 + 4*/
    public static boolean divide(int weight) {
        return ((weight % 2) == 0) && weight != 2;
    }

    /*Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice*/
    public static int duplicateCount(String text) {
        int count = 0;
        char ch;
        text = text.toLowerCase();
        List<Character> doubles = new ArrayList<>();
        for (char c : text.toCharArray()) {
            ch = Character.toLowerCase(c);
            if ((text.indexOf(ch) != text.lastIndexOf(ch)) && !doubles.contains(ch)) {
                doubles.add(ch);
                count++;
            }
        }
        return count;
    }

    /*Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
    Write a function which takes a list of strings and returns each line prepended by the correct number.
    The numbering starts at 1. The format is n: string. Notice the colon and space in between.
    Examples:
    number(Arrays.asList()) # => []
    number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]*/
    public static List<String> number(List<String> lines) {
        // TODO
        int index = 1;
        String itemMarkup;
        List<String> returnList = new ArrayList<>();
        for (String item : lines) {
            itemMarkup = String.format("%d: %s", index, item);
            returnList.add(itemMarkup);
            index++;
        }
        return returnList;
    }

    static int[][] solvePuzzle(int[] clues) {
        int[][] matrix = new int[4][4];
        // clues of 1
        for (int i = 0; i < clues.length; i++) {
            if (clues[i] == 1) {
                switch (i) {
                    case 0:
                    case 15:
                        matrix[0][0] = matrix.length;
                        break;
                    case 1:
                        matrix[0][1] = matrix.length;
                        break;
                    case 2:
                        matrix[0][2] = matrix.length;
                        break;
                    case 3:
                    case 4:
                        matrix[0][3] = matrix.length;
                        break;
                    case 5:
                        matrix[1][3] = matrix.length;
                        break;
                    case 6:
                        matrix[2][3] = matrix.length;
                        break;
                    case 7:
                    case 8:
                        matrix[3][3] = matrix.length;
                        break;
                    case 9:
                        matrix[3][2] = matrix.length;
                        break;
                    case 10:
                        matrix[3][1] = matrix.length;
                        break;
                    case 11:
                    case 12:
                        matrix[3][0] = matrix.length;
                        break;
                    case 13:
                        matrix[2][0] = matrix.length;
                        break;
                    case 14:
                        matrix[1][0] = matrix.length;
                        break;
                }
            }
            // clues of n -> (4)
            if (clues[i] == matrix.length) {
                switch (i) {
                    case 0:
                    case 15:
                        matrix[0][0] = 1;
                        break;
                    case 1:
                        matrix[0][1] = 1;
                        break;
                    case 2:
                        matrix[0][2] = 1;
                        break;
                    case 3:
                    case 4:
                        matrix[0][3] = 1;
                        break;
                    case 5:
                        matrix[1][3] = 1;
                        break;
                    case 6:
                        matrix[2][3] = 1;
                        break;
                    case 7:
                    case 8:
                        matrix[3][3] = 1;
                        break;
                    case 9:
                        matrix[3][2] = 1;
                        break;
                    case 10:
                        matrix[3][1] = 1;
                        break;
                    case 11:
                    case 12:
                        matrix[3][0] = 1;
                        break;
                    case 13:
                        matrix[2][0] = 1;
                        break;
                    case 14:
                        matrix[1][0] = 1;
                        break;
                }
            }
        }

//        for (int i = 0; i < )


        for (int[] row : matrix) {
            System.out.println("+---+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+---+");

/*        for (int item : clues) {
            System.out.println(item);
        }*/
        return new int[4][4];
    }


    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }

    /*Implement String#six_bit_number?, which should return true if given object is a number representable by 6 bit unsigned integer (0-63), false otherwise.
    It should only accept numbers in canonical representation, so no leading +, extra 0s, spaces etc.*/
    public static boolean sixBitNumber(String n) {
        return n.matches("([1-5])?\\d|([1-6])[0]|([1-6])?[1-3]");
    }

    /*int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
     Answer: int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};*/
    /*Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.*/
    public static int[] snail(int[][] array) {
        IntStream.Builder sequence = IntStream.builder();
        int i, k = 0, l = 0;
        int m = array.length;
        int n = array[0].length;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                sequence.add(array[k][i]);
            }
            k++;
            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                sequence.add(array[i][n - 1]);
            }
            n--;
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    sequence.add(array[m - 1][i]);
                }
                m--;
            }
            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    sequence.add(array[i][l]);
                }
                l++;
            }
        }
        return sequence.build().toArray();
    }

    /*Complete the solution so that it reverses the string value passed into it.
    Kata.solution("world") //returns "dlrow"*/
    public static String solution(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    //    It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    //    Find the total sum of internal angles in an n-sided simple polygon. N will be greater than 2.
//    assertEquals(AngleSum.sumOfAngles(3),180);
//    assertEquals(AngleSum.sumOfAngles(4),360);
    public static int sumOfAngles(int n) {
        // (n-2) × 180° - the sum of internal angles, (n-2) × 180° / n - each angle
        return (n - 2) * 180;
    }


    /*Definition
    A Tidy number is a number whose digits are in non-decreasing order.
    Given a number, Find if it is Tidy or not .
    tidyNumber (12) ==> return (true)
    */
    public static boolean tidyNumber(int number) {
        String[] numberArray = Integer.toString(number).split("");
        for (int i = 0; i < numberArray.length; i++) {
            if (i == numberArray.length - 1) break;
            if (Integer.parseInt(numberArray[i]) > Integer.parseInt(numberArray[i + 1])) return false;
        }
        return true;
    }

    /*The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
    In effect: 89 = 8^1 + 9^2
    The next number in having this property is 135.
    See this property again: 135 = 1^1 + 3^2 + 5^3
    We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.*/
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
