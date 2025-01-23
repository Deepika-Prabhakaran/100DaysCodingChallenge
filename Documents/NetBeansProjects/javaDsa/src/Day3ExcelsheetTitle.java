//day 3 Excel sheet Title
/*Given a number, convert it into corresponding alphabet.

Input                 Output

1                           A

26                         Z

27                         AA

676                      YZ */
import java.util.*;
public class Day3ExcelsheetTitle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder result=new StringBuilder();
        while(n>0){
            n--;
            int rem=n%26;
            char letter=(char) ('A'+rem);
            result.insert(0,letter);
            n/=26;
        }
       System.out.println(result.toString());
}
}

