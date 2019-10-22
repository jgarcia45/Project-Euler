//Truncatable primes

/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

*/

import math

count = 0;
first = ["2", "3", "5", "7"];
last = ["3", "7"];
middle = ["1", "2", "5"];
pool = dict;

#Function Find Prime
def isPrime(myNum):
    for i in range(2, 1 + int(math.sqrt(myNum))):
        if myNum % i == 0:
            return False;

    return True;


            
def isTrunc(str):
    str01 = str[1:];
    str02 = str[:-1];
    while len(str01) > 0:
        if not isPrime(int(str01)):
            return False;
        str01 = str01[1:];
    while len(str02) > 0:
        if not isPrime(int(str02)):
            return False;
        str02 = str02[:-1];
    return True;

i = 11;
sum = 0;
while count <= 11:
    
    if str(i)[0] != "1" and str(i)[-1] != "1":
        if isPrime(i):
            if isTrunc(str(i)):
                sum = sum + i;
                count = count + 1;
                print("i:--------> " + str(i));
                print("count:---->  " + str(count));
                print("sum:----------------------> " + str(sum));
    i = i + 1;



