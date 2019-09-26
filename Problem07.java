//10001st prime
/*


By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

public class HelloWorld{

     public static void main(String []args){
       
       int count = 0;
       int numb = 2;
       while (count < 10001){
           
           
           if (isPrime(numb)) {
                count++;
              
          }
          numb++;
           
           
       }
       System.out.println(numb-1);
        
         
         
     }
      public static long LargestPrime(long myN) {
           if (isPrime(myN)) {
               return myN;
           } else {
               long highPrime = 0;
               while (!isPrime(myN)) {
                   long sm = findSmallestFactor(myN);
                   if (isPrime(sm)) {
                       if (sm > highPrime) {
                           highPrime = sm;
                       }
                   }
                   myN = myN / sm;
               }
               return highPrime > myN ? highPrime : myN;
           }
       }
       
       
       public static long findSmallestFactor(long myN) {
           if (myN == 1 || myN == 2) {
               return myN;
           }
           
           for (long i = 2; i <= myN; i++) {
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


