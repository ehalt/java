public class overload {

    static int plusmethodint(int a, int b) {
        return a + b;
    }

    static double plusmethoddouble (double a, double b) {
        return a + b;
    }

    public static void main(String[] args) { 
        int int_result = plusmethodint(5, 9);
        double double_result = plusmethoddouble(10.5, 3.4);

        System.out.println(int_result);
        System.out.println(double_result);
    }
}