//Day 1 Sliding window 
/*Given an array of numbers and a window of size k.
Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.*/
import java.util.Scanner;
public class Day1SlidingWindow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ws=sc.nextInt();
        for(int i=0;i<=arr.length-ws;i++){
        int maxi=0;
           for(int j=i;j<i+ws;j++) {
            maxi=Math.max(maxi,arr[j]);
        }
        
        System.out.print(maxi+" ");
        }
    }
}



