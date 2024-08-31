package collection.map.test.cart;
import java.util.HashMap;
import java.util.Map;
public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        if (cartMap.containsKey(product)) {
            cartMap.replace(product, cartMap.get(product) + quantity);
        } else {
            cartMap.put(product, quantity);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int number) {
        if (cartMap.get(product) < number) {
            cartMap.replace(product, cartMap.get(product) - number);
        } else {
            cartMap.remove(product);
        }
    }
}