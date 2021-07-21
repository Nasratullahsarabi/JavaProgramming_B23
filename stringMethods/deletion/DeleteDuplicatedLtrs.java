package deletion;

public class DeleteDuplicatedLtrs {
    public static void main(String[] args) {
        String word = "aaabbbjcccdddd"; String removeDup = "";

        for (int i = 0; i < word.length(); i++) {

            if (!removeDup.contains(""+word.charAt(i))){
                removeDup+=word.charAt(i);
            }

        }
        System.out.println(removeDup);

    }
}
