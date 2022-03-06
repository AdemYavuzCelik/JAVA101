package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {


        boolean isPalindrom = run(121);
        System.out.println(isPalindrom);
    }

    static boolean run(int sayi1) {
        int sayi = sayi1, tersi = 0, basamak;
        while (sayi > 0) {
            tersi *= 10;
            basamak = sayi % 10;
            tersi = tersi + basamak;

            sayi = sayi / 10;
        }
        if (tersi == sayi1)
            return true;
        else
            return false;
    }
}

