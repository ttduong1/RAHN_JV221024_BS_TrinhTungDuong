package ra.run;
import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagement {

    private ArrayList<Product> products;

    public ProductManagement() {
        this.products = new ArrayList<>();
    }

    public void addProducts(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.inputData();
            this.products.add(product);
        }
    }

    public void displayProducts() {
        for (Product product : this.products) {
            product.displayData();
        }
    }

//    public void sortProductsByProfit() {
//        Collections.sort(this.products);
//    }

    public void removeProductById(int productId) {
        for (Product product : this.products) {
            if (product.getProductId() == productId) {
                this.products.remove(product);
                System.out.println("Product with ID " + productId + " has been removed.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void searchProductByName(String productName) {
        for (Product product : this.products) {
            if (product.getProductName().equals(productName)) {
                product.displayData();
                return;
            }
        }
        System.out.println("Product with name " + productName + " not found.");
    }

    public void changeProductStatusById(int productId) {
        for (Product product : this.products) {
            if (product.getProductId() == productId) {
                product.setProductStatus(!product.getProductStatus());
                System.out.println("Product status has been changed.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 7) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số sản phẩm và nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm");
            System.out.println("7. Thoát");
            System.out.println("Chọn một chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số sản phẩm: ");
                    int n = scanner.nextInt();
                    addProducts(n);
                    break;
                case 2:
                    displayProducts();
                    break;
//                case 3:
//                    sortProductsByProfit();
//                    System.out.println("Sản phẩm đã được sắp xếp theo lợi nhuận tăng dần.");
//                    break;
                case 4:
                    System.out.println("Nhập mã sản phẩm cần xóa: ");
                    int productId = scanner.nextInt();
                    removeProductById(productId);
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String productName = scanner.next();
                    searchProductByName(productName);
                    break;
            }
            System.out.println();
            break;
        }
        while (choice != 7);
    }
}