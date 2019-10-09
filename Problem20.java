//Factorial digit sum

/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
    String Answer = "100";
    int Numb = 99;
    while (Numb > 1) {
        String CurrentAnswer = Answer;
        String NextNumb = "" + Numb;
        char[] multi = NextNumb.toCharArray();
        char[] AnswerString = CurrentAnswer.toCharArray();
        String firstLine = "";
        String secondLine = "0";
        for (int i = multi.length - 1; i >= 0; i--) {
            int remainder = 0;
            for (int j = AnswerString.length - 1; j >= 0; j--) {
                int d = Character.getNumericValue(multi[i]) * Character.getNumericValue(AnswerString[j]);
                d += remainder;
                if (d > 9) {
                    remainder = d / 10;
                } else {
                    remainder = 0;
                }
                if (multi.length == 2) {
                    if (i == 1) {
                        firstLine = (d % 10) + firstLine;
                        if (j == 0 && remainder != 0) {
                            firstLine = remainder + firstLine;
                        }
                    } else {
                        secondLine = (d % 10) + secondLine;
                        if (j == 0 && remainder != 0) {
                            secondLine = remainder + secondLine;
                        }
                    }
                } else {
                    firstLine = (d % 10) + firstLine;
                    if (j == 0 && remainder != 0) {
                        firstLine = remainder + firstLine;
                    }
                
                }
                
            }
          
        }
        if (secondLine == "0") {
            Answer = firstLine;
        } else {
            while (firstLine.length() != secondLine.length()) {
                firstLine = "0" + firstLine;
            }
                char[] first = firstLine.toCharArray();
                char[] second = secondLine.toCharArray();
                String firstPlusSecond = "";
                Boolean remain = false;
                for (int q = first.length - 1; q >= 0; q--) {
                    int sum = Character.getNumericValue(first[q]) + Character.getNumericValue(second[q]);
                    if (remain) {
                        sum++;
                        remain = false;
                    }
                    if (sum > 9) {
                        if (q == 0) {
                            remain = false;
                        } else {
                            sum = sum % 10;
                            remain = true;
                        }
                    }
                    firstPlusSecond = sum + firstPlusSecond;
                    
                    
                }
            
            
            Answer = firstPlusSecond;
        }
  
        
        
        
        System.out.println(Answer);
        
        Numb -= 1;
    }
    long summ = 0;
    char[] AnswerSum = Answer.toCharArray();
    for (char z: AnswerSum) {
        summ = summ + Character.getNumericValue(z);
    }
    System.out.println(summ);
    }
}




