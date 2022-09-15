import shop.Shop;
import shop.state.State;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        while (shop.getState() != State.EXIT) {
            shop.view();
            shop.work();
        }
    }
}
