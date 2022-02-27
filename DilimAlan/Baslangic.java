package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        final double pi = 3.14;
        double r, alan,dilimAlan,a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("dairenin yaricapini giriniz: ");
        r = scanner.nextDouble();
        alan = pi * Math.pow(r, 2);
        System.out.println("dairenin alani: " + alan);
        System.out.print("a giriniz: ");
        a = scanner.nextDouble();
        dilimAlan = (pi*a*Math.pow(r,2)/360);
        System.out.println("dilim alani: "+dilimAlan);
    }
}
