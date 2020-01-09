package section4;

public class ProductConstructor {
    private Long id;
    private String productName;
    private String supplierName;

    public ProductConstructor() {

    }

    public ProductConstructor(Long id, String productName, String supplierName) {

        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public Long getid() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    void display(long id, String productName, String supplierName) {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);

    }

}
