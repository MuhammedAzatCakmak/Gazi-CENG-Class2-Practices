import java.util.Scanner;

public class BolenOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        double ortalama = 0;
        int sayac = 0;
        System.out.print("lutfen bir sayi giriniz : ");
        int kullanici_sayi = input.nextInt();

        for (int i = 1; i <= kullanici_sayi; i++) {
            if (kullanici_sayi % i == 0) {
                System.out.print(i + " sayisi sayinizi tam boluyor");
                System.out.println();
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("sayinizi bolen sayilarin sayisi = " + sayac);
        System.out.print("sayinizi tam bolen sayilarin ortalamasi : " + ortalama);

    }
}