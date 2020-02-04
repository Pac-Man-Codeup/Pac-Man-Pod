package noland;
//6KYU
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target)
    {
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
}
