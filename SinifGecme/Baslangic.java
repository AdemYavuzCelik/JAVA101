package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        int mat, fizik, turkce, kimya, muzik, sayi = 0, ort = 0;
        System.out.print("matematik notunu giriniz: ");
        mat = sc.nextInt();
        System.out.print("fizik notunu giriniz: ");
        fizik = sc.nextInt();
        System.out.print("turkce notunu giriniz: ");
        turkce = sc.nextInt();
        System.out.print("kimya notunu giriniz: ");
        kimya = sc.nextInt();
        System.out.print("muzik notunu giriniz: ");
        muzik = sc.nextInt();
        if (mat > 0 && mat < 100) {
            sayi++;
            ort += mat;
        } else if (fizik > 0 && fizik < 100) {
            sayi++;
            ort += fizik;
        } else if (turkce > 0 && turkce < 100) {
            sayi++;
            ort += turkce;
        } else if (kimya > 0 && kimya < 100) {
            sayi++;
            ort += kimya;
        } else if (muzik > 0 && muzik < 100) {
            sayi++;
            ort += muzik;
        } else {
            System.out.println("hicbir not  0-100 arasinda degil");
            System.exit(0);
        }
        ort = ort / sayi;
        System.out.println(ort + "ile " + (ort > 55 ? " gectiniz" : "kaldiniz"));
    }
}
