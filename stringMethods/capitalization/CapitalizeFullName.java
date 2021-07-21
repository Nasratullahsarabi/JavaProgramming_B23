package capitalization;

public class CapitalizeFullName {
    public static void main(String[] args) {
        String fullName = "nasratullah sarabi";
        int spaceOfIndex = fullName.indexOf(" ");
        System.out.println(fullName.substring(0,1).toUpperCase()+fullName.substring(1,spaceOfIndex+1)
                .toLowerCase()+fullName.substring(spaceOfIndex+1,spaceOfIndex+2)
                .toUpperCase()+fullName.substring(spaceOfIndex+2).toLowerCase());


    }
}
