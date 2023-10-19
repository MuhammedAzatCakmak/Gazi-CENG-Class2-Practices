import java.util.Scanner;

public class HavaDurumuOrtalamasi {
    public static void main(String[] args) {

        // KULLANICI -1 GİRENE KADAR KULLANICININ GİRDİĞİ HAVA DURUMU DEĞERLERİNİN ORTALAMASI

        Scanner input = new Scanner(System.in);
        float kullanici_hava = 0;
        float toplam = 0;
        int sayac = 0;
        boolean kontrol = true;
        while (kontrol) {
            System.out.println("Lutfen hava durumu giriniz : ");
            kullanici_hava = input.nextFloat();
            toplam += kullanici_hava;
            if (kullanici_hava == -1) {
                kontrol = false;
            }
            sayac++;
        }
        float ortalama = toplam / sayac;
        System.out.println("ortalama = " + ortalama);

    }
}
