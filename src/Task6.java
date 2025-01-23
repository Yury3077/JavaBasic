import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи, что переводить: 1 - масса, 2 - расстояние: ");
        int num1 = console.nextInt();

        System.out.print("Выбери единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        int num2 = console.nextInt();

        System.out.print("Введи значение: ");
        int value = console.nextInt();

        if (num1 == 1) {
            System.out.println("Переводим массу");
        }
        else if (num1 == 2) {
            transferDistance(value, num2);
        }
        else {
            System.out.println("Неверное поле ввода");
        }
    }

    public static void transferDistance(int value, int typeOfValue ) {
        switch (typeOfValue){
            case 1:
                System.out.println(String.format("Метры: %s", value));
                System.out.println(String.format("Мили: %s", value * 0.000621));
                System.out.println(String.format("Ярды: %s", value * 1.09));
                System.out.println(String.format("Футы: %s", value * 3.28));
                break;
            case 2:
                System.out.println(String.format("Метры: %s", value * 1609));
                System.out.println(String.format("Мили: %s", value));
                System.out.println(String.format("Ярды: %s", value * 1760));
                System.out.println(String.format("Футы: %s", value * 5280));
                break;
            case 3:
                System.out.println(String.format("Метры: %s", value * 0.9144));
                System.out.println(String.format("Мили: %s", value * 0.000568));
                System.out.println(String.format("Ярды: %s", value));
                System.out.println(String.format("Футы: %s", value * 3));
                break;
            case 4:
                System.out.println(String.format("Метры: %s", value * 0.3048));
                System.out.println(String.format("Мили: %s", value * 0.000189));
                System.out.println(String.format("Ярды: %s", value * 0.333333));
                System.out.println(String.format("Футы: %s", value));
                break;
            default: System.out.println("Введено неправильное значение единицы измерения");
        }
    }
}
