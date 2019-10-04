//Power digit sum

/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
*/


public class Main
{
    public static void main(String[] args) {
        int n = 15;
        String two = "2";
        boolean remainder = false;
        for (int i = 1; i < n; i++) {
            String multiplied = "";
            for (int j = two.length() - 1; j >= 0; j--) {
                int a = Character.getNumericValue(two.charAt(j));
                a *= 2;
                if (remainder) {
                    a += 1;
                }
                if (a > 9) {
                    remainder = true;
                    a = a % 10;
                } else { remainder = false; }
                multiplied = a + multiplied;
            }
            if (remainder) {
                multiplied = 1 + multiplied;
                remainder = false;
            }
            
            
            two = multiplied;
            
        }
    
    
        char[] sumOfTwo = two.toCharArray();
        long sum = 0;
        long q;
        for (char d: sumOfTwo) {
            q = Character.getNumericValue(d);
            sum += q;
        }
        System.out.println(sum);
        
        
        
    }
}


