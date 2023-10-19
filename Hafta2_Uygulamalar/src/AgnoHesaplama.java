import java.util.Scanner;

public class AgnoHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dersAdi;
        String harfNotu;
        boolean whilekontrol1 = true;
        boolean whilekontrol2 = true;
        int dersSayaci = 0;
        int dersKredisi = 0;
        int toplamKredi = 0;
        double harfNotuDegeri = 0.0;
        double toplamKatsayi = 0.0;
        double agno = 0.0;

        while (whilekontrol1) { // while döngüsü başlangıcı

            System.out.print("Lutfen ders adini giriniz : ");
            dersAdi = input.next();
            if (dersAdi.equals("h")) {
                break;  // döngüyü sonlandırmak için break komutu
            }
            dersSayaci++;

            System.out.print("Lutfen bu dersin kredisini giriniz : ");
            dersKredisi = input.nextInt();
            toplamKredi += dersKredisi;

            do
            {  // do - while döngümüzün başlangıcı. Bu döngünün amacı : harf notunun geçerli bir değer girilip girilmediğini kontrol etmek.
                System.out.print("Dersi hangi harf notu ile geçtiğinizi yazınız : ");
                harfNotu = input.next();
                switch (harfNotu) {  // harf notu üzerinden kontrol yapısı oluşturarak harf notunun sayısal değeri belirlendi.
                    case "aa":
                    case "AA":
                        harfNotuDegeri = 4.00;
                        whilekontrol2 = false;
                        break;
                    case "ba":
                    case "BA":
                        harfNotuDegeri = 3.50;
                        whilekontrol2 = false;
                        break;
                    case "bb":
                    case "BB":
                        harfNotuDegeri = 3.00;
                        whilekontrol2 = false;
                        break;
                    case "cb":
                    case "CB":
                        harfNotuDegeri = 2.50;
                        whilekontrol2 = false;
                        break;
                    case "cc":
                    case "CC":
                        harfNotuDegeri = 2.00;
                        whilekontrol2 = false;
                        break;
                    case "dc":
                    case "DC":
                        harfNotuDegeri = 1.50;
                        whilekontrol2 = false;
                        break;
                    case "dd":
                    case "DD":
                        harfNotuDegeri = 1.00;
                        whilekontrol2 = false;
                        break;
                    case "fd":
                    case "FD":
                        harfNotuDegeri = 0.50;
                        whilekontrol2 = false;
                        break;
                    case "ff":
                    case "FF":
                        harfNotuDegeri = 0.00;
                        whilekontrol2 = false;
                        break;
                    default:
                        System.out.println("Lutfen gecerli bir harf notu giriniz");
                        break;
                }
            } while (whilekontrol2);
            toplamKatsayi += (dersKredisi * harfNotuDegeri);
        }
        // while döngüsü bitişi

        System.out.println();
        System.out.println("Öğrencinin geçtiği ders sayisi = " + dersSayaci);
        agno = (toplamKatsayi / toplamKredi);
        System.out.print("AGNO'nuz = " + agno);
        System.out.println();

        if (agno >= 3.00 && agno < 3.50) { // hangi belgenin alınacağını belirlemek için karar yapısı oluşturuldu.
            System.out.println("TEBRİKLER! ONUR BELGESİ ALMAYA HAK KAZANDINIZ");
        } else if (agno >= 3.50 && agno <= 4.00) {
            System.out.println("TEBRİKLER! YÜKSEK ONUR BELGESİ ALMAYA HAK KAZANDINIZ");
        } else {
            System.out.println("ÜZGÜNÜZ! BELGE ALAMADINIZ");
        }
    }
}