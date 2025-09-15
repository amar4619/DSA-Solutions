package Java.Basic;

import java.util.Random;

public class RamdomValues {

    public static void main(String[] args) {
        
        Random random = new Random();
        int n = random.nextInt(10);
        System.err.println(n);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String strSmal = str.toLowerCase();
        String numbers = "1234567890";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;++i){
            int r = random.nextInt(25);
            int v = r/10;
            sb.append(strSmal.charAt(r));
            sb.append(numbers
            .charAt(v));
            sb.append(str.charAt(r));
        }

        System.err.println(sb);
    }

}
