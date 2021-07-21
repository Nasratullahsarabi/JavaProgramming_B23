package replaceLetters;

public class ReplaceFirstAndLastWord {
    public static void main(String[] args) {
        String sentence = "mazar, kabul, kabul, mazar, kabul";
        System.out.println(sentence.replaceFirst("kabul", "ghazni"));
        System.out.println(sentence.replaceAll("kabul", "Ghazni"));
        System.out.println(sentence.replace("kabul", "samangan"));
    }
}
