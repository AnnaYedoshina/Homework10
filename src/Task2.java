import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String str = scanner.nextLine();

        String[] strArray = str.split(" ");


        System.out.println("Самое длинное слово: " + strArray[findLongestWord(strArray)]);
        System.out.println("Самое короткое слово: " + strArray[findShortestWord(strArray)]);
        System.out.println("Посдеднее самое длинное слово: " + strArray[findLastLongestWord(strArray)]);
        System.out.println("Посдеднее самое короткое слово: " +strArray[findLastShortestWord(strArray)]);
    }

    public static int findLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int index = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                index = i;
            }
        }

        return index;
    }

    public static int findShortestWord(String[] strArray) {
        int minLong = strArray[0].length();
        int index1 = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() < minLong) {
                minLong = strArray[i].length();
                index1 = i;
            }
        }

        return index1;
    }

    public static int findLastShortestWord(String[] strArray) {
        int minLong = strArray[0].length();
        int index2 = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() <= minLong) {
                minLong = strArray[i].length();
                index2 = i;
            }
        }
        return index2;
    }

    public static int findLastLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int index3 = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() >= maxLong) {
                maxLong = strArray[i].length();
                index3 = i;
            }
        }
        return index3;
    }
}




