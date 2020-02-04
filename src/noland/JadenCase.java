package noland;
//7KYU
public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == "" || phrase == null) {
            return null;
        }
        String[] phraseArr = phrase.split(" ");
        for (int i = 0; i < phraseArr.length; i++) {
            phraseArr[i] = phraseArr[i].substring(0, 1).toUpperCase() + phraseArr[i].substring(1);
        }
        return String.join(" ", phraseArr);
    }
}
