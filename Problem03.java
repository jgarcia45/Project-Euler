//Largest Prime Factor
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/


public class HelloWorld{

     public static void main(String []args){
       long bottle = 600851475143L;
         System.out.println(LargestPrime(bottle));         
       
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

