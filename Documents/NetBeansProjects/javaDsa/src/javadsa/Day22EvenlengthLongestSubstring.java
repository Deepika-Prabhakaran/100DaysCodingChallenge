/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadsa;

import java.util.Scanner;


public class Day22EvenlengthLongestSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int[] prefix=new int[n];
        prefix[0]=Integer.parseInt(String.valueOf(s.charAt(0)));
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int i=0;
        int maxLen=Integer.MIN_VALUE;
        String res=null;
        while(i<n){
            int j=(n-i)%2==0?n-1:n-2;
            while(j>i){
                int mid=(j-i)/2+i;
            int leftsum=prefix[mid]-prefix[i]+Integer.parseInt(String.valueOf(s.charAt(i)));
            int rightsum=prefix[j]-prefix[mid];
            int len=j-i+1;
            if(leftsum==rightsum && len>maxLen){
                maxLen=len;
                res=s.substring(i,j+1);
            }
            j-=2;
        }
           i++;
        } 
        System.out.println(res==null?-1:res);
    }
    
}
