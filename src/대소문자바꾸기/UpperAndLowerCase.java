package 대소문자바꾸기;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        String ans = "";
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
//                System.out.print((char)('a' + ch - 'A'));
//                ans += (char) ('a' + ch - 'A');
                ans[i] = (char) ('a' + ch - 'A');
            } else {
//                System.out.print((char)('A' + ch - 'a'));
//                ans += (char)('A' + ch - 'a');
                ans[i] = (char)('A' + ch - 'a');
            }
        }
        System.out.println(ans);
    }
}
