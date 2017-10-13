package alex.trainingJava.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Farewell {

    public static void main(String args[]) {
        List< String > attendanceList = new ArrayList< String >();
        Scanner input = new Scanner(System. in );

        String address = "Match Point – Rua Chile 1578";
        String date =        "20-Out-2017";
        String time =        "18:00";

        String question = "Will I attend Wesley's farewell happy hour at: " +
                "\r\nAddress: " + address +
                "\r\nDate: " + date +
                "\r\nTime: " + time;

        System.out.println(String.format("%s\r\n\r\nTRUE\r\nFALSE", question, address, date, time));

        if (Boolean.parseBoolean(input.nextLine())) {
            System.out.println("Input your name fellow");
            String name = input.nextLine();
            attendanceList.add(name);
            System.out.println(String.format("See you there %s", name));
        } else {
            System.out.println("Shame, Shame, Shame!");
        }

        System.exit(0);
    }
}
