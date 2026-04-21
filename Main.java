import com.ecommerce.*;
import com.ecommerce.orders.Order;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Product p1 = new Product(1, "Laptop", 1200);
            Product p2 = new Product(2, "Phone", 800);

            System.out.println("Available Products:");
            System.out.println(p1);
            System.out.println(p2);

            Customer customer = new Customer(101, "Nihal XYZ");

            customer.addToCart(p1);
            customer.addToCart(p2);

            customer.displayCart();

            Order order = new Order(5001, customer, new ArrayList<>(customer.getCart()));
            order.displayOrder();

            order.updateStatus("Shipped");

            System.out.println("\nAfter Update:");
            order.displayOrder();

        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}
