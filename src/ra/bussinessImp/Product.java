package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private Boolean productStatus;


    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public float caculateInterest() {
        return exportPrice - importPrice;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter producId: ");
        productId = scanner.nextInt();
        System.out.println("Enter productName: ");
        productName = scanner.next();
        System.out.println("Enter title: ");
        title = scanner.next();
        System.out.println("Enter descriptions: ");
        scanner.nextLine();
        descriptions = scanner.next();
        System.out.println("Enter importPrice: ");
        importPrice = scanner.nextFloat();
        System.out.println("Enter exportPrice: ");
        exportPrice = scanner.nextFloat();
        System.out.println("Enter productStatus: ");
        productStatus = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Title: " + title);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Interest: " + interest);
        System.out.println("Product Status: " + productStatus);
    }

    public static void main(String[] args) {
        Product products = new Product();
        products.inputData();
        products.displayData();
    }
}
