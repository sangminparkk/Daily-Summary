package com.chandler.base.formatting;

public class Practice1 {
    public static void main(String[] args) {
        // 3단 구구단 출력
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }

        System.out.println("== String.format ==");
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(String.format("%02d x %02d = %02d", i, j, i * j));
            }
            System.out.println();
        }

    }
}
