package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00;
        double armutK,elmaK,domatesK,muzK,patlicanK,toplamTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("kac kilo armut aldiniz: ");
        armutK = scanner.nextDouble();
        System.out.print("kac kilo elma aldiniz: ");
        elmaK = scanner.nextDouble();
        System.out.print("kac kilo domates aldiniz: ");
        domatesK = scanner.nextDouble();
        System.out.print("kac kilo muz aldiniz: ");
        muzK = scanner.nextDouble();
        System.out.print("kac kilo patlican aldiniz: ");
        patlicanK = scanner.nextDouble();
        toplamTutar = armut*armutK+elma*elmaK+domates*domatesK+muz*muzK+patlican*patlicanK;
        System.out.print("toplam tutar: "+toplamTutar);
    }
}
