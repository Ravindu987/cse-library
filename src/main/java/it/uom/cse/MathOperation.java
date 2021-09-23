package it.uom.cse;

import java.util.Arrays;

/**
 * Test
 */

public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int factorial(int n){

        if(n == 0)
            return 1;

        int factorial = 1;

        for(int i = n; i > 0; i--){
            factorial *= i;
        }

        return factorial;

    }

}
