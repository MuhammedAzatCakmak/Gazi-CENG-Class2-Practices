public class CarpimTablosu {
    public static void main(String[] args) {
        int carpim = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}