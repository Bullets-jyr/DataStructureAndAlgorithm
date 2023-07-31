package 애너그램만들기;

import java.util.Scanner;

public class Anagram {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 공백으로 구분된 한 문자열을 받기 위해서 next()를 사용합니다.
        String a = sc.next();
        String b = sc.next();

//        int[] countA = new int[26];
//        int[] countB = new int[26];
//        for (int i = 0; i < a.length(); i++) {
//            countA[a.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < b.length(); i++) {
//            countB[b.charAt(i) - 'a']++;
//        }
        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int ans = 0;
        for (int i = 0; i < 26; i++) {
//            if (countA[i] > countB[i]) {
//                ans += countA[i] - countB[i];
//            } else if (countB[i] > countA[i]) {
//                ans += countB[i] - countA[i];
//            }
            ans += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(ans);
    }
}
