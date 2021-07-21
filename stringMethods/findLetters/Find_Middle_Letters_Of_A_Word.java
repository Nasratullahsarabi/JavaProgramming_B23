package findLetters;

public class Find_Middle_Letters_Of_A_Word {
    public static void main(String[] args) {
        String word = "Afghanistan";

        System.out.println(word.substring(0,word.length()/2)); // first half of the word
        System.out.println(word.substring(word.length()/2)); // second half of the word
        System.out.println("============================================");
        System.out.println(word.charAt(word.length()/2)); // one middle letter
        System.out.println("==============================");

        System.out.println(word.substring(word.length()/2-1,word.length()/2+1)); // two middle letters
        System.out.println(word.substring(word.length()/2-1,word.length()/2+2)); // three middle letters
        System.out.println(word.substring(word.length()/2-2,word.length()/2+2)); // four middle letters

    }
}
