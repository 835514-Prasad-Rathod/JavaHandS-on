package section2;

import java.util.Scanner;

public class Integers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = s.nextInt();
        System.out.println("Enter the second number:");
        int y = s.nextInt();

        if (x < y) {
            System.out.println(+x + " is less than " + y);
        }

        if (x > y) {
            System.out.println(+x + " is greater than " + y);
        }

        if (x == y) {
            System.out.println(+x + " is equal to " + y);
        }
        s.close();

        // TODO Auto-generated method stub

    }

}
