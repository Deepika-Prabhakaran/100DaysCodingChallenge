

//Day 5 count of the number 
/*A positive integer N is passed as the input. If we print all the numbers from 1 to N continuously,
the program must find the number of characters (digits) C printed and print the count C as the output.*/

import java.util.Scanner;
public class Day5IntegerCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
//            int num=i;
//            while(num>0){
//                int rem=num%10;
//                count++;
//                num/=10;
count+=Integer.toString(i).length();
    }
            
        System.out.println(count);
}
    }



    
