import java.util.Scanner;

public class SifiraGeriSayma {

    public static void main(String[] args) {

        // KULLANICININ GİRDİĞİ SAYIDAN 0'A KADAR GERİ SAYAN PROGRAM

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        int kullanici_girilen = input.nextInt();
        for (int i = kullanici_girilen; 0 <= kullanici_girilen; i--) {
            kullanici_girilen--;
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
