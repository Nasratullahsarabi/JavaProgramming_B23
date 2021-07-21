package findLetters;

public class Find_UpperLower_DigitSpecialChar {
    public static void main(String[] args) {
        String sentence = "A1f2g$H%a3N&is@tan";

        String capital = "", lower = "", digit = "", specialChar = "";
        int    countC = 0,   countL= 0,  countD = 0, countSP = 0;

        for (int i = 0;i < sentence.length();i++){
            char ch = sentence.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                countC++;
                capital+=ch;
            }else if (ch >= 'a' && ch <='z' ){
                countL++;
                lower+=ch;
            }else if (ch >= '0' && ch <='9' ){
                countD++;
                digit+=ch;
            }else {
                countSP++;
                specialChar+=ch;
            }
        }
        System.out.println("capital = " + capital+". count: "+countC);
        System.out.println("lower = " + lower+". count: "+countL);
        System.out.println("digit = " + digit+". count: "+countD);
        System.out.println("specialChar = " + specialChar+". count: "+countSP);

    }
}
