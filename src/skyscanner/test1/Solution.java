package skyscanner.test1;

import javax.sql.rowset.spi.SyncResolver;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */

    static void OutputMostPopularDestination(int count, Scanner in) {

        if(count == 0 || in == null){
            return;
        }

        Map<String, Integer> destinationMap = new HashMap<>();

        // Use the hashmap to contain the destinations and values.
        for (int i = 0; i < count; i++) {
            String destination = in.nextLine();
            Integer destCount = destinationMap.get(destination);
            if(destCount == null){
                destinationMap.put(destination, 1);
            } else {
                destinationMap.put(destination, destCount + 1);
            }
        }

        Map.Entry<String, Integer> maxPair = null;

        // Determine what value in the hashmap is the largest, output the key.
        for (Map.Entry<String, Integer> pair : destinationMap.entrySet()) {
            if(maxPair == null || pair.getValue().compareTo(maxPair.getValue()) > 0 ){
                maxPair = pair;
            }
        }

        System.out.println(maxPair.getKey());

    }

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputMostPopularDestination(_count, in);
    }
}
