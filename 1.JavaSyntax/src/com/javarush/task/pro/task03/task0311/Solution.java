package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        if (Math.abs(numberB - numberA) < 0.000001) {

            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
