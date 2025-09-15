package Java.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interview1 {



    public static void main(String[] args) {
    
        
        int ar[] = {2, 0, 2, 1, 1, 0};

    for(int i=0;i<ar.length-1;++i){
        for(int j=0;j<ar.length-i-1;++j){

        if(ar[j] > ar[j+1]){
            int temp = ar[j];
            ar[j] = ar[j+1];
            ar[j+1] = temp; 
        }
    
        }   
    }
    Arrays.stream(ar).forEach(System.out::println);



    String str = "aaabbbccabc";

   
    StringBuilder sb = new StringBuilder();
    Character current = str.charAt(0);
    int count = -1;
    for(Character ch : str.toCharArray()){
       if(current != ch){
        count++;
        sb.append(current.toString());
        sb.append(count);
        count =0;
        current = ch;
       }else count++;
       }
    

    System.out.println(sb.toString());



    }
    
}
