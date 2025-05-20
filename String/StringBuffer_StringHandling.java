/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/

public class PerformanceTest {

    public static void main(String[] args) {
        final int iterations = 10000;
        final String text = "AIET";

        // Test with StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test with StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Justification
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both took the same amount of time.");
        }
    }
}
