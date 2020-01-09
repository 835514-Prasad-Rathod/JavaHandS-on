package section6;

import java.util.Scanner;

public class CricketCommentry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Player details of the delivery");
        System.out.println(" 2.Run details of the delivery");

        Integer delivery = s.nextInt();
        Delivery details = new Delivery();
        if (delivery == 1) {
            System.out.println("Enter the bowler name");
            s.nextLine();
            String bowler = s.nextLine();

            System.out.println("Enter the batsman name");
            String batsman = s.nextLine();

            System.out.println("Player details of the delivery:");
            details.displayDeliveryDetails(bowler, batsman);
        }

        if (delivery == 2) {
            System.out.println("Enter the number of runs");
            Long runs = s.nextLong();
            details.displayDeliveryDetails(runs);
        }
        s.close();
    }

}
