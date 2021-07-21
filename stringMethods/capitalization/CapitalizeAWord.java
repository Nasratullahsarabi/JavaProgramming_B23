package capitalization;

public class CapitalizeAWord {
    public static void main(String[] args) {
        String word = "unIted";

        System.out.println(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
    }
}
