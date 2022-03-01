package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        int islem;
        System.out.println("\t\t\t\t***************HESAP MAKINESI***********");
        System.out.print("isleme girecek ilk sayiyi giriniz: ");
        a = sc.nextDouble();
        System.out.printf("isleme girecek ikinci sayiyi giriniz: ");
        b = sc.nextDouble();
        System.out.println("islem seciniz");
        System.out.println("Toplama icin: 1");
        System.out.println("Cikarma icin: 2");
        System.out.println("Carpma icin: 3");
        System.out.println("Bölme islemi icin 4");
        islem = sc.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Toplam: " + (a + b));
                break;
            case 2:
                System.out.println("Cikan: " + (a - b));
                break;
            case 3:
                System.out.println("Carpim: "+(a*b));
                break;
            case 4:
                System.out.println("Bolum: "+(a/b));
                break;
            default:
                System.out.println("Hata");
        }
    }
}
