public class Task13 {
    public static void main(String[] args) {
        System.out.println(checkText("I love Java 8 Я люблю java 14 core1"));
    }

    public static int checkText(String someText) {
        String[] array1 = someText.split(" ");
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            if(array1[i].matches("[A-Za-z]+")){
                System.out.println(array1[i]);
                counter ++;
            }
        }

        return counter;
    }
}
