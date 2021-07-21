package deletion;

public class DeleteExtraSpaces {
    public static void main(String[] args) {
        String sentence = "  Hello world      I      love      Java    ";
        String str[] = sentence.trim().split(" ");
        String result = "";

        for (int i = 0; i < str.length; i++) {

            if (!str[i].isEmpty()){
                result+=str[i]+" ";
            }
        }
        System.out.println("result = " + result);
        System.out.println("=========================Using for each loop");

        String sentence1 = "  Hello world      I      love      Java    ";
        String str1[] = sentence.trim().split(" ");
        String result1 = "";

        for (String each : str1) {
            if (!each.isEmpty()){
                result1+=each+" ";
            }
        }
        System.out.println("result1 = " + result1);
    }
}
