package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        double kdvOran, kdvTutar, kdvliFiyat, kdvsizFiyat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("kdvsiz fiyat giriniz: ");
        kdvsizFiyat = scanner.nextDouble();
        if (kdvsizFiyat>0 && kdvsizFiyat<1000){
            kdvOran = 0.18;
        }
        else{
            kdvOran = 0.08;
        }
        kdvTutar = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdvTutar + kdvsizFiyat;
        System.out.println("kdv orani: " + kdvOran);
        System.out.println("kdv siz fiyat: " + kdvsizFiyat);
        System.out.println("kdv tutar: " + kdvTutar);
        System.out.println("kdvli fiyat: " + kdvliFiyat);
    }
}
