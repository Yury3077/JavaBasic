public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int val = array1[4];
        array1[4] = array1[0];
        array1[0] = val;

        System.out.println(array1[0] + array1[array1.length / 2]);
    }
}
