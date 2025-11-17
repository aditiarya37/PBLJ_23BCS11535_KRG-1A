public class ShoppingApplication {
    public static void main(String[] args) {

        Product p1 = new Electronics("Laptop", 75000, 2);
        Product p2 = new Clothing("T-Shirt", 799, "L");

        // Polymorphism: calls the overridden method depending on object type
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to be overridden
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    int warrantyYears;

    Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Item");
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing Item");
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
    }
}
