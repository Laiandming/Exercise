package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC83 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine())!= null){
            int n = Integer.parseInt(s);
            if (n%5 == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}