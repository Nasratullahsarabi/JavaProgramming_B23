package findLetters;

public class Find_Letters_Of_A_Word {
    public static void main(String[] args) {
        String word = "Afghanistan";

        System.out.println(word.charAt(0));  //First Word using Char Method
        System.out.println(word.substring(0,1)); //First word using substirng method

        System.out.println("==============================");

        System.out.println(word.substring(0,2)); //first two letters

        System.out.println("==============================");

        System.out.println(word.substring(word.length()-1)); // last word

        System.out.println("==============================");

        System.out.println(word.substring(word.length()-2)); // last two last letters
        System.out.println("==============================");

        System.out.println(word.substring(word.length()-3)); // last two last letters

    }
}
