package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long a = cube (2);
        System.out.println(a);
    }

    public static long cube(long a) {
        return a * a * a;
    }

}

