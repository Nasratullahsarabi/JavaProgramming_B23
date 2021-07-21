package quize;

import java.util.Scanner;

public class quize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String last = scan.nextLine();
        int number = scan.nextInt()+1;

        String fullName = "";

        if (number % 2 ==0){
            fullName = first + " "+last;
        }else {
            first = "Not valid name";
        }
        System.out.println(fullName);
    }
}
