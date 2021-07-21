package reversWords;

public class ReversAword_Sentence {
    public static void main(String[] args) {
        String sentence = "I want to go to Afghanistan";

        for (int i = sentence.length()-1; i >= 0; i--) {
            char ch = sentence.charAt(i);
            System.out.print(ch);
        }
    }
}
