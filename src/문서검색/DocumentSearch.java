package 문서검색;

import java.util.Scanner;

public class DocumentSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 개행문자 기준
        String doc = sc.nextLine();
        String word = sc.nextLine();

//        int count = 0;
//        int startIndex = 0;
//        while (true) {
//            int findIndex = doc.indexOf(word, startIndex);
//            if (findIndex < 0) {
//                break;
//            }
//            count++;
//            startIndex = findIndex + word.length();
//        }
//        System.out.println(count);

        String replaced = doc.replace(word, "");
        int length = doc.length() - replaced.length();
        int count = length / word.length();
        System.out.println(count);
    }
}
