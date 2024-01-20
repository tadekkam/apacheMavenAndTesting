public class CheckNumber {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(isEven(number));
        System.out.println(isOdd(number));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
