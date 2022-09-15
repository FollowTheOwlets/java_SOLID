package shop;

import shop.console_manager.ConsoleManager;
import shop.product_list.cart.Cart;
import shop.product_list.ProductList;
import shop.product_list.products.Product;
import shop.state.State;
import shop.viewer.Viewer;

public class Shop {
    private State state;
    private Cart cart;
    private ProductList productList;
    private String filter;

    public Shop() {
        this.productList = ProductList.get()
                .add(new Product("Телевизор", 30_000))
                .add(new Product("Телефон", 10_000))
                .add(new Product("Пылесос", 5_000))
                .add(new Product("Мультиварка", 2_500))
                .add(new Product("Соковыжималка", 1_000))
                .add(new Product("Соковарка", 2_300))
                .add(new Product("Тостер", 1_800));

        this.cart = Cart.get();
        state = State.MAIN;
        filter = "";
    }

    public void view() {
        if (filter.equals("")) {
            Viewer.view(state);
        } else {
            Viewer.view(state, filter);
        }
    }

    public void work() {
        int answer = ConsoleManager.readPoint();
        if (answer == 1 && state == State.MAIN) {
            state = State.SHOP;
        } else if (answer == 2 && state == State.MAIN) {
            state = State.CART;
        } else if (answer == 3 && state == State.MAIN) {
            state = State.EXIT;
        } else if (answer == 1 && state == State.SHOP) {
            filter = ConsoleManager.readString();
            state = State.SHOP;
        } else if (answer == 2 && state == State.SHOP) {
            int numProduct = ConsoleManager.readProduct();
            Cart.get().add(ProductList.get().getProduct(numProduct));
            state = State.SHOP;
        } else if (answer == 3 && state == State.SHOP) {
            filter = "";
            state = State.MAIN;
        }else if (answer == 1 && state == State.CART) {
            Cart.get().clear();
            ConsoleManager.orderCart();
            state = State.MAIN;
        } else if (answer == 2 && state == State.CART) {
            int numProduct = ConsoleManager.deleteProduct();
            Cart.get().remove(numProduct);
            state = State.CART;
        } else if (answer == 3 && state == State.CART) {
            filter = "";
            state = State.MAIN;
        }
    }

    public State getState() {
        return state;
    }

}
