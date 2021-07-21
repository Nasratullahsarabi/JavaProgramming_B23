package swapLetters;

public class SwapTwoLettersOfWord {
    public static void main(String[] args) {
        String word = "Afghanistan";
        String fLetter = word.substring(0,2);
        String lLetter = word.substring(word.length()-2);
        String wordWithoutFL = word.substring(2,word.length()-2);

        System.out.println(lLetter+wordWithoutFL+fLetter);


    }
}
