The comparison is as: A = B, A < B, A > B

Check whether it is Right or Wrong

Input Format

The first line contains the number of test cases t.

Then there are t lines each containing a test case. Each test case contains an Integer followed by a comparison Operator which is again followed by an Integer.

Constraints

1 <= T <= 105

-105 <= A,B <= 105

Output Format

For each test case, If the comparison is true print "Right" else print "Wrong".

The result for each test case needs to be printed in a new line.

Sample Input 0

2
5 > 4
6 < 3
Sample Output 0

Right
Wrong
Submissions: 203
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
1
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=s.nextInt();
            char c=s.next().charAt(0);
            int b=s.nextInt();
            if(c=='>')
            {
                if(a>b)
                    System.out.println("Right");
                else
                    System.out.println("Wrong");
            }
            else if(c=='<')
            {
                if(a<b)
                    System.out.println("Right");
                else
                    System.out.println("Wrong");
            }
    
        }
    }
}
    }
}
