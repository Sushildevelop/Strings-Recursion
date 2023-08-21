package Practice.Recursion_3.Strings;

import java.util.Scanner;

public class reverse_string {
    static String reverse(String s,int idx){
       if (idx==s.length()) return "";
       String smallans=reverse(s,idx+1);
       //  String smallans=reverse(s.substring(1);
       return smallans+s.charAt(idx);
       // return smallans+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s,0));
    }
}
