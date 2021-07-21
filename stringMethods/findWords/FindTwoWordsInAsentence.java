package findWords;

public class FindTwoWordsInAsentence {
    public static void main(String[] args) {
        String sentence = "Kabul, mazar MazariSharif, mazariSharif kabul kabul kabul way kabul.";
        String word1="Mazar", word2="Kabul";
        int countM =0, countK=0;

        for (int i =0; i<sentence.length()-(word1.length()) || i<sentence.length()-word2.length(); i++){
            String each = sentence.substring(i, i+word1.length());
            String each2 = sentence.substring(i, i+word2.length());

            if (each.equalsIgnoreCase("Mazar")){
                countM++;
            }
            if (each2.equalsIgnoreCase("kabul")){
                countK++;
            }

        }
        System.out.println("Mazar = "+countM+"  Kabul= "+countK);
        System.out.println("======================to find contains=======================");

        System.out.println(sentence.contains(word1));
        System.out.println(sentence.contains(word2));

    }
}
