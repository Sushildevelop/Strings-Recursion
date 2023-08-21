package Practice.Recursion_3.Strings;

import java.util.Scanner;

public class Remove_occurrences {

    static String removeA2(String s){
        if (s.length()==0) return "";
        String smallans=removeA2(s.substring(1));
        // self work
        char currchar=s.charAt(0);
        if (currchar!='a'){
            return currchar +smallans;
        }
        else{
            return smallans;
        }

    }
    static String removeChar(String s,int index){
             if (index==s.length()) return "";
             // recursive work
        String smallans=removeChar(s,index+1);

        // self work
        char currchar=s.charAt(index);
        if (currchar!='a'){
            return currchar +smallans;
        }
        else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeChar(s,0));

        System.out.println(removeA2(s));













//        for (int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }



        //
//        char ch=s.charAt(0);
//        System.out.println(ch);
    }
}
