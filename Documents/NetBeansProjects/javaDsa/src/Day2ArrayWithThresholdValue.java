
import java.util.*;
public class Day2ArrayWithThresholdValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
  
        int count=0;
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]/k;
            int mod=arr[i]%k;
//            System.out.println(arr[i]+rem+mod);
            if(mod>0){
                rem++;
                }
            count+=rem;
        }
            System.out.println(count);
    }
}

        
 

