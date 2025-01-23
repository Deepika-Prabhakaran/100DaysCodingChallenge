//day4 Step Number or Not 
/*Given a number N, the program must print if N is a step number or not.
(A step number is a number which has a digit which is either 1 more or 1 less than the previous digit).*/
import java.util.*;
public class Day4StepNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int previous=-1;
        Boolean ans=true;
        while(n>0){
            int current_digit=n%10;
            if(previous!=-1){
                if(Math.abs(current_digit-previous)!=1){
                    ans=false;
                    break;
                }
            }
                n=n/10;
                previous=current_digit;
        }
        if(ans){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

