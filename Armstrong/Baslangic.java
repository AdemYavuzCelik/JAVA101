package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.print("sayi  giriniz: ");
        sayi = scan.nextInt();
        for (int i = sayi; i > 0; i /= 10)
            toplam = toplam + i % 10;
        System.out.println(toplam);
    }
}