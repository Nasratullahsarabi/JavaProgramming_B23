package findLetters;

public class Find_SingleLetters_Of_Two_Separate_Words {
    public static void main(String[] args) {
        String word1 = "Nasrat";
        String word2 = "Sarabi";
        System.out.println(word1.charAt(0)+""+word2.charAt(0)); // First letters of two words
        // if not concat (+""+) digits will be printed
        System.out.println("=============charAt method of first letters=============================");
        System.out.println(word1.charAt(1)+""+word2.charAt(1)); // Second letters of two words
        System.out.println("=============Substring method=============================");
        System.out.println(word1.substring(0,1)+word2.substring(0,1)); //first letters
        System.out.println(word1.substring(1,2)+word2.substring(1,2)); // second letters
        System.out.println("===============charAt method of last letters====================");
        System.out.println(word1.charAt(word1.length()-1)+""+word2.charAt(word2.length()-1));
        System.out.println(word1.charAt(word1.length()-2)+""+word2.charAt(word2.length()-2));
        System.out.println("===============substring method of last letters====================");
        System.out.println(word1.substring(word1.length()-1)+word2.substring(word2.length()-1));
        System.out.println(word1.substring(word1.length()-2,word1.length()-1)+word2.substring(word2.length()-2,word2.length()-1));


    }
}
