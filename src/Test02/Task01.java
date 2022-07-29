package Test02;

import java.util.Scanner;

public class Task01 {

    static boolean checkStrings(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.printf("'%s','%s' => %b", str1, str2,
                checkStrings(str1, str2));
    }
}
