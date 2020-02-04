package noland;
import java.util.Arrays;
//6KYU
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
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
}

