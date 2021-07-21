package loopReplits;

import java.util.Scanner;

public class repeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = scan.next(), sep = scan.next(), result = ""; int count = scan.nextInt();

        for (int i = 1; i < count+1; i++) {
            result+=word;
            if (i == count){
                break;
            }else{
                result+=sep;
            }

        }
        System.out.println(result);
    }
}
