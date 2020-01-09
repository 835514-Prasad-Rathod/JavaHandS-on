package section3;

import java.util.Scanner;

public class DayofWeekNew {
    private static Scanner s;

    public static void main(String[] args) {
        String a[] = new String[7];
        s = new Scanner(System.in);
        a[0] = "sun";// initialization
        a[1] = "mun";
        a[2] = "tue";
        a[3] = "wed";
        a[4] = "thr";
        a[5] = "fri";
        a[6] = "sat";
        System.out.println("Enter the day number");
        int a1 = s.nextInt();
        System.out.println("Day of the week is " + a[a1]);
    }
}
