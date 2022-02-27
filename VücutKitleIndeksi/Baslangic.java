package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner scanner = new Scanner(System.in);
        System.out.print("boy giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("kilo giriniz: ");
        kilo = scanner.nextDouble();
        indeks = kilo / Math.pow(boy, 2);
        System.out.print("vücut kitle indeksiniz: " + indeks);
    }
}
