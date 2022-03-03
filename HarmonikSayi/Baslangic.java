package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sayi, toplam = 0;
        System.out.print("sayi  giriniz: ");
        sayi = scan.nextInt();
        for (double  i = 1; i <= sayi; i++)
          toplam = toplam + 1/i;
        System.out.println(toplam);
    }
}