package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user, pass;
        int deneme = 3;
        int secim;
        int para = 1500;
        int tutar = 0;
        System.out.println("\t\t ********YATİR BANKA HOSGELDİNİZ********\t\t");
        while (true) {
            System.out.print("kullanici adini giriniz: ");
            user = scanner.nextLine();
            System.out.print("sifre giriniz: ");
            pass = scanner.nextLine();
            if (user.equals("qwe") && pass.equals("123")) {
                while (true){
                    System.out.println("para yatima: 1");
                    System.out.println("para cekme: 2");
                    System.out.println("para sorgulama: 3");
                    System.out.println("cikis yap: 4");
                    System.out.print("islem seciniz: ");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("tutar giriniz: ");
                            tutar = scanner.nextInt();
                            para = para + tutar;
                            break;
                        case 2:
                            System.out.print("tutar giriniz: ");
                            tutar = scanner.nextInt();
                            if (tutar>para){
                                System.out.println("yetersiz bakiye");
                            }
                            else{
                                para = para-tutar;
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz: "+para);
                            break;
                        case 4:
                            System.out.println("tekrar görüsmek üzere");
                            System.exit(0);
                    }
                }

            } else {
                deneme--;
                if (deneme == 0) {
                    System.out.println("Hesabiniz bloke olmustur");
                    break;
                }
            }
        }

    }
}