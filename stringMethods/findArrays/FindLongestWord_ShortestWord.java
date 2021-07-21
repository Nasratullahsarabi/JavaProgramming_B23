package findArrays;

public class FindLongestWord_ShortestWord {
    public static void main(String[] args) {

        String[]names = {"Nasrat","Asad","Ateeq","Muzafar"};
        String longest = "";

        for (int i = 0; i < names.length; i++) {

            if (names[i].length() > longest.length()){
                longest = names[i];
            }
        }
        System.out.println(longest);
        System.out.println("==================================================");


        String[]names2 = {"Nasa","Asas","As","h"};
        String shortes = names2[0];

        for (int j = 0; j < names2.length; j++) {

            if (names2[j].length() < shortes.length()){
                shortes = names2[j];
            }
        }
        System.out.println(shortes);

    }
}
