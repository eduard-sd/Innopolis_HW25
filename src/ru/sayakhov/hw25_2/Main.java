package ru.sayakhov.hw25_2;

/**
 * Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
 *
 * interface Basket {
 *
 *     void addProduct(String product, int quantity);
 *
 *     void removeProduct(String product);
 *
 *     void updateProductQuantity(String product, int quantity);
 *
 *     void clear();
 *
 *     List<String> getProducts();
 *
 *     int getProductQuantity(String product);
 * }
 * */
public class Main {

    public static void main(String[] args) {
        Product bread = new Product("Bread", 10);
        Product milk = new Product("Milk",101);
        Product meet = new Product("Meet", 20);
        Product potato = new Product("Potato", 30);

        Cart cart = new Cart();

        cart.addProduct("Milk", 5);
        cart.addProduct("Cola", 5);
        cart.addProduct("Sprite", 5);
        cart.addProduct("Pepsi", 5);
        System.out.println(cart.getProductList());
        System.out.println();

        System.out.println(cart.getProducts());
        System.out.println();

        cart.clear();
        System.out.println(cart.getProducts());
        System.out.println();

        cart.addProduct("Water", 5);
        cart.addProduct("Cola", 5);
        cart.addProduct("Sprite", 5);
        cart.addProduct("Pepsi", 5);
        cart.removeProduct("Water");
        System.out.println(cart.getProductList());
        System.out.println();

        cart.addProduct("Milk", 5);
        System.out.println(cart.getProductList());
        cart.updateProductQuantity("Milk",10);
        System.out.println(cart.getProductList());
        System.out.println();

        cart.getProductQuantity("Milk");
    }
}
