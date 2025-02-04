import java.util.HashSet;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int strAmount = getNumber();

        String[] strArray = new String[strAmount];
        for (int index = 0; index < strAmount; index++) {
            System.out.print(String.format("Введи строку %s: ", index + 1));
            String text = console.next();
            strArray[index] = text;
        }

        String maxSign = "";
        for(String elem : strArray){
            if (countUniqueSign(elem) > countUniqueSign(maxSign)) {
                maxSign = elem;
            }
        }

        System.out.println("Ответ: " + maxSign);
    }

    public static int countUniqueSign(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        return uniqueChars.size();
    }

    public static int getNumber() {
        boolean needSuitableNum = true;
        int num1 = 0;

        while (needSuitableNum) {
            Scanner console = new Scanner(System.in);
            System.out.print("Введи колличество строк: ");

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
}
