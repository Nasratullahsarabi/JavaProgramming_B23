package loopReplits;

import java.util.Scanner;

public class zombieCity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of pupolation");
        int inhabitant = scan.nextInt();
        int result = 0;

        for (int i = 0; i < inhabitant; i++) {
            if (inhabitant > 0) {
                System.out.println("Day 0 [" + inhabitant + "]");
            }
            if (inhabitant > 0) {
                System.out.println("Day 1 [" + inhabitant / 2 + "]");
            }
            if (inhabitant > 0) {
                System.out.println("Day 2 [" + inhabitant / 2 + "]");

            }
        }
    }
}