import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int islem, sayi = 1;
        int sayiAdediBas = 1, sayiAdediSon;
        int cikarmaIlkDeger;
        double bolmeIlkDeger;
        double sonuc = 0;
        double carpimSonuc = 1, bolmeSonuc = 0;
        String kontrol;

        System.out.println("Yapmak istediğiniz islemi giriniz\n");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Yapılacak olan islem = ");
        islem = input.nextInt();

        switch (islem) {

            case 1:
                System.out.print("Lutfen toplanacak sayilarin adedini giriniz = ");
                sayiAdediSon = input.nextInt() + 1; // burada sayiAdediSon değişkenimize 1 eklememizin nedeni sayiAdediBas değişkenimizi 1 fazla degerden baslatmamız.
                System.out.println("Lutfen sayilari giriniz");
                while (sayiAdediBas != sayiAdediSon) { // surekli sayi alan dongumuzu baslattık

                    System.out.print(sayiAdediBas + ".sayi = "); // kacıncı sayıda oldugumuzu belirtmek icin bu yapıyı kurduk
                    sayi = input.nextInt();
                    if (sayi < 0) { // sayımızın negatif olması durumunda girilen sayiyi yazma konusunda emin olup olmadıgını kullanıcıya sorduk
                        System.out.print("Negatif sayi girmek istediginize emin misiniz? [E : Evet / H : Hayır]  = ");
                        kontrol = input.next();
                        if (kontrol.equals("E")) {
                            sonuc += sayi;
                            sayiAdediBas++; // dongumuzun hangi adimda oldugunu kontrol edebilmek icin artırma operatoru kullandik
                            continue;
                        } else if (kontrol.equals("H")) {
                            while (true) { // kullanicinin israrla negatif sayi girmesi durumunda sürekli pozitif sayi girmesi gerektigini belirten dongu.
                                System.out.print("Lutfen Pozitif Bir Sayi giriniz = ");
                                sayi = input.nextInt();
                                if (sayi > 0) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("GECERLİ BIR HARF GIRMEDINIZ. DEVAM EDILIYOR");
                        }
                    }
                    sonuc += sayi;
                    sayiAdediBas++;
                }  // surekli sayi alan dongumuzu bitirdik
                System.out.print("Toplanan sayilarin sonucu = " + sonuc); // toplanan sayilari ekrana bastirdik
                break;

            case 2:
                System.out.print("Lutfen Eksilecek Degeri Giriniz = ");
                cikarmaIlkDeger = input.nextInt();
                System.out.print("Lutfen bu sayidan cikarilacak sayilarin adedini giriniz = ");
                sayiAdediSon = input.nextInt() + 1;
                System.out.println("Lutfen cikacak sayilari giriniz");
                while (sayiAdediBas != sayiAdediSon) {

                    System.out.print(sayiAdediBas + ".sayi = ");
                    sayi = input.nextInt();
                    if (sayi < 0) {
                        System.out.print("Negatif sayi girmek istediginize emin misiniz? [E : Evet / H : Hayır]  = ");
                        kontrol = input.next();
                        if (kontrol.equals("E")) {
                            cikarmaIlkDeger -= sayi;
                            sayiAdediBas++;
                            continue;
                        } else if (kontrol.equals("H")) {
                            while (true) {
                                System.out.print("Lutfen Pozitif Bir Sayi giriniz = ");
                                sayi = input.nextInt();
                                if (sayi > 0) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("GECERLİ BIR HARF GIRMEDINIZ. ISLEMINIZE KALDIGINIZ YERDEN DEVAM EDILIYOR");
                        }
                    }
                    cikarmaIlkDeger -= sayi;
                    sayiAdediBas++;
                }
                System.out.println("Cıkarma isleminin sonucu = " + cikarmaIlkDeger);
                break;

            case 3:
                System.out.print("Lutfen carpilacak sayilarin adedini giriniz = ");
                sayiAdediSon = input.nextInt() + 1;
                System.out.println("Lutfen sayilari giriniz");
                while (sayiAdediBas != sayiAdediSon) {

                    System.out.print(sayiAdediBas + ".sayi = ");
                    sayi = input.nextInt();
                    if (sayi < 0) {
                        System.out.print("Negatif sayi girmek istediginize emin misiniz? [E : Evet / H : Hayır]  = ");
                        kontrol = input.next();
                        if (kontrol.equals("E")) {
                            carpimSonuc *= sayi;
                            sayiAdediBas++;
                            continue;
                        } else if (kontrol.equals("H")) {
                            while (true) {
                                System.out.print("Lutfen Pozitif Bir Sayi giriniz = ");
                                sayi = input.nextInt();
                                if (sayi > 0) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("GECERLİ BIR HARF GIRMEDINIZ. ISLEMINIZE KALDIGINIZ YERDEN DEVAM EDILIYOR");
                        }
                    }
                    carpimSonuc *= sayi;
                    sayiAdediBas++;
                }
                System.out.print("Carpilan sayilarin sonucu = " + carpimSonuc);
                break;

            case 4:
                System.out.println("LUTFEN BOLUNECEK DEGERI GIRINIZ = ");
                bolmeIlkDeger = input.nextInt();
                System.out.print("Lutfen bolecek sayilarin adedini giriniz = ");
                sayiAdediSon = input.nextInt() + 1;
                System.out.println("Lutfen sayilari giriniz");
                while (sayiAdediBas != sayiAdediSon) {

                    System.out.print(sayiAdediBas + ".sayi = ");
                    sayi = input.nextInt();
                    if (sayi < 0) {
                        System.out.print("Negatif sayi girmek istediginize emin misiniz? [E : Evet / H : Hayır]  = ");
                        kontrol = input.next();
                        if (kontrol.equals("E")) {
                            bolmeIlkDeger /= sayi;
                            sayiAdediBas++;
                            continue;
                        } else if (kontrol.equals("H")) {
                            while (true) {
                                System.out.print("Lutfen Pozitif Bir Sayi giriniz = ");
                                sayi = input.nextInt();
                                if (sayi > 0) {
                                    break;
                                }
                            }
                        } else {
                            System.out.println("GECERLİ BIR HARF GIRMEDINIZ. ISLEMINIZE KALDIGINIZ YERDEN DEVAM EDILIYOR");
                        }
                    }
                    bolmeIlkDeger /= sayi;
                    sayiAdediBas++;
                }
                bolmeSonuc = bolmeIlkDeger;
                System.out.print("Bolme Isleminin Sonucu = " + bolmeSonuc);
                break;
        }
    }
}