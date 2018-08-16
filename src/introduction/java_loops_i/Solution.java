package introduction.java_loops_i;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int N = scanner.nextInt();
            if(N < 2 || N > 20){
                return;
            }
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < 10; i++) {
                int count = i + 1;
                String output = N + " x " + count + " = " + (N * count);
                System.out.println(output);
            }

        } finally {
            scanner.close();
        }

    }
}
