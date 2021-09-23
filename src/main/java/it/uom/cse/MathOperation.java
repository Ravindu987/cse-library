package it.uom.cse;

import java.util.Arrays;


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




    }

}
