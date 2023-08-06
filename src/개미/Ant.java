package 개미;

import java.util.Scanner;

public class Ant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int T = sc.nextInt();

//        int timeX = T % (2 * W);
//        int currentX = P;
//        int deltaX = 1;
//        while (timeX-- > 0) {
//            if (currentX == W) {
//                deltaX = -1;
//            } else if (currentX == 0) {
//                deltaX = 1;
//            }
//            currentX += deltaX;
//        }
//
//        int timeY = T % (2 * H);
//        int currentY = Q;
//        int deltaY = 1;
//        while (timeY-- > 0) {
//            if (currentY == H) {
//                deltaY = -1;
//            } else if (currentY == 0) {
//                deltaY = 1;
//            }
//            currentY += deltaY;
//        }

        int currentX = (T + P) % (2 * W);
        int currentY = (T + Q) % (2 * H);
        if (currentX > W) {
            currentX = 2 * W - currentX;
        }
        if (currentY > H) {
            currentY = 2 * H - currentY;
        }

        System.out.println(currentX + " " + currentY);
    }
}
