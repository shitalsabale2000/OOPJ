
class Product implements Discountable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public void applyDiscount(double percentage) {
        System.out.println("Applying " + (int)percentage + "% discount to " + name);
        price = price - (price * percentage / 100);
    }
}


interface Discountable {
    void applyDiscount(double percentage);
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}


class Cart extends CartItem {
    private java.util.List<Product> products = new java.util.ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}


public class ShoppingCartDemoQ28 {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        p1.applyDiscount(10); 

        System.out.println("Total Cart Price = " + (int)cart.calculateTotalPrice()); 
    }
}
