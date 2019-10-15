//Non-abundant sums

/*
A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Hashtable<Integer, Boolean> AbdNumb = new Hashtable<Integer, Boolean>();
        Hashtable<Integer, Boolean> AbdSum  = new Hashtable<Integer, Boolean>();
        int SumOfNonAbdSum = 0;
            for (int i = 1; i <= 28123; i++) {
            
            if (isAbundant(i)) {
                AbdNumb.put(i, true);
                Set<Integer> keys = AbdNumb.keySet();
                for(Integer key: keys){
                     AbdSum.put(key + i, true);
                }
                
            }
            if (!AbdSum.containsKey(i)) {
                SumOfNonAbdSum += i;
            }
        }
       System.out.println(SumOfNonAbdSum);
        
        
    }
    
    
    public static boolean isAbundant(int numb) {
        int count = 0;
        for (int z = 1; z < numb; z++) {
            if (numb % z == 0) {
                count = count + z;
            }
    }
 
    if (count > numb) {
        return true;
    }
    return false;
        
    }
}

