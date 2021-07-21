package findLetters;

public class Find_MultipleLetters_Of_Two_Separate_Words {
    public static void main(String[] args) {
        String word1 ="Nasrat";
        String word2 ="Sarabi";
        System.out.println("=========================first two and three letters=============");
        System.out.println(word1.substring(0,2)+word2.substring(0,2));// two ltrs of two words
        System.out.println(word1.substring(0,3)+word2.substring(0,3));// three ltrs of two words
        System.out.println("=========================Last two and three letters=============");
        System.out.println(word1.substring(word1.length()-2)+word2.substring(word2.length()-2));
        System.out.println(word1.substring(word1.length()-3)+word2.substring(word2.length()-3));
    }
}
