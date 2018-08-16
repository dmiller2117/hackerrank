package introduction.java_stdin_and_stdout_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter an integer.");
            return;
        }
        finally {
            scan.close();
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}