package section2;

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Price of item 1:");
        float x = s.nextFloat();
        System.out.println("Price of item 2:");
        float y = s.nextFloat();
        System.out.println("Discount:");
        int z = s.nextInt();
        float total = x + y;
        int amt = 100 - z;
        float discount = (amt * total) / 100;
        float saved = total - discount;
        System.out.println("Total amount:$" + total);
        System.out.println("Discounted amount:$" + discount);
        System.out.println("Saved amount:$" + saved);
        s.close();

    }

}
