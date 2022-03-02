package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("siralancak ilk sayiyi giriniz: ");
        a = sc.nextInt();
        System.out.print("siralancak ikinci sayiyi giriniz: ");
        b = sc.nextInt();
        System.out.print("siralancak ucuncu sayiyi giriniz: ");
        c = sc.nextInt();
        if (a < b && a < c) {
            if (b < c)
                System.out.println(a+"<"+b+"<"+c);
            else
                System.out.println(a+"<"+c+"<"+b);
        }
        if (b < c && b < a) {
            if (c < a)
                System.out.println(b+"<"+c+"<"+a);
            else
                System.out.println(b+"<"+a+"<"+c);
        }
        if (c < a && c < b) {
            if (b < a)
                System.out.println(c+"<"+b+"<"+a);
            else
                System.out.println(c+"<"+a+"<"+b);
        }
    }
}