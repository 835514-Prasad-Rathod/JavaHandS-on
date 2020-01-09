
package section4;

import java.util.Scanner;

public class ProductDetailsMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the product id");
        long id = s.nextLong();
        System.out.println("Enter the product name");
        String productName = s.next();
        System.out.println("Enter thesupplier name");
        String supplierName = s.next();
        ProductDetails productDetails = new ProductDetails();
        productDetails.setid(id);
        productDetails.setProductName(productName);
        productDetails.setSupplierName(supplierName);
        System.out.println("Product Id is" + productDetails.getid());
        System.out.println("Product Name is" + productDetails.getProductName());
        System.out.println("Supplier Name is" + productDetails.getSupplierName());
        s.close();
    }
}
