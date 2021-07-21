package swapLetters;

public class SwapFirstLetterWithLast {
    public static void main(String[] args) {
        String word = "Afghanistan";
        char firstL = word.charAt(0); // to find first letter
        char lastL =word.charAt(word.length()-1); // to find last letter
        String withOutFAndL = word.substring(1,word.length()-1); // to find word without first and last letter

        System.out.println(lastL+withOutFAndL+firstL); // swap the letters

    }

}
