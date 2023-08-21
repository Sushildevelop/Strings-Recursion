package Practice.Recursion_3.Strings;

import java.util.Scanner;

public class Palindrome_without_reverseMethod {
    static  boolean isPalindrome(String s, int l ,int r){
        if (l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
