//Summation of primes
/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/



public class HelloWorld{

     public static void main(String []args){
       
         
         
         
         long sum = 5 + 5; 
         for (long i = 7; i <= 2000000; i = i + 2) {
            if (isPrime(i)) {
                sum += i;
  
            }
          
         }
         
         
         System.out.println(sum);
        
         
         
     }
      
       
       
       public static long findSmallestFactor(long myN) {
           
           
           for (long i = 2; i * i <= myN; i++) {
               if (myN % i == 0) {
                  return i;
               }
           }
          return myN;
       }
       
       public static boolean isPrime(long myN) {
           long sm = findSmallestFactor(myN);
           if (sm == myN) {
               return true;
           }
           return false;
       }
}

