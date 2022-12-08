package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();
        System.out.println(three);
        System.out.println(two.toUpperCase());
        System.out.println(one.toLowerCase());

    }
}
