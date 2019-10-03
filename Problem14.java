//Longest Collatz sequence

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class HelloWorld{

     public static void main(String []args){
        long max = 0;
        long counter = 1;
        long DigitNumber = 0;
        long doog[] = new long[1000001];
        doog[0] = 0L;
        doog[1] = 1L;
      
        
        for (long i = 2; i <= 1000000; i++) {
            long j = i; 
            
            while (j != 1L & j > i - 1L) {
                if ( j % 2L == 0L) {
                    j /= 2L;
                } else {
                    j = (j * 3L) + 1L;
                }
                counter++;
            }
            if (j != 1) {
            counter += doog[Math.toIntExact(j)];
            }
            if (counter > max) {
                max = counter;
                DigitNumber = i;
            }
            doog[Math.toIntExact(i)] = counter;
            counter = 1;
            
        }
        
        System.out.println(DigitNumber);
        
        
        
        
     }
}

