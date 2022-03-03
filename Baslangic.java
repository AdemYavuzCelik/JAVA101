package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sinir, enBuyuk = -1, sayi, enKucuk = -1;
        System.out.print("sinir: ");
        sinir = scanner.nextInt();
        System.out.print("1. sayiyi giriniz: ");
        sayi = scanner.nextInt();
        enBuyuk = sayi;
        enKucuk =sayi;
        for (int i = 1; i < sinir; i++) {
            System.out.print((i+1)+". sayiyi giriniz: ");
            sayi = scanner.nextInt();
            if (sayi>enBuyuk)
                enBuyuk = sayi;
            if (sayi<enKucuk)
                enKucuk =sayi;
        }
        System.out.println("en buyuk: "+enBuyuk);
        System.out.println("en kucuk: "+enKucuk);
    }
}