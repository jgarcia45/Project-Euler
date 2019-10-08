//Counting Sundays

/*
You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
  public static void main (String[]args)
  {
    //Months    JAN, FEB, MAR, APR, MAY, JUNE, JULY, AUG, SEPT, OCT, NOV, DEC 
    int[] Months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    //Months       1,  2,  3,    4,   5,    6,    7,   8,    9,  10,  11,  12

    int count = 0;
    int day = 7;

    for (int year = 1900; year <= 2000; year++) {

      for (int month:Months) {
        if (day == 1) {
        count+= 1;
          }
        if (month == 28) {
            if (year % 4 == 0 && year != 1900) {
                while (day < month + 1) {
                    day += 7;
                }
                day = day - (month + 1);
                System.out.println("Year: ---> " + year);
                
                System.out.println("Year: ---> " + day);
               
            } 
         } else {
                while (day < month) {
                    day += 7;
                }
                day = day - month;
          }

      }
    }
        System.out.println (count);
     
     
  }
}





