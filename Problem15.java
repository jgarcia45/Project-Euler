//Lattice paths

/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/

public class HelloWorld{

     public static void main(String []args){
        
        long twFactorial = 1;
        long teFactorial = 1;
        long count = 1;
        int bigger = 40;
        for(int i = bigger; i > bigger / 2; i--) {
            twFactorial *= Long.valueOf(i);
            System.out.println("Multiplying by: --> " + i);
            System.out.println("New value: --> " + twFactorial);
            System.out.println("Max value: --> " + Long.MAX_VALUE);
            if (count <= 20) {
            teFactorial *= count;
            }
            if (twFactorial % teFactorial == 0) {
                twFactorial /= teFactorial;
                teFactorial = 1;
            }
            count++;
            
            
        }
        
       
        
        System.out.println(twFactorial/teFactorial);
        
        
        
        
     }
}

