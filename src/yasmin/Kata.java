package yasmin;

public class Kata {
    public static void main(String[] args) {
        System.out.println(remove("yasmin"));
}


    // TODO Count Odd Numbers below n.
    //  Given a number n, return the number of positive odd numbers below n, EASY!

    public static int oddCount(int n) {
        return n / 2;
    }


    // TODO Remove First and Last Character

    public static String remove(String str) {
        //substring(int beginIndex, int endIndex)
        return str.substring(1, str.length() - 1);
    }
}
