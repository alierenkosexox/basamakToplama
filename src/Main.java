import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        number = input.nextInt();
        int sayi = number;

        while (sayi % 10 != 0) {
            total += sayi % 10;
            number = sayi % 10;
            sayi /= 10;
            System.out.println(number);
        }

        System.out.println("Sayının basamakları toplamı :" + total);
    }
} // Ali Eren KÖSE 26/02/2024  18:34