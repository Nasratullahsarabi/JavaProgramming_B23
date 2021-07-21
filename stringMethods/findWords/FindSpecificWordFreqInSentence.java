package findWords;

public class FindSpecificWordFreqInSentence {
    public static void main(String[] args) {
        String sentence = "I want to go to Mazar, Mazar is a city in Afg and Mazar is the best";
        String word = "Mazar";
        int count = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word, ""); // to find a word count we need to first replace the word with ""
            count++;
        }
        System.out.println("count = " + count); // 3
    }
}
