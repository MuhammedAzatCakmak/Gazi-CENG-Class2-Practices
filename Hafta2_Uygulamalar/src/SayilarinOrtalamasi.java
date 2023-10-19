import java.util.Scanner;

public class SayilarinOrtalamasi {
    public static void main(String[] args) {

        // KULLANICIDAN ALINAN 10 TANE SAYININ ORTALAMASINI HESAPLAYAN PROGRAM (FOR DÖNGÜSÜ KULLANILARAK)

        float ortalama = 0;
        float toplam = 0;
        float adet = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Bir sayi giriniz : ");
            int kullanici_sayisi = input.nextInt();
            toplam += kullanici_sayisi;
            adet++;
        }
        ortalama = (toplam / adet);
        System.out.println("Girilen sayilarin ortalamasi = " + ortalama);

    }
}
