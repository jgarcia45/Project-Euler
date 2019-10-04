//Number letter counts

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/



public class Main
{
    public static void main(String[] args) {
        
        int sum = 0;
        int difference = 0;
        //
        int[] NumberSingles = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4};
        //                     0  1  2  3  4  5  6  7  8  9       
        int[] NumberTeen10 = {3,  6,  6,  8,  8,  7,  7,  9,  8,  8};                                       
        //                   10  11  12  13  14  15  16  17  18  19  20
        int[] NumberEnties = {0, 3, 6, 6, 5, 5, 5, 7, 6, 6};
        //                    0 10 20 30 40 50 60 70 80 90 100
        int hundred = 7;
        //
        int onethousand = 11;
        int and = 3;
        for(int i = 1; i < 1000; i++) {
            if(i < 10){
                sum += NumberSingles[i];
            }
            
            else if(i > 9  && i < 20) {
              
                sum += NumberTeen10[i % 10];
                
                    
            }
            else if (i < 100) {
                sum += NumberSingles[(i % 10)];
                sum += NumberEnties[(i / 10)];
                
                
            } else {
                if (i % 100 == 0) {
                    sum += hundred + NumberSingles[i / 100];
                } else if ((i % 100) < 20 && (i % 100) > 9 ) {
                    sum += NumberTeen10[(i % 100) % 10];
                    sum += and;
                    sum += hundred  + NumberSingles[i / 100];
               
                } else {
                sum += NumberSingles[(i % 10)];
                sum += NumberEnties[(i % 100) / 10];
                System.out.println("Can never be one:---> " + (i % 100) / 10);
                sum += hundred + NumberSingles[i / 100];
                sum += and;
                }
            }
       
            //System.out.println("Current Integer:-----> " + i);
           // System.out.println("Sum:------------------> " + (sum - difference));
           // System.out.println("TotalSum:.." + sum);
          //  System.out.println("-------------------------------------");
    
            difference = sum;
            
        }
       sum += onethousand;
        System.out.println(sum);
    }
}


