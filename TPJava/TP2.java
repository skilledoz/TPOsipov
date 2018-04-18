import java.util.*;

public class TP2{
    public static void main(String[] args) {
		System.out.println("Pls input your word:");
        String s = readStr();
        if (isPolindrome(s))
            System.out.println(s + " is polindrom");
        else
            System.out.println(s + " is not polindrom");
    }
    private static String readStr(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    private static String reverseStr(String s){
        String s1="";
        int n=s.length();
        for(int i = n-1; i >=0; i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
    public static boolean isPolindrome(String s){
        String s1 = reverseStr(s);
        return (s.equals(s1));
    }
}