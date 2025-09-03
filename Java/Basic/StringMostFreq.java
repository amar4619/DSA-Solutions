package Java.Basic;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class StringMostFreq {
    // public static void main(String[] args) {

    //     String str = "banana";
    //     HashMap<Character,Integer> hm = new HashMap<>();
    //     int max = 0;
    //     for(int i = 0 ;i< str.length();i++){
    //         hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
    //         Math.max(hm.get(str.charAt(i)),max);
    //     }
       
    //     System.err.println("Hi");
    // }
        public static void main(String[] args) {

        int[] ar = {1, 2, 2, 3, 4, 1, 5};
        
        HashSet<Integer> hs = new HashSet<>();
        int len = ar.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =len-1;i>=0;i-- ){
            if(hs.contains(ar[i]))continue;
            al.add(ar[i]);
            hs.add(ar[i]);
        }
        Collections.reverse(al);
        al.stream().forEach(System.out::println);
    }

}

