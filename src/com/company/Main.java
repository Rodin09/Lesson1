package com.company;

import java.util.Scanner;
import java.lang.Exception;

public class Main {


    public static void main(String[] args) throws Exception {
        System.out.print("������� ����� ");
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();
        String[] values = value.split("\\s");
        if (values.length > 3) {
            throw new Exception("�������� ������ �����");
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
            throw new Exception("�������� ������ �����");

        }
        if (converta != convertb) {
            System.out.print("������ ����� � ����� �������");
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
                System.out.println("������");
                return;
        }
        if (converta && convertb) {
            System.out.println("���������: " + Convert.convertNumToRoman(x));
        } else {
            System.out.println("���������: " + x);
        }
    }
}