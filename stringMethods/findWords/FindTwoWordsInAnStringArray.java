package findWords;

import Practice_07_07_2021.ArrayIntro;

import java.util.Arrays;

public class FindTwoWordsInAnStringArray {
    public static void main(String[] args) {

        String word = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] split = word.split(", ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].contains(" ")){
                System.out.println(split[i]);
            }
        }
        System.out.println("==================using for each loop=============");
        for (String each : split) {
            if (each.contains(" ")){
                System.out.println(each);
            }
            
        }

    }
}
