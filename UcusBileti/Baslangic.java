package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t ****** UCAK BILETI AL *******");
        double tutar,mesafe,mKM=0.10;
        int yas,tip;
        System.out.print("km giriniz: ");
        mesafe=scan.nextDouble();
        System.out.print("yas indirimi icin yas giriniz: ");
        yas = scan.nextInt();
        System.out.println("tek yön: 1      gidis dönüs: 2");
        System.out.println("indirim icin yolculuk tipini giriniz: ");
        tip = scan.nextInt();
        if(mesafe<0 || yas<0 || !(tip ==1 || tip ==2)){
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }
        tutar = mesafe * mKM;
        if(yas <12){
            tutar -= (tutar*50)/100;
        }
        if(yas>=12 && yas<24)
            tutar -= (tutar*10)/100;
        if(yas >65)
            tutar -=(tutar*30)/100;
        if(tip == 2)
            tutar -=(tutar*20)/100;
            tutar *=2;

        System.out.println("normal tutar: "+tutar);
    }
}