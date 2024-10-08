package Book3.chapter4;
//use a throw statement to throw a custom exception
//his throw statement in the midst of a catch clause that catches some
//other, more generic exception


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main class for product data handling
public class ProductDDB {

    // Method to get a product by code
    public static Product getProduct(String code) throws ProductDataException {
        try {
            Product p;
            // Simulating file reading logic that might throw IOException
            p = readProductFromFile(code);
            return p; // Return the retrieved product
        } catch (IOException e) {
            throw new ProductDataException("An IO error occurred: " + e.getMessage());
        } catch (Exception e) { // Catching a more generic exception
            throw new ProductDataException("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to simulate reading a product from a file
    private static Product readProductFromFile(String code) throws IOException {
        // Simulated file reading logic
        try (BufferedReader br = new BufferedReader(new FileReader("products.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assume the line is formatted as "code,name,price"
                String[] parts = line.split(",");
                if (parts[0].equals(code)) {
                    // Assuming the Product constructor takes code, name, and price
                    return new Product(parts[0], parts[1], Double.parseDouble(parts[2]));
                }
            }
        }
        // If product not found, you might throw an exception or return null
        throw new IOException("Product code not found in the file.");
    }

    // Main method to test getProduct
    public static void main(String[] args) {
        String productCode = "exampleCode"; // Replace with the actual product code
        try {
            Product p = getProduct(productCode);
            // Use the retrieved product (e.g., display its details)
            System.out.println("Product retrieved: " + p);
        } catch (ProductDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Custom exception class for product data errors
class ProductDataException extends Exception {
    public ProductDataException(String message) {
        super(message);
    }
}

// Product class definition
class Product {
    private String code;
    private String name;
    private double price;

    // Constructor
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // Override toString() for better output
    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
