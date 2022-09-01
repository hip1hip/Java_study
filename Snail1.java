//package snail;

import java.util.Scanner;

public class Snail1 {

    public static void main(String[] args) {
        System.out.println("Snail의 size를 결정하세요./숫자를 치고 Enter!");
        Scanner sc1 = new Scanner(System.in);
        int s = Integer.parseInt(sc1.nextLine()); // Snail Size

        System.out.println("Snail의 유형을 선택하세요.");
        System.out.println("1 : 시계방향으로 증가");
        System.out.println("2 : 시계방향으로 감소");
        System.out.println("3 : 시계 반대방향으로 증가");
        System.out.println("4 : 시계 반대방향으로 감소");
        Scanner sc2 = new Scanner(System.in);
        int choice = Integer.parseInt(sc2.nextLine()); // Snail 유형

        int f = s; // 회전수
        int c = 1; // 행과 열을 +1 하거나 -1 하는 변수
        int count = 0;
        int array[][] = new int[s][s];

        // int choice = 4; // Snail 유형선택

        switch (choice) {
            case 1:
                int i1 = 0;
                int j1 = -1;
                int k1 = -1;
                while (count <= s) {

                    for (int m = 1; m <= f; m++) {
                        k1 = k1 + 2;
                        j1 = j1 + c;
                        array[i1][j1] = k1;
                    }
                    f = f - 1;
                    for (int n = 1; n <= f; n++) {
                        k1 = k1 + 2;
                        i1 = i1 + c;
                        array[i1][j1] = k1;
                    }
                    c = c * (-1);
                    count = count + 1;
                }
                for (int m = 0; m < s; m++) {
                    for (int n = 0; n < s; n++) {
                        System.out.printf("%5d", array[m][n]);
                    }
                    System.out.println();
                    System.out.println();
                }
                break;
            case 2:
                int i2 = 0;
                int j2 = -1;
                int k2 = s * s + 1;
                while (count <= s) {

                    for (int m = 1; m <= f; m++) {
                        k2 = k2 - 1;
                        j2 = j2 + c;
                        array[i2][j2] = k2;
                    }
                    f = f - 1;
                    for (int n = 1; n <= f; n++) {
                        k2 = k2 - 1;
                        i2 = i2 + c;
                        array[i2][j2] = k2;
                    }
                    c = c * (-1);
                    count = count + 1;
                }
                for (int m = 0; m < s; m++) {
                    for (int n = 0; n < s; n++) {
                        System.out.printf("%5d", array[m][n]);
                    }
                    System.out.println();
                    System.out.println();
                }
                break;
            case 3:
                int i3 = -1;
                int j3 = 0;
                int k3 = 0;
                while (count <= s) {

                    for (int m = 1; m <= f; m++) {
                        k3 = k3 + 1;
                        i3 = i3 + c;
                        array[i3][j3] = k3;
                    }
                    f = f - 1;
                    for (int n = 1; n <= f; n++) {
                        k3 = k3 + 1;
                        j3 = j3 + c;
                        array[i3][j3] = k3;
                    }
                    c = c * (-1);
                    count = count + 1;
                }
                for (int m = 0; m < s; m++) {
                    for (int n = 0; n < s; n++) {
                        System.out.printf("%5d", array[m][n]);
                    }
                    System.out.println();
                    System.out.println();
                }
                break;
            case 4:
                int i4 = -1;
                int j4 = 0;
                int k4 = s * s + 1;
                while (count <= s) {

                    for (int m = 1; m <= f; m++) {
                        k4 = k4 - 1;
                        i4 = i4 + c;
                        array[i4][j4] = k4;
                    }
                    f = f - 1;
                    for (int n = 1; n <= f; n++) {
                        k4 = k4 - 1;
                        j4 = j4 + c;
                        array[i4][j4] = k4;
                    }
                    c = c * (-1);
                    count = count + 1;
                }
                for (int m = 0; m < s; m++) {
                    for (int n = 0; n < s; n++) {
                        System.out.printf("%5d", array[m][n]);
                    }
                    System.out.println();
                    System.out.println();
                }

        }
    }
}
