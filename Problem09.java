//Special Pythagorean triplet

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class HelloWorld{

     public static void main(String []args) {
         
         for(int a = 3; a < 333; a++) {
           
             int c = a + 2;
             
             for(int b = a + 1; (a+b+c) < 1000; b++) {
               
                 c = 1000 - b - a;
                
                 if(((a*a) + (b*b)) == (c*c)) {
                     
                     System.out.println(a * b * c);
                     
                 }
                 c = a + 2;
             }
         }
         
     }
}

