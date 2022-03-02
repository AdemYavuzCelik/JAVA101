package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, toplam = 0;
        System.out.print("sinir giriniz: ");
        a = scan.nextInt();
        for(int i = 0; i<a; i++){
            System.out.print("4 ün "+i+". kuvveti: "+Math.pow(4,i));
            System.out.println("\t5 in "+i+". kuvveti: "+Math.pow(5,i));
        }
    }
}