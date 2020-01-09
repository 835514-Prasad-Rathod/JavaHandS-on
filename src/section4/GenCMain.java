package section4;

import java.util.Scanner;

public class GenCMain {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of GenCs ");
        int n = s.nextInt();
        Trainee t[] = new Trainee[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Trainee();
            System.out.println("Enter Employee Id");
            int empId = s.nextInt();
            s.nextLine();
            t[i].setEmployeeId(empId);
            System.out.println("Enter name");
            String name = s.nextLine();
            t[i].setName(name);

        }
        Trainee tr = new Trainee();
        tr.display(t);
        s.close();

    }

}
