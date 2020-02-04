package noland;
//8KYU
public class IsItANumber {
    public boolean isDigit(String s) {
        s.trim();
        if (s.matches("([-][0-9]{1,})") || s.matches("([0-9]{1,})") || s.matches("([0-9]{1,}[.][0-9]{1,})") || s.matches("([-][0-9]{1,}[.][0-9]{1,})")) {
            System.out.println(s);
            return true;
        } else {
            System.out.println(s);
            return false;
        }
    }
}
