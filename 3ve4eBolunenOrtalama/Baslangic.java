package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sinir giriniz: ");
        int sinir = scan.nextInt();
        int toplam = 0;
        int i;
        int sayi = -1;
        for (i = 0; i < sinir; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayi++;
            }
        }
        System.out.println(toplam / sayi);
    }
}