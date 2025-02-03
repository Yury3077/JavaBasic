import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи простое уравнение: ");
        String equation = console.next();

        String value1 = equation.substring(0,1);
        String value2 = equation.substring(1,3);
        String value3 = equation.substring(4,5);

        if (value1.contains("x")) {
            System.out.println(String.format("Ответ: х=%s", Integer.parseInt(value2) * (-1) + Integer.parseInt(value3)));
        }
        else if (value2.contains("x")) {
            int res = Integer.parseInt(value1) * (-1) + Integer.parseInt(value3);
            if (value2.contains("-")) {
                res = res * -1;
            }
            System.out.println(String.format("Ответ: х=%s", res));
        }
        else  {
            System.out.println(String.format("Ответ: х=%s", Integer.parseInt(value1) + Integer.parseInt(value2)));
        }
    }
}
