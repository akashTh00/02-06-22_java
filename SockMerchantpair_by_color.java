There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
public static void main(String[] args) {
Scanner ask=new Scanner(System.in);
int[] colors=new int[101];
int ans=0;
int n=ask.nextInt();
for(int i=0;i<n;i++){
int color=ask.nextInt();
colors[color]++;
if(colors[color]%2 == 0){
ans++;
colors[color] = 0;
}
}
System.out.println(ans);
}
}