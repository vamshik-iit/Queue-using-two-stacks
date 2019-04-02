/* @author KUSA VAMSHI */

/*  This is the program for Queue using Two Stacks */




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int c;
        for (int i = 0 ; i < n ; i++) 
        {
            c=sc.nextInt();
            if (c==1)
                s1.push(sc.nextInt());
            else if (c == 2)
            {
                if(s2.isEmpty())
                    while(!s1.isEmpty())
                        s2.push(s1.pop());
                if (!s2.isEmpty())
                    s2.pop(); 
            }
            else if (c == 3)
            {       
                if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                        s2.push(s1.pop());
                    System.out.println(s2.peek());
                } 
                else 
                    System.out.println(s2.peek());
            }
        }
    }
}