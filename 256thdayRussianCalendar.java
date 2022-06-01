// Given a year, , find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        
        if(y==1918)
        {
            System.out.println("26.09." + y);
        }
        else if(y>=1919)
        {
            if(y%400==0 || (y%4==0 && y%100!=0))
            {
                System.out.println("12.09." + y);
            }
            else
            {
                System.out.println("13.09." + y);
            }
        }
        else if(y<=1917)
        {
            if(y%4==0)
            {
                System.out.println("12.09." + y);
            }
            else
            {
                System.out.println("13.09." + y);
            }    
        }
    }
}