package com.chandler.base.formatting;

public class Practice {
    public static void main(String[] args) {
        // 문자열 서식 : %s
        // 숫자 : %d
        String itemName = "바나나";
        int price = 4000;
        int quantity = 1;

        System.out.println("구입 상품 : " + itemName + ", 가격 : " + price + ", 수량 : " + quantity); // 문자열 단순 결합
        System.out.println(String.format("구입 상품 : %s, 가격 : %d, 수량 : %d", itemName, price, quantity)); // String format

        // flag 사용하여 공백 채우기
        int num = 123;
        System.out.println(String.format("%5d", num)); // 우측정렬, 공백 유지
        System.out.println(String.format("%-5d", num)); // 왼쪽정렬, 공백 유지
        System.out.println(String.format("%05d", num)); // 우측정렬, 공백 -> 0 채움

        System.out.println(String.format("%+5d", num)); // 부호 출력

        // TODO : 진수 표현법 작성하기
    }
}
