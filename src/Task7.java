import java.util.Scanner;

public class Task7 {
    private static final int X = 1;
    private static final int Y = 3;
    private static final int Z = 10;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи размер массива: ");
        int num1 = console.nextInt();

        int[] array1 = new int[num1];

        for (int i = 0; i < num1; i ++) {
            System.out.print(String.format("Введите %s элемент массива: ", i));
            int elem = console.nextInt();
            array1[i] = elem;
        }

        for (int k = 0; k < array1.length; k ++){
            if (array1[k] == X || array1[k] == Y || array1[k] == Z){
                System.out.println("Данное значение есть в костантах");
                break;
            }
        }
    }
}
