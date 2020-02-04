package noland;
import java.util.Arrays;
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
    public boolean isItANumber(String s) {
        s.trim();
        if (s.matches("([-][0-9]{1,})") || s.matches("([0-9]{1,})") || s.matches("([0-9]{1,}[.][0-9]{1,})") || s.matches("([-][0-9]{1,}[.][0-9]{1,})")) {
            System.out.println(s);
            return true;
        } else {
            System.out.println(s);
            return false;
        }
    }
    //

}
