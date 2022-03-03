package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, arti = 0, eksi = 0, k;
        System.out.print("sayi giriniz: ");
        n = scanner.nextInt();
        for (int i = 0; i < (2 * n) - 1; i++) {
            k = (i - n) + 1;
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (i < n) {
                    if (j >= n - i && j <= n + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (j > k && j < (2 * n) - k)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}