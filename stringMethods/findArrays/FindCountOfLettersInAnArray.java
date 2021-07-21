package findArrays;

public class FindCountOfLettersInAnArray {
    public static void main(String[] args) {
        String[]name = {"Ateequllah", "Jawad", "Nasrat", "Muzafar"};
        int sum = 0;
        for (int i = 0; i < name.length; i++) {

            sum += name[i].length();
            System.out.println(name[i].length()); // shows count of each word.

        }
        System.out.println("Total letters count"+sum); // shows the total count of letters 28

    }
}
