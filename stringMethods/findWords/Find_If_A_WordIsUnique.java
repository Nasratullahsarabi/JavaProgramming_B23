package findWords;

public class Find_If_A_WordIsUnique {
    public static void main(String[] args) {
        String sentence = "I want to go to kabul Mazar and kabul and and Mazar.";
        boolean isUniqe = (sentence.indexOf("Mazar") == sentence.lastIndexOf("Mazar"));

        System.out.println("isUniqe = " + isUniqe);


    }
}
