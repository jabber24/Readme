

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2 = "";
        System.out.println("Enter a String 1: " );
        System.out.println("String 1:" + " "+ (s1 = input.nextLine()));
        System.out.println("Enter a String 2: ");
        System.out.println("String 2:" + " " + (s2 = input.nextLine()));
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        System.out.println("Reverse String:" + " " + sb);

        //Boolean exp
        System.out.println(sb.toString().equals(s2) ? "The input String is a palindrome" : "The input String is not a palindrome");
    }

}