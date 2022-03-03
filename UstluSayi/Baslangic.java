package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ust, sayi, sonuc = 1;
        System.out.print("sayi  giriniz: ");
        sayi = scan.nextInt();
        System.out.print("ust giriniz: ");
        ust = scan.nextInt();
        for (int i = 0; i < ust; i++)
            sonuc =sonuc*sayi;
        System.out.println(sonuc);
    }
}