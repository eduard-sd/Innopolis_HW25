package ru.sayakhov.hw25_2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart implements Basket {
    private Map<String, Integer> productList = new HashMap<>();

    public Map<String, Integer> getProductList() {
        return productList;
    }

    @Override
    public void addProduct(String product, int quantity) {
        productList.put(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
        productList.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        productList.put(product,quantity);
    }

    @Override
    public void clear() {
        productList.clear();
    }

    @Override
    public List<String> getProducts() {
        ArrayList<String> product = new ArrayList<>();
        for ( Map.Entry<String, Integer> enter: productList.entrySet()) {
            product.add(enter.getKey());
        }
        return product;
    }

    @Override
    public int getProductQuantity(String product) {
        return productList.get(product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
