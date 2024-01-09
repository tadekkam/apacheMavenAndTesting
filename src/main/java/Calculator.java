public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(sub(1, 2));
        System.out.println(mul(1, 2));
        System.out.println(div(1, 0));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero");
            return 0;
        }
    }


}
