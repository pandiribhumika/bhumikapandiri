There are four quadrants, numbered from 1 to 4, as shown in the diagram below:image

For example, the point A, which is at coordinates (12,5) lies in quadrant 1 since both its x and y values are positive, and point B lies in quadrant 2 since its x value is negative and its y value is positive.

Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will be 0.

Input Format

The first line of input contains the integer x.

The second line of input contains the integer y.

Constraints

−1000≤ x,y ≤1000 x≠0 y≠0

Output Format

Output the quadrant number 1, 2, 3

or 4 for the point (x, y).

Sample Input 0

4 5
Sample Output 0

1
Submissions: 195
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
        int x,y;
9
        x=s.nextInt();
10
        y=s.nextInt();
11
        if(x>=0 && y>=0)
12
        {
13
            System.out.println("1");
14
        }
15
        else if(x<0 && y>=0)
16
        {
17
            System.out.println("2");
18
        }
19
        else if(x<0 && y<0)
20
        {
21
            System.out.println("3");
22
        }
23
        else
24
        {
25
            System.out.println("4");
26
        }
27
    }
28
}
