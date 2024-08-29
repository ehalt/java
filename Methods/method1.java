public class method1 {
    public static int add (int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void hello (String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int result = add(5, 9);
        hello("I do like to lear something new!");
        System.out.println(result);
    }
}