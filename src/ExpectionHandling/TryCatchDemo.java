package ExpectionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("=== TryCatch Demo ===");

        
        System.out.println("\n-- Integer Division Tests --");
        int result1 = TryCatchExamples.performDivision(10, 2);
        System.out.println("Result (10 / 2) = " + result1);

        int result2 = TryCatchExamples.performDivision(10, 0);
        System.out.println("Result (10 / 0) = " + result2);

   
        System.out.println("\n-- Float Division Tests --");
        float result3 = TryCatchExamples.performDivision(15.5f, 2.5f);
        System.out.println("Result (15.5 / 2.5) = " + result3);

        float result4 = TryCatchExamples.performDivision(8.0f, 0.0f);
        System.out.println("Result (8.0 / 0.0) = " + result4);

        System.out.println("\n=== Program Finished ===");
    }
}
