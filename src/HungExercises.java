import java.util.Arrays;
import java.util.stream.IntStream;

public class HungExercises {
    public static void main(String[] args) {
        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
        System.out.println(comp(new int[]{}, new int[]{}));
    }


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
