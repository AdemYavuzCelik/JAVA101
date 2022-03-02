package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, toplam = 0;
        do {
            System.out.print("sayi giriniz: ");
            a = scan.nextInt();
            if (a % 2 == 0 && a % 4 == 0) {
                toplam += a;
                System.out.println(toplam+" ");
            }
        } while (a % 2 != 1);
    }
}