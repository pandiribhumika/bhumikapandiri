The expression will be one of the following expressions:

A + B = C, A - B = C and A * B = C.

where A, B, C are three numbers, S is the sign between A and B, and Q is the '=' sign.

If the expression is right print "Yes", Otherwise print the right answer of the expression.

Input Format

The first line contains the number of test cases t.

The following lines contain t test cases. One test case per line.

Each test case is in the format A S B Q C, where A,B and C are the numbers, S is the sign between A and B and Q is the '=' sign.

Constraints

1<= T <= 105

0<= A,B <= 102

-105 <= C <=105

Output Format

Print the result of each test case in a new line.

In each test case, If the expression is right print "Yes", Otherwise print the right answer of the expression.

Sample Input 0

2
5 + 10 = 15
2 * 10 = 19
Sample Output 0

Yes
20
Submissions: 171
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
         }
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
        Scanner s=new Scanner (System.in);
8
        int n=s.nextInt();
9
        for(int i=1;i<=n;i++)
10
        {
11
            int a=s.nextInt();
12
            char c=s.next().charAt(0);
13
            int b=s.nextInt();
14
            char q=s.next().charAt(0);
15
            int d=s.nextInt();
16
            switch(c)
17
            {
18
                 case '+':
19
                if(a+b==d)
20
                    System.out.println("Yes");
21
                else
22
                    System.out.println(a+b);
23
                    break;
24
            case '-':
25
                if(a-b==d)
26
                    System.out.println("Yes");
27
                else
28
                    System.out.println(a-b);
29
                break;
30
            case '*':
31
                if(a*b==d)
32
                    System.out.println("Yes");
33
                else
34
                    System.out.println(a*b);
35
                break;
36
            }
37
        }
38
    }
39
}
