package Java.Basic;

import java.util.HashSet;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character c = findNonRepeatingVal(str);
        System.err.println("THe val is  " + c);
    }

    private static Character findNonRepeatingVal(String str) {
       HashSet<Character> hs = new HashSet<>();

       for(int i =0;i< str.length();++i){
        Character c = str.charAt(i);
        if(hs.contains(c))return c;
        else hs.add(c); 
       }
       return null;
    }
}
