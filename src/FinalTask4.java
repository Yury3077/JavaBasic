import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        final String QUESTION = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезыпроливает";
        final String ANSWER = "Заархивированный вирус";
        final String HELP = "Подсказка";

        Scanner console = new Scanner(System.in);
        System.out.println(String.format("Отгадай загадку: %s", QUESTION));

        boolean getRightAnswer = false;
        int attempts = 1;
        boolean useHelp = false;

        while (!getRightAnswer) {

            System.out.print(String.format("Введи ответ (попытка №-%s):", attempts));
            String answerText = console.next();

            if (HELP.equals(answerText) && attempts == 1) {
                System.out.println("Подсказка зала");
                useHelp = true;
                continue;
            } else if (HELP.equals(answerText) && attempts != 1) {
                System.out.println("Подсказка уже недоступна");
                continue;
            }

            if (ANSWER.equals(answerText)) {
                System.out.println("Правильно");
                break;
            }
            else {
                if (useHelp || attempts >= 3) {
                    System.out.println("Обидно приходи в другой раз");
                    break;
                }
                else {
                    System.out.println("Подумай еще");
                }
                attempts ++;
            }
        }
    }
}
