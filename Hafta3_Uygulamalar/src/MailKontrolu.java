import java.util.Scanner;

public class MailKontrolu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String kullanici_mail;
        boolean kontrol = true;

        while (kontrol) {
            System.out.println("mail adresi giriniz : ");
            kullanici_mail = input.nextLine();

            if (kullanici_mail.contains("@") && kullanici_mail.endsWith(".com")) {

                System.out.println("dogru mail adresi");
                kontrol = false;
            } else {
                System.out.println("yanlıs mail adresi. Lutfen tekrar mail adrsi giriniz");
            }
        }
    }
}