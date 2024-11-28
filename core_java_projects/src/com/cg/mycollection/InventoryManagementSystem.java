package com.cg.mycollection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Product class
class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public void restock(int quantity) {
        this.stock += quantity;
    }
}

// Order class
class Order {
    private String customerName;
    private String productName;
    private int quantity;
    private String status;

    public Order(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.status = "Pending";
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// InventoryManager class
class InventoryManager {
    private Map<String, Product> inventory;
    private List<Order> orders;

    public InventoryManager() {
        inventory = new HashMap<>();
        orders = new ArrayList<>();
    }

    public void addProduct(String name, int stock) {
        inventory.put(name, new Product(name, stock));
    }
    
    
    public void placeOrder(String customerName, String productName, int quantity) {
        Product product = inventory.get(productName);
        if (product != null && product.getStock() >= quantity) {
            product.reduceStock(quantity);
            Order order = new Order(customerName, productName, quantity);
            orders.add(order);
            order.setStatus("Confirmed");
            notifyCustomer(order);
        } else {
            System.out.println("Order cannot be placed. Insufficient stock or product not found.");
        }
        // Display current inventory after each order
        displayInventory();
    }

    

    public void notifyCustomer(Order order) {
        System.out.println("Notification to " + order.getCustomerName() + ": Your order for " +
                order.getQuantity() + " " + order.getProductName() + " has been " + order.getStatus() + ".");
    }

    public void restockProduct(String productName, int quantity) {
        Product product = inventory.get(productName);
        if (product != null) {
            product.restock(quantity);
            System.out.println("Restocked " + quantity + " units of " + productName);
        } else {
            System.out.println("Product not found.");
        }
    }
    

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : inventory.values()) {
            System.out.println("Product: " + product.getName() + ", Stock: " + product.getStock());
        }
    }
}

// Main class
public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        // Add products
        manager.addProduct("Laptop", 50);
        manager.addProduct("Smartphone", 100);
        manager.addProduct("Headphones", 200);

        // Display inventory
        manager.displayInventory();

        // Place some orders
        manager.placeOrder("Alice", "Laptop", 2);
        manager.placeOrder("Bob", "Smartphone", 5);
        manager.placeOrder("Charlie", "Tablet", 1); // Should fail

        // Display inventory after orders
        manager.displayInventory();
        while (true) {
            System.out.print("Enter customer name (or type 'exit' to quit): ");
            String customerName = scanner.nextLine();
            if (customerName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            // Place the order
            manager.placeOrder(customerName, productName, quantity);
        }
        // Restock a product
        manager.restockProduct("Laptop", 20);
        manager.displayInventory();
    }
}

