package com.google;

import java.util.Scanner;

class Product {
    private int pid;
    private int price;
    private int quantity;

    // Constructor
    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public int getPid() {
        return pid;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

     class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
          products[0] = new Product(1, 150, 6);
          products[1] = new Product(2, 110, 3);
          products[2] = new Product(3, 500, 10);
          products[3] = new Product(4, 170, 5);
          products[4] = new Product(5, 140, 7);

        // (b) Find the Pid of the product with the highest price
        Product expensiveProduct = findMostExpensiveProduct(products);
        System.out.println("Product with highest price has Pid: " + expensiveProduct.getPid());

        // (c) Calculate total amount spent on all products
        int totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }

    // Method to find most expensive product
    public static Product findMostExpensiveProduct(Product[] products) {
        Product expensiveProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > expensiveProduct.getPrice()) {
                expensiveProduct = products[i];
            }
        }
        return expensiveProduct;
    }

    // Method to calculate total amount spent on all products
    public static int calculateTotalAmount(Product[] products) {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}