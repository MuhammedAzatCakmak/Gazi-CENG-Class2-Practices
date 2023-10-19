import java.util.Scanner;

public class SayiKarsilastirma {
    public static void main(String[] args) {


        // KULLANICININ GİRDİĞİ İKİ SAYİYİ KARŞILAŞTIRAN PROGRAM

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz: ");
        int kullanici1 = input.nextInt();
        System.out.println("2.sayiyi giriniz : ");
        int kullanici2 = input.nextInt();

        if (kullanici1 > kullanici2) {
            System.out.println("1.sayi daha buyuk");
        } else if (kullanici1 < kullanici2) {
            System.out.println("2.sayi daha buyuk");
        } else {
            System.out.println("Sayilar esit");
        }

    }

}