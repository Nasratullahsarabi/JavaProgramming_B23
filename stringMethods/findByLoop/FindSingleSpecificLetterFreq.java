package findByLoop;

public class FindSingleSpecificLetterFreq {
    public static void main(String[] args) {
        String word = "aaaaabbbbbbbbbbbccccccdddd";
        char ch = 'd'; int freq = 0;

        for (int i = 0; i < word.length(); i++) {
            char eachLtr = word.charAt(i);

            if (eachLtr == ch){
                freq++;
            }

        }
        System.out.println(freq);
    }
}
