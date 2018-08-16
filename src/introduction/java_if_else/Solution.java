package introduction.java_if_else;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    public static void main(String[] args) {

        try {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if(n <= 1 || n > 100 ){
                return;
            }

            if(n % 2 == 0){
                if(n >= 2 && n <= 5){
                    System.out.println(NOT_WEIRD);
                } else if (n >= 6 && n <= 20){
                    System.out.println(WEIRD);
                } else {
                    System.out.println(NOT_WEIRD);
                }
            } else {
                System.out.println(WEIRD);
            }
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter an integer.");
            return;
        }
        finally {
            scanner.close();
        }
    }
}