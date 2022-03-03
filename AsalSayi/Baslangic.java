package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int temp;
        for (int i = 2; i < 100; i++) {
            temp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    temp++;
            }
            if (temp <= 1)
                System.out.print(i+" ");
        }
    }
}