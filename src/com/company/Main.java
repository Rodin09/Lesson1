package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean converta = false;
        boolean convertb = false;

        Scanner s = new Scanner(System.in);
        System.out.print("Введите числа ");
        String sa = s.next();
        int a;
        try {
            a = Integer.parseInt(sa);
        } catch (Exception e) {
            a = Convert.romanToNumber(sa);
            converta = true;
        }


        char oper = s.next().charAt(0);
        String sb = s.next();
        int x;
        int b;
        try {
            b = Integer.parseInt(sb);
        } catch (Exception e) {
            b = Convert.romanToNumber(sb);
            convertb = true;
        }

        if (a > 10 || a < 1 || b > 10 || b < 1) {
            System.out.print("Число больше 10 или меньше 1");
            return;
        }
        if (converta != convertb) {
            System.out.print("Ведите числа в одной системе");
            return;
        }


        switch (oper) {
            case '+':
                x = a + b;
                break;
            case '-':
                x = a - b;
                break;
            case '*':
                x = a * b;
                break;
            case '/':
                x = a / b;
                break;
            default:
                System.out.println("Ошибка");
                return;
        }
        if (converta && convertb) {
            System.out.println("Результат: " + Convert.convertNumToRoman(x));
        } else {
            System.out.println("Результат: " + x);
        }
    }
}