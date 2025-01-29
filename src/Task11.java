import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи первое число: ");
        String num1 = console.next();

        System.out.print("Введи второе число ");
        int num2 = console.nextInt();

        System.out.println(Math.max(Integer.parseInt(num1), num2));
        System.out.println(Math.min(Double.parseDouble(num1), num2));
    }
}
