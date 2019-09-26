//Sum square difference

/*
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class HelloWorld{

     public static void main(String []args) {
         int x = 0; 
         int y = 0;
         int sum;
         int answer;
         
         for(int i = 1; i <= 100; i++) {
             x +=(i*i);
         }
         System.out.println(x);
         
         for(int i = 1; i <= 100; i++) { 
             y +=i;
         }
         sum = (y*y);
         System.out.println(sum);
         
         answer = sum - x;
         
         System.out.println(answer);
    
     }
}

