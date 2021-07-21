package reversWords;

public class ReverseOneElementOfArray {
    public static void main(String[] args) {

        String[]names = {"Nasrat", "Ateeq", "Asad", "Wahid"};

        String element = names[0], revers = "";

        for (int i = element.length()-1; i >= 0 ; i--) {
            revers += element.charAt(i);
        }
        System.out.println(revers);
    }
}
