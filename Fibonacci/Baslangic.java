package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int toplam, sayi = 1, sonuc = 0, k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            toplam = sayi;
            sayi = sonuc;
            System.out.println(sonuc);
            sonuc = toplam + sayi;

        }
        System.out.println(sonuc);
    }
}