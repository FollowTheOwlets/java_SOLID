package shop.viewer;

import shop.product_list.ProductList;
import shop.product_list.ProductListI;
import shop.product_list.cart.Cart;
import shop.product_list.products.ProductI;
import shop.state.State;

public class Viewer {

    public static void view(State state) {
        switch (state) {
            case MAIN:
                showMainMenu();
                break;
            case SHOP:
                showShopMenu();
                showList(ProductList.get());
                break;
            case CART:
                showCartMenu();
                showList(Cart.get());
                break;
        }
    }

    public static void view(State state, String word) {
        switch (state) {
            case SHOP:
                showShopMenu();
                showList(ProductList.get(), word);
                break;
            case CART:
                showCartMenu();
                showList(Cart.get(), word);
                break;
        }
    }

    public static void showList(ProductListI list) {

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println((i + 1) + ".  " + list.getProduct(i));
        }
    }

    public static void showList(ProductListI list, String word) {
        for (int i = 0; i < list.getSize(); i++) {
            if (list.getProduct(i).getName().contains(word)) {
                System.out.println((i + 1) + ".  " + list.getProduct(i));
            }
        }
    }

    public static void showMainMenu() {
        System.out.println(
                "1. Список товаров" + "\n" +
                        "2. Перейти в корзину" + "\n" +
                        "3. Выйти из магазина" + "\n"
        );
    }

    public static void showShopMenu() {
        System.out.println(
                "1. Добавить (Изменить) фильтр (очистить '-')" + "\n" +
                        "2. Добавить товар по номеру" + "\n" +
                        "3. Выйти из списка товаров" + "\n"
        );
    }

    public static void showCartMenu() {
        System.out.println(
                "1. Сделать заказ" + "\n" +
                        "2. Удалить товар по номеру" + "\n" +
                        "3. Выйти из корзины" + "\n"
        );
    }
}
