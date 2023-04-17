import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "1234 - abc - 4321 - cba - 1a2b";
        char[] testChar = new char[4];
        s.getChars(0, 4, testChar, 0);
        char[] testChar1 = new char[4];
        s.getChars(13, 17, testChar1, 0);
        System.out.println(Arrays.toString(testChar) + Arrays.toString(testChar1));

        main1(s);
        //main2(s);
        main3(s);
        main4(s);
        main5(s);
        main6(s);
    }

    public static void main1(String s) {
        String xx = "1234 - abc - 4321 - cba - 1a2b";
        xx = xx.replace("a", "*").replace("b", "*").replace("c", "*");
        System.out.println(xx);
    }

//    public static void main2(String s) {
//        String xx = "1234 - abc - 4321 - cba - 1a2b";
//        String[] split = xx.split("/");
//        String xx1 = split[1] + split[3] + split[5];
//        System.out.println(xx1);
//
//
//    }

    public static void main3(String s) {
        String xx = "1234 - abc - 4321 - cba - 1a2b";
        StringBuilder sb = new StringBuilder(s);
        sb.insert(0, "Letters:");
        String string = sb.toString();
        System.out.println(string.toUpperCase());
    }

    public static void main4(String s) {
        String xx = "1234 - abc - 4321 - cba - 1a2b";
        boolean abc = s.contains("abc");
        System.out.println(abc);
    }

    public static void main5(String s) {
        String xx = "1234 - abc - 4321 - cba - 1a2b";
        boolean start = s.startsWith("555");
        System.out.println(start);


    }

    public static void main6(String s) {
        boolean end = s.endsWith("1a2b");
        System.out.println(end);

    }



}
