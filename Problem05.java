//Smallest Multiple

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class HelloWorld{

     public static void main(String []args){
        
        int pool[] = new int[20];
      
        pool[0] = 2;
        int count = 1;
        
        for (int i = 3; i <= 20; i++) {
            int j = i;
            System.out.println(j);
            
            for (int a = 0; pool[a] != 0; a++) { 
                if (j % pool[a] == 0) {
                    j = j / pool[a];                
                }
            }
            if (j == 1) {
                
            } else {
                pool[count] = j;
                count++;
            }
        }
        int answer = 1;
        for (int a = 0; pool[a] != 0; a++) {
            answer *= pool[a];
            System.out.println(answer);
         
        }       
            System.out.println(answer);    
     }
}

