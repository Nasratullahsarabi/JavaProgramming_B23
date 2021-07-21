package findWords;

public class FindAwordInASentence {
    public static void main(String[] args) {
        String sentence = "I want to go to Afghanista", word = "to";
        int count =0;

        System.out.println(sentence.contains(word));
        System.out.println("=================word frequency==================");

        for (int i = 0;i <= sentence.length()-word.length();i++){
            String each = sentence.substring(i,i+word.length());
            if (each.equals(word)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        System.out.println("===============================================");


    }
}