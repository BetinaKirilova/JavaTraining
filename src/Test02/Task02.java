package Test02;

import java.util.Scanner;

public class Task02 {

    static boolean check(String str) {
        for (int i = 1; i < str.length(); i++) {
            String pattern = str.substring(0, i);
            if (pattern.length() * 2 > str.length()) {
                break;
            }

            String replacePattern = str.replace(pattern, "");
            if (replacePattern.equals("")) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(check(str));
    }
}
