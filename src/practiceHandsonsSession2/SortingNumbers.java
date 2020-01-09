package practiceHandsonsSession2;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int i, j, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();
        int a[] = new int[n];

        System.out.println("Enter " + n + " numbers: ");

        for (i = 0; i < n; i++)
            a[i] = s.nextInt();

        for (i = 0; i < (n - 1); i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("The Sorted list of numbers is:");

        for (i = 0; i < n; i++)
            System.out.println(a[i]);
        s.close();

    }

}
