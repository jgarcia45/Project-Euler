//Largest Palindrome Product

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class HelloWorld{

     public static void main(String []args){
  
        int u = 0;
       for(int i = 999; i >=  100; i--) {
           for(int j = 999; j >= 100; j--) {
               int Pali = i * j;
              if (isPali(Pali)) {
                  if (Pali > u) {
                      u = Pali;
                  }
              }
           }
       }
       System.out.println(u);
         
         
     }
     
      public static boolean isPali(int numm) {
          int k = 0;
          int num = numm;
          while(num != 0) {
            int myNum = num % 10;
            num = num - myNum;
            num = (num / 10);
            k = k + myNum;
            if(num != 0) {
                k = k * 10;
            }
          }
          if(k == numm) {
              return true;
          }
          else {
              return false;
          }
      }
       
    
}

