package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, sayi2, i = 0, EBOB = -1, EKOK = 0;
        boolean kosul = true;
        System.out.print("sayi giriniz: ");
        sayi = scanner.nextInt();
        System.out.print("sayi giriniz: ");
        sayi2 = scanner.nextInt();
        while (i<sayi || i<sayi2) {
            i++;
            if (sayi % i == 0 && sayi2 % i == 0) {
                if (EBOB < i)
                    EBOB = i;
            }

        }
        EKOK = (sayi*sayi2)/EBOB;
        System.out.println("ekok: "+EKOK);
        System.out.println("ebob: "+EBOB);
    }
}