import java.util.Scanner;

public class javadoc {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Masukkan suhu dalam Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " derajat Fahrenheit");

        input.close();
    }
}
