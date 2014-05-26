package tmethoddemo4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TMethodDemo4 {
    public static void main(String[] args) throws IOException {
        String str;
        int A[][] = new int[2][4];
        int B[][] = new int[2][4];
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        B = aMethod(A);
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=3; j++) {
                System.out.print("Input Number : ");
                str = buf.readLine();
                A[i][j] = Integer.parseInt(str);
            }
        }
        for (int i = 0; i < B.length; i++) 
            for (int j = 0; j < B[i].length; j++) 
                System.out.print(B[i][j] + " , "); 
        System.out.println(" ");
    }
    public static int[][] aMethod(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) 
                A[i][j] += 10;
        }
        return A;
    }
}













