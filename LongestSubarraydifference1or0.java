//Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.

//int a[n]: an array of integers

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[in.nextInt()]++;
        }
        int max = 0;
        for (int i = 0; i < 99; i++) {
            max = Math.max(max, a[i]+a[i+1]);
        }
        System.out.println(max);
    }
}
