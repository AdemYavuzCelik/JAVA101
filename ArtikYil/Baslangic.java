package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("yil giriniz: ");
        int artikYil = scan.nextInt();
        if (artikYil % 100 == 0) {
            if (artikYil % 400 == 0)
                System.out.println("artik yildir");
            else
                System.out.println("artik yil degildir");
        }
        else {
            if (artikYil % 4 == 0)
                System.out.println("artik yildir");
            else
                System.out.println("artik yil degildir");
        }
    }
}