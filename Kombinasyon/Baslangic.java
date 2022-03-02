package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 1, b = 1, c = 1, n, r;
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("n  giriniz: ");
        n = scan.nextInt();
        System.out.print("r giriniz: ");
        r = scan.nextInt();
        for (int i = 1; i <= n; i++)
            a *= i;
        for (int i = 1; i <= r; i++)
            b *= i;
        for (int i = 1; i <= n - r; i++)
            c *= i;
        System.out.println(a / (b * c));
    }
}