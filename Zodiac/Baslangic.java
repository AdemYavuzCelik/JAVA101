package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogumYili;
        System.out.println("dogum yilinizi giriniz: ");
        dogumYili = scan.nextInt();
        switch (dogumYili % 12){
            case 0 :
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("köpek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("fare");
                break;
            case 5:
                System.out.println("okuz");
                break;
            case 6:
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("tavsan");
                break;
            case 8:
                System.out.println("ejdarha");
                break;
            case 9:
                System.out.println("yilan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("koyun");
                break;
        }
    }
}