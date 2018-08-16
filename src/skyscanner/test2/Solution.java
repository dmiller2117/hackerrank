package skyscanner.test2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Find the lowest common manager for the employees.
     * Or the lowest common parent node of 2 nodes in a tree.
     * Thus find path from bottom up for each employee, traverse up both till the values matches.
     */
    static void OutputCommonManager(int count, Scanner in) {

        if(count == 0 || in == null){
            return;
        }

        // get the 2 employees
        String employee1 = in.nextLine();
        String employee2 = in.nextLine();

        Map<String, String> employeeMap = new HashMap<>();

        while(in.hasNextLine()){
            String line = in.nextLine();
            if(line.length() > 0){
                employeeMap.put(line.split(" ")[0], line.split(" ")[1]);
            } else {
                break;
            }

        }

    }

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputCommonManager(_count, in);
    }
}
