//Lexicographic permutations

/*
A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
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
        
        //Edit this to find which iteration you want
        int iteration = 1000000;
        
        LinkedList<Integer> ref = new LinkedList<Integer>();
        ref.add(0);
        ref.add(1);
        ref.add(2);
        ref.add(3);
        ref.add(4);
        ref.add(5);
        ref.add(6);
        ref.add(7);
        ref.add(8);
        ref.add(9);
        
        int[] answer = new int[10];
        int count = 0;
        int max = factorial(ref.size());
        
        int Intervalsize = max / ref.size();        
        int interval = 0;
        int iterationOverall = interval;
        
        while (ref.size() != 0) {
            int gay = iteration / Intervalsize;
            //can be broken up into mroe if statments because the interval is falling on the iteration
            //which causes the mod to equal 0 so we subtarct 1 from 0 leading us to try to get the -1 value
            //from the likedlist
            interval = (iteration % Intervalsize == 0 ) ? (iteration/Intervalsize) - 1: iteration / Intervalsize;
            answer[count] = ref.get(interval);
            int sup = ref.get(interval);
            ref.remove(interval);
            System.out.println(Arrays.toString(answer));
            
            if (ref.size() != 0) {
                
             max = factorial(ref.size());
            
            if (ref.size() == 2) {
                Intervalsize = 1;
                    if (iteration == 1) {
                        iteration = 0;
                    } else {
                        iteration = (iteration % 2 == 0) ? 1 : 0;
                    }
                count++;
                answer[count] = ref.get(iteration);
                ref.remove(iteration);
                answer[count + 1] = ref.get(0);
                ref.remove(0);
                count++;
            } else {
                Intervalsize = max / (ref.size());
                iteration = (iteration <= max) ? iteration: iteration % max;
            }
            }
            
            
            count++;
        }
        System.out.println(Arrays.toString(answer));
        
        
        
        
    }
    
    public static int factorial(int factor) {
        int numb = 1;
        while (factor > 0) {
            numb *= factor;
            factor--;
        }
        return numb;
    }
}




