package nowcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC57 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while ((s = bf.readLine())!= null){
            int a = Integer.parseInt(s);
            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
