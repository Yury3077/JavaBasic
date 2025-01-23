import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число x:");
        int x = console.nextInt();

        System.out.print("Введи число y:");
        int y = console.nextInt();

        System.out.print("Введи число x:");
        int z = console.nextInt();

        double res1 = Double.valueOf(x + y + z) / 3;
        System.out.println(String.format("Среднее арифметическое: %s", res1));

        double res2 = Math.floor(res1 / 2);
        System.out.println(String.format("Делим на 2 и округляем в меньшую сторону: %s", res2));

        if (res2 > 3){
            System.out.print("Программа работает корректно");
        }
    }
}
