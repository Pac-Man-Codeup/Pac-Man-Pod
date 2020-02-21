package noland;
import java.util.*;
import java.util.stream.Collectors;

public class CodeWarsSolutions {
    //6KYU
    String[] whichAreIn(String[] array1, String[] array2) {
        String[] outputArr = new String[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i]) && !Arrays.asList(outputArr).contains(array1[i])) {
                    outputArr[k] = array1[i];
                    k++;
                }
            }
        }
        String[] returnArr = Arrays.copyOf(outputArr, k);
        Arrays.sort(returnArr);
        return returnArr;
    }
    //
    //6KYU
    String VasyaClerk(int[] peopleInLine) {
        int twentyFives = 0;
        int fifties = 0;
        int oneHundreds = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                twentyFives++;
            } else if (peopleInLine[i] == 50 && twentyFives > 0) {
                fifties++;
                twentyFives--;
            } else if (peopleInLine[i] == 100 && twentyFives > 0 && fifties > 0) {
                oneHundreds++;
                twentyFives--;
                fifties--;
            } else if (peopleInLine[i] == 100 && twentyFives >= 3) {
                oneHundreds++;
                twentyFives -= 3;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
    //
    //6KYU
    int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[i] + numbers[j] == target) {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new int[] {index1, index2};
    }
    //7KYU
    String jadenCase(String phrase) {
        if (phrase == "" || phrase == null) {
            return null;
        }
        String[] phraseArr = phrase.split(" ");
        for (int i = 0; i < phraseArr.length; i++) {
            phraseArr[i] = phraseArr[i].substring(0, 1).toUpperCase() + phraseArr[i].substring(1);
        }
        return String.join(" ", phraseArr);
    }
    //
    //8KYU
    boolean isItANumber(String s) {
        s.trim();
        if (s.matches("([-][0-9]{1,})") || s.matches("([0-9]{1,})") || s.matches("([0-9]{1,}[.][0-9]{1,})") || s.matches("([-][0-9]{1,}[.][0-9]{1,})")) {
            System.out.println(s);
            return true;
        } else {
            System.out.println(s);
            return false;
        }
    }
    //6KYU
    boolean takeATenMinuteWalk(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int north = 0;
        int east = 0;
        for (int i = 0; i < walk.length; i++) {
            switch(walk[i]) {
                case 'n':
                    north++;
                    break;
                case 's':
                    north--;
                    break;
                case 'e':
                    east++;
                    break;
                default:
                    east--;
                    break;
            }
        }
        if (north == 0 && east == 0) {
            return true;
        }
        return false;
    }
    //6KYU
    String duplicateEncoder(String word) {
        String output = word.toLowerCase();
        String[] wordArr = word.toLowerCase().split("");
        HashMap<String, Integer> wordList = new HashMap<>();
        for(String letter : wordArr) {
            if (wordList.get(letter) == null) {
                wordList.put(letter, 1);
            } else {
                wordList.put(letter, wordList.get(letter) + 1);
            }
        }
        for(HashMap.Entry<String, Integer> entry : wordList.entrySet()) {
            if (entry.getValue() > 1) {
                String pattern = entry.getKey();
                output = output.replace("" + pattern, "å");
            } else if (entry.getValue() == 1) {
                String pattern = entry.getKey();
                output = output.replace("" + pattern, "ç");
            }
        }
        output = output.replaceAll("å", ")");
        output = output.replaceAll("ç", "(");
        output = output.replaceAll("@", "");
        return output;
    }
    //6KYU
    public static long playingWithDigits(int n, int p) {
        String nStr = Integer.toString(n);
        double output = 0;
        for (int i = 0; i < nStr.length(); i++) {
            output += Math.pow(Double.parseDouble(Character.toString(nStr.charAt(i))), p);
            p++;
        }
        int k = 1;
        if (output == 0 || (output / n) % 1 != 0) {
            k = -1;
        } else {
            k = (int) (output / n);
        }
        return k;
    }
    //6KYU
    public static int findTheParityOutlier(int[] integers){
        int outlier = 0;
        boolean isEven = false;
        if(integers[0] % 2 == 0 && integers[1] % 2 == 0 || integers[1] % 2 == 0 && integers[2] % 2 == 0) {
            isEven = true;
        }
        for(int num : integers) {
            if(isEven) {
                if(num % 2 != 0) {
                    outlier = num;
                    break;
                }
            } else {
                if(num % 2 == 0) {
                    outlier = num;
                    break;
                }
            }
        }
        return outlier;
    }
    //6KYU Performance
    //Works until it hits big data
    public static String numericalsOfAString(String s) {
        String[] strArr = s.split("");
        String output = "";
        Map<String, Integer> count = new HashMap<>();
        for(int i = 0; i < strArr.length / 2; i++) {
            if (count.get(strArr[i]) == null) {
                count.put(strArr[i], 1);
                output += count.get(strArr[i]);
            } else {
                count.put(strArr[i], count.get(strArr[i]) + 1);
                output += count.get(strArr[i]);
            }
        }
        for(int i = strArr.length / 2; i < strArr.length; i++) {
            if (count.get(strArr[i]) == null) {
                count.put(strArr[i], 1);
                output += count.get(strArr[i]);
            } else {
                count.put(strArr[i], count.get(strArr[i]) + 1);
                output += count.get(strArr[i]);
            }
        }
        return output;
    }
//    //6KYU Counting Duplicates
//    //Python
//    def duplicate_count(text):
//    text = text.lower()
//            return len([dup for dup in set(text) if text.count(dup) > 1])
//    //6KYU Array.diff
//    //Python
//    def array_diff(a, b):
//                return [num for num in a if num not in b]


    //6KYU Needs Refactor Check to MAKE SURE THIS IS THE CORRECT ONE
    public static boolean areTheyTheSame(int[] a, int[] b) {
        if(a == null || b == null || a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        for(Integer num : aList) {
            if(!bList.contains(num)) {
                return false;
            }
        }
        for(Integer num : bList) {
            if(!aList.contains(num)) {
                return false;
            }
            aList.remove(num);
        }
        return true;
    }
    //6KYU
    //PYTHON
//    import re
//    def ip_validation(strng):
//    pattern = re.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)$")
//
//            if pattern.match(strng):
//            return True
//    else:
//            return False
    //6KYU
    //PYTHON
//    def nth_fibonacci(n):
//    num0 = 0
//    num1 = 1
//            if n <= 1:
//            return num0
//    else:
//            for num in range(2,n):
//    num3 = num0 + num1
//            num0 = num1
//    num1 = num3
//        return num1
    //5KYU
    //Python
//    def moving_zeros_to_the_end(array):
//            for i, elem in enumerate(array):
//            if elem is False:
//    array[i] = "False"
//            if elem is 0:
//            array.append(array.pop(array.index(elem)))
//            for i, elem in enumerate(array):
//            if elem == "False":
//    array[i] = False
//    return array
    //7KYU
    public static String disemvowelTrolls(String str) {
        str = str.replaceAll("[aeiouAEIOU]", "");
        return str;
    }
}
