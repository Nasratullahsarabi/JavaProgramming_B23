package findWords;

public class FindSpacesIn_A_Sentence {
    public static void main(String[] args) {
        String sentence = "I want to go to kabul and mazar then kbul.";
        String space = " "; int spaceCount = 0;

        for (int i = 0; i < sentence.length()-space.length(); i++) {
            String each = sentence.substring(i,i+space.length());

            if (each.equals(space)){
                spaceCount++;
            }

        }
        System.out.println("spaceCount = " + spaceCount);
    }
}
