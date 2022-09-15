package shop.product_list.products;

public class Product implements ProductI {
    protected final String name;
    protected final int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "   Цена: " + this.price + " руб.";
    }
}
