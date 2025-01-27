import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи размер массива: ");
        int num1 = console.nextInt();

        double[] array1 = new double[num1];

        for (int i = 0; i < num1; i++) {
            System.out.print(String.format("Введите %s элемент массива: ", i));
            double elem = console.nextDouble();
            array1[i] = elem;
        }

        System.out.println("Среднее арифметическое массива: " + arithmeticMean(array1));
        printArrayMultiplyArithmeticMean(array1);
    }

    public static double arithmeticMean(double[] array) {
        double sum = 0;
        for (Double elem: array) {
            sum += elem;
        }

        return sum / array.length;
    }

    public  static void printArrayMultiplyArithmeticMean(double[] array) {
        double multiplyNum = arithmeticMean(array);
        for (Double elem: array) {
            System.out.println(elem * multiplyNum);
        }
    }
}
