package ExpectionHandling;

public class TryCatchExamples {
    static int performDivision(int x, int y) {
        System.out.println("I am from division");
        try {
            int z = x / y;
            return z;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // or some other default value
        }
    }

    static float performDivision(float a, float b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // or some other default value
        }
        return a / b;
    }
}