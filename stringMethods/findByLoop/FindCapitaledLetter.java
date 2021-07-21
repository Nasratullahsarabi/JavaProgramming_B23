package findByLoop;

public class FindCapitaledLetter {
    public static void main(String[] args) {
        String sentence = " I want to go to Kabul, Mazar in Afghanistan";
        String merge = sentence.replace(" ","");

        String result = ""; int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z'){
                System.out.println(result);
                result="";
            }
            if (i==0){
                result+=sentence.charAt(i);
            }else {
                result+=sentence.charAt(i);
            }

        }
        System.out.println(result);
    }
}
