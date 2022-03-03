package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;
        while (true) {
            System.out.print("sayi giriniz: ");
            sayi = scanner.nextInt();
            if(sayi == -1)
                break;
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0)
                    toplam += i;
            }
            if (sayi == toplam)
                System.out.println(sayi + " mükemmel sayidir");
            else
                System.out.println(sayi + " mükemmel sayi degildir");
            toplam = 0;

        }

    }
}