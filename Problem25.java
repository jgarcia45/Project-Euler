//1000-digit Fibonacci number

/*
The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
*/


//WORKS BUT HITS MEMORY SPACE
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        LinkedList<String> F = new LinkedList<String>();
        F.add("0");
        F.add("1");
        F.add("1");
        int i = 2;
        while (F.get(i).length() < 1000) {
            String larger = F.get(i);
            String smaller = F.get(i - 1);
            if (larger.length() != smaller.length()) {
                while(larger.length() != smaller.length()) {
                    smaller = "0" + smaller;
                }
            }
            boolean remainder = false;
            String answer = "";
            for (int j = 0; j < larger.length(); j++) {
                int first = Character.getNumericValue(larger.charAt(j));
                int second = Character.getNumericValue(smaller.charAt(j));
                int sum = first + second;
                if (remainder) {
                    sum++;
                }
                if (sum > 9) {
                    remainder = true;
                    sum = sum % 10;
                } else {
                    remainder = false;
                }
                answer = sum + answer;
            }
            i++;
            F.add(answer);
        }
        
        System.out.println(i);
        
    }
}
