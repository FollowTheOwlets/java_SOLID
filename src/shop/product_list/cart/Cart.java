package shop.product_list.cart;

import shop.product_list.ProductListAdderI;
import shop.product_list.ProductListI;
import shop.product_list.ProductListRemoverI;
import shop.product_list.products.ProductI;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cart implements ProductListI, ProductListAdderI, ProductListRemoverI {
    protected List<ProductI> list;
    protected static Cart instance;

    private Cart() {
        this.list = new LinkedList<>();
    }

    public static Cart get() {
        if (instance == null) instance = new Cart();
        return instance;
    }

    public void clear() {
        list.clear();
    }

    public ProductListAdderI add(ProductI product){
        this.list.add(product);
        return this;
    }

    public ProductListRemoverI remove(ProductI product){
        this.list.remove(product);
        return this;
    }

    public ProductListRemoverI remove(int i){
        this.list.remove(i);
        return this;
    }

    @Override
    public ProductI getProduct(int i) {
        return list.get(i);
    }

    @Override
    public Iterator<ProductI> iterator() {
        return list.iterator();
    }
    @Override
    public int getSize() {
        return list.size();
    }
}
