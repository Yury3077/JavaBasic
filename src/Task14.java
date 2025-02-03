import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[15];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(-20, 20);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int elem : array1) {
            if (elem < min) {
                min = elem;
            }
            if (elem > max) {
                max = elem;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println(Math.abs(min) > Math.abs(max) ? Math.abs(min) : Math.abs(max));
    }
}
