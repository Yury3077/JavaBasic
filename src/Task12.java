public class Task12 {
    public static void main(String[] args) {
        checkString("I like Java!!!");
    }

    public static void checkString(String someText) {
        boolean check1 = someText.contains("Java");
        boolean check2 = someText.startsWith("I like");
        boolean check3 = someText.endsWith("!!!");

        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);

        if (check1 && check2 && check3) {
            System.out.println(someText.toUpperCase());
        }

        String repStr = someText.replace("a", "o");
        System.out.println(repStr);
        System.out.println(repStr.substring(7, 11));
    }
}
