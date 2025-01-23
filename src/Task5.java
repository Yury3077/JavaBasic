import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число 1:");
        int num1 = console.nextInt();

        System.out.print("Введи число 2:");
        int num2 = console.nextInt();

        System.out.print("Введи знак:");
        String sign = console.next();

        System.out.println(doCalculation(num1, num2, sign));
    }

    public static int doCalculation(int num1, int num2, String sign) {
        int res = 0;
        switch (sign) {
            case "+":
                res =  num1 + num2;
                break;
            case "-":
                res =  num1 - num2;
                break;
            case "*":
                res =  num1 * num2;
                break;
            case "/":
                res =  num1 / num2;
                break;
            default: System.out.println("Действие на найдено в калькуляторе");
        }

        return res;
    }
}
