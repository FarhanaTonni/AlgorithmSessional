
package javaapplication2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LCS2 {

     public static void main(String[] args) throws IOException{
       BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String x = in.readLine();
        String y = in.readLine();
        int M = x.length();
        int N = y.length();

   
      int c[][] = new int[M+1][N+1];

        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                   c[i][j] = c[i+1][j+1] + 1;
            }
        }
        int i = 0, j = 0;
        while(i < M && j < N) {
            if (x.charAt(i) == y.charAt(j)) {
                System.out.print(x.charAt(i));
                i++;
                j++;
            }
            else if (c[i+1][j] >= c[i][j+1]) i++;
            else     j++;
        }
        System.out.println();

    }

}
