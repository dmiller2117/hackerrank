package challenges;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime formatTime = LocalTime.parse(s, formatter);
        String result = formatTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
