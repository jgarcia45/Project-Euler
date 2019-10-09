//Amicable numbers

/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        
        
        int add = 0;
        for (int i = 2; i < 10000; i++) {
            int idivsum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    idivsum += j;
                }
            }
            int divsum = 0;
            for (int q = 1; q < idivsum; q++) {
                if (idivsum % q == 0) {
                    divsum += q;
                }
            }
            if (divsum == i & i != idivsum) {
               add += i; 
            }
        }
        System.out.println(add);
    }
}




