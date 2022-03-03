package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("sayi giriniz: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j > i && j < (2 * n) - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}