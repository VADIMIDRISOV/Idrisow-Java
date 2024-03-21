public class Calculator {
    public static void main(String[] args) {
        Calculator.sum(10, 11);
        Calculator.subtraction(10, 11);
        Calculator.division(10, 11);
        Calculator.multiplication(10, 11);
    }

    private static void print(int a, int b) {
        if (a < b) {
            System.out.printf("%s < %s\n", a, b);
        } else if (a > b) {
            System.out.printf("%s > %s\n", a, b);
        } else System.out.printf("%s = %s\n", a, b);
    }

    public static Integer sum(int a, int b) {
        print(a, b);
        int result = a + b;
        System.out.printf("%s + %s = %s\n", a, b, result);
        return result;
    }

    public static Integer subtraction(int a, int b) {
        print(a, b);
        int result = a - b;
        System.out.printf("%s - %s = %s\n", a, b, result);
        return result;
    }

    public static Integer division(int a, int b) {
        print(a, b);
        int result = a / b;
        System.out.printf("%s / %s = %s\n", a, b, result);
        return result;
    }

    public static Integer multiplication(int a, int b) {
        print(a, b);
        int result = a * b;
        System.out.printf("%s * %s = %s\n", a, b, result);
        return result;
    }
}
