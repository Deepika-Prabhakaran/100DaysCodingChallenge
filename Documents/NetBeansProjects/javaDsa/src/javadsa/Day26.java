/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadsa;

import java.util.Scanner;
public class Day26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(",");

        for (String s : input) {
            String str[] = s.split(":");
            String word = str[0];
            String number = str[1];

            int sum = 0;
            for (char c : number.toCharArray()) {
                sum += (Character.getNumericValue(c) * Character.getNumericValue(c));
            }

            char[] arr = word.toCharArray();
            int n=arr.length;
            if(n>1){
            if (sum % 2 == 0) {
                //rhdt -> trhd 
                // Rotate right by 1
//                reverse(arr, 0, arr.length - 1);
//                reverse(arr, 0, 0);
//                reverse(arr, 1, arr.length - 1);
                
                  reverse(arr,0,n-2);
                  reverse(arr,n-1,n-1);
                  reverse(arr,0,n-1);
            } else {
                // Rotate left by 2
//                reverse(arr, 0, 1);
//                reverse(arr, 2, arr.length - 1);
//                reverse(arr, 0, arr.length - 1);

                  reverse(arr,0,1);
                  reverse(arr,2,n-1);
                  reverse(arr,0,n-1);
                  
            }
            }

            System.out.println(new String(arr));
        }
        sc.close();
    }

    // Reverse function for character array
    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


