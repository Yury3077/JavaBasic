import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи текущий курс доллора: ");
        float exchangeRate = console.nextFloat();

        System.out.print("Введи колличество рублей: ");
        float amount = console.nextFloat();

        currencyExchange(exchangeRate, amount);
    }

    public static void currencyExchange(float rate, float amount) {
        float dollars = amount / rate;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(String.format("Итого: %s долларов", df.format(dollars)));
    }
}
