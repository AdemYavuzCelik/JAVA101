package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sicaklik;
        System.out.print("hava sicakligi giriniz: ");
        sicaklik = sc.nextDouble();
        if(sicaklik<5){
            System.out.println("kayap yapabilirsin");
        }
        if(sicaklik >= 5 && sicaklik<15){
            System.out.println("sinema yapabilirsin");
        }
        if(sicaklik>=15 && sicaklik<25){
            System.out.println("piknik yapabilirsin");
        }
        if (sicaklik>=25){
            System.out.println("yüzme yapabilirsin");
        }

    }
}
