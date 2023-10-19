import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {

        // YILDIZLARLA ÜÇGEN DESENLİ ÇIKTI OLUŞTURAN PROGRAM

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisi giriniz : ");
        int istenilen_satir_sayisi = input.nextInt(); // kullanıcıdan satir sayisi aldık

        for (int mevcut_satir = 0; mevcut_satir < istenilen_satir_sayisi; mevcut_satir++) {
            for (int yildiz_sayisi = 0; yildiz_sayisi <= mevcut_satir; yildiz_sayisi++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
