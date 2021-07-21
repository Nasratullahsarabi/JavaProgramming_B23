package findLetters;

public class Find_Single_Letters_Of_A_Word {
    public static void main(String[] args) {
        String word = "Afghanistan";
        System.out.println(word.substring(1,2)); // second letter using_substring
        System.out.println(word.charAt(1)); // second letter using_charAt
        System.out.println("========================");
        System.out.println(word.charAt(word.length()-2)); // second letter from last charAt
        System.out.println(word.charAt(word.length()-3)); // third letter from last charAt

        System.out.println("========================");

        System.out.println(word.substring(word.length()-2,word.length()-1)); // scnd ltr from last_substring
        System.out.println(word.substring(word.length()-3,word.length()-2)); // third ltr from last_substring




    }

}
