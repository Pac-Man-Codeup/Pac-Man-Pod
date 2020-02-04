package noland;
//6KYU
public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
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
}

