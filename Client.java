package Task_2;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Pen", 50, 2));
        cart.addProduct(new Product("book", 2000, 3));

        System.out.println("Cart contents:");
        for (Product product : cart.getItems()) {
            System.out.println("Product name: " + product.getName() + "\nProduct price: " + product.getPrice() + " x " + product.getQuantity());
        }

        PaymentStrategy paymentStrategy = new PayWithCard("1234-5678-9012-3456");
        cart.checkout(paymentStrategy);

    }
}
