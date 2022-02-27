package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        int mat,fizik,kimya,turkce,tarih,muzik,ortalama;
        Scanner scanner = new Scanner(System.in);
        System.out.print("mat notunu giriniz: ");
        mat = scanner.nextInt();
        System.out.print("fizik notunu giriniz: ");
        fizik = scanner.nextInt();
        System.out.print("kimya notunu giriniz: ");
        kimya = scanner.nextInt();
        System.out.print("turkce notunu giriniz: ");
        turkce = scanner.nextInt();
        System.out.print("tarih notunu giriniz: ");
        tarih = scanner.nextInt();
        System.out.print("muzik notunu giriniz: ");
        muzik = scanner.nextInt();
        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ortalama+" ortalama ile "+(ortalama > 60 ? "gectiniz" : "kaldiniz"));
    }
}
