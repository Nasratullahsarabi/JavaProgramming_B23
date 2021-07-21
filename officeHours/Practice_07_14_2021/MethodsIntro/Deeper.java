package Practice_07_14_2021.MethodsIntro;

public class Deeper {

    public static void main(String[] args) {
        System.out.println("Not Deep1"); //1
        deep();
        System.out.println("Not Deep2"); // 4

    }

    public static void deep() {
        System.out.println(" Deep1");  // 2
        deeper();
        System.out.println(" Deep2"); //5

    }

    public static void deeper() {
        System.out.println(" Deeper"); //3

    }


}
