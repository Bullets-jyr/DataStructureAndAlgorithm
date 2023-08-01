package 단어공부;

import java.util.Scanner;

public class WordStudy {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if ('A' <= ch && ch <= 'Z') {
//                count[ch - 'A']++;
//            } else {
//                count[ch - 'a']++;
//            }
            count[str.charAt(i) - 'A']++;
        }

        return count;
    }

    public static int getAlphabetCount(String str, char alp) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (alp == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
//        int[] count = getAlphabetCount(str);

        int maxCount = -1;
//        int maxAlphabetIndex = -1;
        char maxAlphabet = '?';
//        for (int i = 0; i < 26; i++) {
        for (char alp = 'A'; alp <= 'Z'; alp++) {
            int count = getAlphabetCount(str, alp);
            if (count > maxCount) {
                maxCount = count;
                maxAlphabet = alp;
            } else if (count == maxCount) {
                maxAlphabet = '?';
            }
//            if (count[i] > maxCount) {
//                maxCount = count[i];
////                maxAlphabetIndex = i;
//                maxAlphabet = (char) ('A' + i);
//            } else if (count[i] == maxCount) {
//                maxAlphabet = '?';
//            }
        }
//        System.out.println((char)('A' + maxAlphabetIndex));
        System.out.println(maxAlphabet);
    }
}
