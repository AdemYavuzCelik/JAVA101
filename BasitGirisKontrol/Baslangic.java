package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kAdi = "qwe", kSifre = "123";
        String user, pass, secenek;
        System.out.print("kullanici adinizi giriniz: ");
        user = sc.nextLine();
        System.out.print("sifre giriniz: ");
        pass = sc.nextLine();
        if (user.equals(kAdi) && pass.equals(kSifre)) {
            System.out.println("giris basarili");
        } else {
            System.out.println("kullanici adi/sifre hatali sifre sifirlamak ister misiniz? ");
            System.out.print("Evet/Hayır giriniz: ");
            secenek = sc.nextLine();
            switch (secenek) {
                case "evet":
                    System.out.print("yeni sifre giriniz: ");
                    pass = sc.nextLine();
                    if(pass.equals(kSifre))
                        System.out.println("sifre olusturulamadi, lütfen baska sifre giriniz" );
                    else
                        System.out.println("sifre olusturuldu...");

                    break;
                case "hayir":
                    System.out.println("giris yapiniz...");
                    break;
            }


        }
    }
}
