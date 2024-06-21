Given gender and age of a person, tell if the person is SENIOR CITIZEN or not. A male with age 60 or more years is Senior Citizen. A female with age 58 or more is Senior Citizen.

Input Format

One line of input containing a alphabet G in uppercase or lowercase (Gender of the person) and a number N (Age of the person) separated by space.

Constraints

Gender is given as one of the following options (f, F, m, M)

1 <= N <= 100

Output Format

Print Senior Citizen or Not A Senior Citizen based on given conditions in problem statement.

Sample Input 0

M 60
Sample Output 0

Senior Citizen
Submissions: 220
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        Scanner s=new Scanner(System.in);
8
         char G,M,F,m,f;
9
         int A;
10
        G=s.next().charAt(0);
11
        A=s.nextInt();
12
        if(G=='M'||G=='m')
13
        {
14
            if(A>=60)
15
            {
16
                System.out.println("Senior Citizen");
17
            }
18
            else
19
            {
20
               System.out.println("Not A Senior Citizen"); 
21
            }
22
        }
23
        else if(G=='F'||G=='f')
24
        {
25
            if(A>=58)
26
            {
27
                System.out.println("Senior Citizen");
28
            }
29
            else
30
            {
31
                System.out.println("Not A Senior Citizen");
32
            }
33
        }
34
         
35
    }
36
}
