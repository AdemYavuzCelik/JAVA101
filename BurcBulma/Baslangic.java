package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogumGünü, dogumAyi;
        System.out.print("lutfen dogum gününü giriniz: ");
        dogumGünü = sc.nextInt();
        System.out.print("lutfen dogum ayini giriniz: ");
        dogumAyi = sc.nextInt();
        if (dogumAyi == 1) {
            if (dogumGünü >= 22)
                System.out.println("kova burcusun");
            else
                System.out.println("oglak burcusun");
        }
        if(dogumAyi == 2){
            if (dogumGünü >= 20)
                System.out.println("balik burcusun");
            else
                System.out.println("kova burcusun");
        }
        if(dogumAyi == 3){
            if (dogumGünü >= 21)
                System.out.println("koc burcusun");
            else
                System.out.println("balik burcusun");
        }
        if(dogumAyi == 4){
            if (dogumGünü >= 21)
                System.out.println("boga burcusun");
            else
                System.out.println("koc burcusun");
        }
        if(dogumAyi == 5){
            if (dogumGünü >= 22)
                System.out.println("ikizler burcusun");
            else
                System.out.println("boga burcusun");
        }
        if(dogumAyi == 6){
            if (dogumGünü >= 23)
                System.out.println("yengec burcusun");
            else
                System.out.println("ikizler burcusun");
        }
        if(dogumAyi == 7){
            if (dogumGünü >= 23)
                System.out.println("aslan burcusun");
            else
                System.out.println("yengec burcusun");
        }
        if(dogumAyi == 8){
            if (dogumGünü >= 23)
                System.out.println("basak burcusun");
            else
                System.out.println("aslan burcusun");
        }
        if(dogumAyi == 9){
            if (dogumGünü >= 23)
                System.out.println("terazi burcusun");
            else
                System.out.println("basak burcusun");
        }
        if(dogumAyi == 10){
            if (dogumGünü >= 23)
                System.out.println("akrep burcusun");
            else
                System.out.println("terazi burcusun");
        }
        if(dogumAyi == 11){
            if (dogumGünü >= 22)
                System.out.println("yay burcusun");
            else
                System.out.println("akrep burcusun");
        }
        if(dogumAyi == 12){
            if (dogumGünü >= 22)
                System.out.println("oglak burcusun");
            else
                System.out.println("yay burcusun");
        }
    }
}