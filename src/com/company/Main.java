package com.company;

import java.util.Scanner;
import java.lang.Exception;

public class Main {


    public static void main(String[] args) throws Exception {
        System.out.print("Введите числа ");
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();
        String[] values = value.split("\\s");
        if (values.length > 3) {
            throw new Exception("Неверный формат ввода");
        }
        boolean converta = false;
        boolean convertb = false;
        String sa = values[0];
        int a;
        try {
            a = Integer.parseInt(sa);
        } catch (
                Exception e) {
            a = Convert.romanToNumber(sa);
            converta = true;
        }
        String sb = values[1];
        char oper = sb.charAt(0);
        String sc = values[2];
        int x, b;
        try {
            b = Integer.parseInt(sc);
        } catch (
                Exception e) {
            b = Convert.romanToNumber(sc);
            convertb = true;
        }
        if (a > 10 || a < 1 || b > 10 || b < 1) {
            throw new Exception("Неверный формат ввода");

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