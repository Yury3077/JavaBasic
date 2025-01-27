import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи колличество строк в матрице: ");
        int num1 = console.nextInt();

        System.out.print("Введи колличество столбцов в матрице: ");
        int num2 = console.nextInt();

        int[][] array1 = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int k = 0; k < num2; k++) {
                System.out.print(String.format("Введите элемент массива с индексом %s и %s: ", i, k));
                int elem = console.nextInt();
                array1[i][k] = elem;
            }
        }

        printFirstLine(array1);
    }

    public static void printFirstLine(int[][] array) {
        for (int index = 0; index < array[0].length; index++) {
            System.out.println(array[0][index] * 3);
        }
    }
}
