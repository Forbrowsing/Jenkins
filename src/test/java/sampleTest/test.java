package sampleTest;

import org.testng.annotations.Test;

public class test {

    @Test
    public void checkCalculator() {
        // Create calculator object
        calculator calc = new calculator();

        // Call methods and print results
        System.out.println("Addition (5 + 3): " + calc.add(5, 3));
        System.out.println("Multiplication (4 * 2): " + calc.multiply(4, 2));
    }
}
