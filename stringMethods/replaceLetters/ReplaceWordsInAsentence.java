package replaceLetters;

public class ReplaceWordsInAsentence {
    public static void main(String[] args) {
        String sentence = "I want to go to kabul and kabul is good then kabul";

        System.out.println(sentence.replace("kabul","mazar")); // replace one word
        System.out.println(sentence.replace("and kabul","and mazar")); // replace middle word
        System.out.println(sentence.replace("kabul","mazar").replace("go ","come ")); //replace two words
        System.out.println(sentence.replace("kabul","mazar").replace("go ","come ").replace("good","bad"));

    }
}
