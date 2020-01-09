package section4;

import java.util.Scanner;

public class ProductConstructorsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        long id = s.nextLong();
        System.out.println("Enter the product name");
        String productName = s.next();
        System.out.println("Enter the supplier name");
        String supplierName = s.next();
        ProductConstructor productPrint = new ProductConstructor();
        productPrint.display(id, productName, supplierName);
        s.close();
        // TODO Auto-generated method stub

    }

}
