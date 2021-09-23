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


    public static int fib(int n){
        int result=0;
        int next=1;
        int sum=0;
        for (int j=1;j<n;j++){
            sum=result+next;
            result=next;
            next=sum;

        }
        return sum;



    public static int sumOfIntegers(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;

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
