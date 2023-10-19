public class CelciusToFahrenheit {
    public static void main(String[] args) {

        int celcius = 20;
        double fahrenheit = 0;

        for (celcius = 20; celcius <= 35; celcius++) {
            fahrenheit = (celcius + 32) * (1.8);
            System.out.println("celcius = " + celcius);
            System.out.println("fahrenheit = " + fahrenheit);
        }
    }
}