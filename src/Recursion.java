import java.util.Arrays;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        List<Object> data = Arrays.asList("A", "B", Arrays.asList("D", Arrays.asList("E", "F")), "C");
//        System.out.println(data);
        printRec(data, 1);
    }
    static int recDeep = 1;
    public static void printRec(List<Object> list1, int recDeep) {
        for (int ind = 0; ind < list1.size(); ind++) {
            if (list1.get(ind) instanceof String) {
                for (int i = 0; i < recDeep; i++) {
                    System.out.print("-");
                }
                System.out.println(list1.get(ind));
            }
            else {
//                recDeep ++;
                printRec((List<Object>) list1.get(ind), recDeep + 1);
            }
        }
    }
}



// List<Object> data - коллекция, которая может содержать два типа переменных (String, List<String>)
// Требуется написать метод, который напечатал бы все содержащиеся в коллекции переменные в формате «-String», где количество «-» равно уровню вложенности
// Метод должен быть рекурсивным

// Пример вывода:
// - A
// - B
// -- D
// --- E
// --- F
// - C