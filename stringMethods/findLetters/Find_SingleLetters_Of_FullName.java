package findLetters;

public class Find_SingleLetters_Of_FullName {
    public static void main(String[] args) {
        String fullName = "Nasrat Sarabi";
        int space = fullName.indexOf(" "); // to find the index number
        System.out.println("==Finding first letter of two words using charAt method==");
        System.out.println(fullName.charAt(0)+""+fullName.charAt(space+1)); //first ltrs
        System.out.println(fullName.charAt(1)+""+fullName.charAt(space+2)); //second ltrs
        System.out.println("==Finding first letter of two words using substring method==");
        System.out.println(fullName.substring(0,1)+fullName.substring(space+1,space+2)); // first ltrs
        System.out.println(fullName.substring(1,2)+fullName.substring(space+2,space+3)); // second ltrs
        System.out.println("==Finding first letter and last letter of the full name==");
        System.out.println(fullName.charAt(0)+""+fullName.charAt(fullName.length()-1)); // first and last
        System.out.println(fullName.substring(space-1,space)+fullName.substring(space+1,space+2)); //last of first name and first of last name




    }

}
