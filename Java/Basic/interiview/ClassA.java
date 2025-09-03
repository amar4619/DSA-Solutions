import java.util.ArrayList;
import java.util.HashSet;

public class ClassA {


    public static void main(String[] args) {

        int[] ar = {1, 2, 2, 3, 4, 1, 5};
        
        HashSet<Integer> hs = new HashSet<>();
        int len = ar.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =len-1;i>=0;i-- ){
            if(hs.contains(ar[i]))continue;
            al.add(ar[i]);
        }
        al.reversed();
        al.stream().forEach(System.out::println);
    }
}
