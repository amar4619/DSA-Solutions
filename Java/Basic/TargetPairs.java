package Java.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TargetPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input ");
        String ar = sc.nextLine();
        int target = 10;
        String strAr[] = ar.split(" ");
        List<Integer> ls = Arrays.stream(strAr).map(s -> Integer.parseInt(s)).toList();
        List<List<Integer>> ls1 = new ArrayList<>();
        for(Integer val : ls){
            if(ls.contains(target - val) && (ls.indexOf(val)<ls.indexOf(target-val)))ls1.add(Arrays.asList(val,target-val));
        }
        ls1.stream().forEach(x -> System.out.println("Hi "+x));
        sc.close();
        
    }

}
