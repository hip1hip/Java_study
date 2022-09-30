package Tset;

import java.util.Arrays;

//429p 문제 1번 개발자 홍인표

public class sortTest {
    public static void main(String[] args) {
        String[] sa = { "k", "o", "r", "e", "a", "n" };

        System.out.println("정렬 전 : ");
        for (String s : sa)
            System.out.println(s + " ");
        System.out.println();

        Arrays.sort(sa, String::compareToIgnoreCase);

        System.out.println("정렬 후 : ");
        for (String s : sa)
            System.out.println(s + " ");

    }
}
