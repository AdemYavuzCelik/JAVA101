package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        double a,b,hipo,alan,c,u;
        Scanner scanner = new Scanner(System.in);
        System.out.print("kenar giriniz: ");
        a = scanner.nextDouble();
        System.out.print("kenar giriniz: ");
        b = scanner.nextDouble();
        hipo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("hipotenüs: "+hipo);
        System.out.print("kenar giriniz: ");
        c= scanner.nextDouble();
        u = a+b+c/2;
        alan = Math.sqrt(u * (u-a)*(u-b)*(u-c));
        System.out.print("alan: "+alan);


    }
}
