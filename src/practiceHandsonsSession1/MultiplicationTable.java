package practiceHandsonsSession1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sample input:\n");
        int n = s.nextInt();
        System.out.print("Sample Output:\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
            s.close();
        }
    }
}
