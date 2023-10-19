import java.util.Scanner;

public class GirdilerinToplami {
    public static void main(String[] args) {

        // 1'DEN KULLANICININ GİRDİĞİ SAYİYA KADAR OLAN TÜM SAYİLARIN TOPLAMI

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz : ");
        int kullanici_sayi = input.nextInt();
        int artan_sayi = 0, toplam = 0;
        while (artan_sayi != kullanici_sayi) {
            artan_sayi++;
            toplam += artan_sayi;
        }
        System.out.print("1 ile " + kullanici_sayi + " arasindaki tüm sayilarıin toplami = " + toplam);
    }
}
