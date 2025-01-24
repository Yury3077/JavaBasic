import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(String.format("Сумма нечетных чисел: %s", sumOddNumbers(getNumber())));
    }

    public static int getNumber() {
        boolean needSuitableNum = true;
        int num1 = 0;

        while (needSuitableNum) {
            Scanner console = new Scanner(System.in);
            System.out.print("Введи целое положительное число: ");

            if (console.hasNextInt()) {
                num1 = console.nextInt();
                if (num1 > 0) {
                    needSuitableNum = false;
                } else {
                    System.out.println("Необходимо ввести положительное число!");
                }
            } else {
                System.out.println("Необходимо ввести целое число");
            }
        }

        return num1;
    }

    public static int sumOddNumbers(int num) {
        int counter = 1;
        int sum = 0;
        while (counter <= num) {
            sum += counter;
            counter += 2;
        }

        return sum;
    }
}
