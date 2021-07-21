package reversWords;

public class ReversByForEachLoop {
    public static void main(String[] args) {
        String[]names = {"Nasrat", "Ateeq", "Asad", "Wahid"};

        for (String each : names){
            String revers = "";
            for (int i = each.length()-1; i >= 0 ; i--) {

                revers+=each.charAt(i);

            }
            System.out.print(revers+" ");
        }
    }
}
