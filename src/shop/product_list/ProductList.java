package shop.product_list;

import shop.product_list.products.ProductI;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductList implements ProductListI, ProductListAdderI {
    private final List<ProductI> list;
    protected static ProductList instance;


    private ProductList() {
        list = new LinkedList<>();
    }

    public static ProductList get() {
        if (instance == null) instance = new ProductList();
        return instance;
    }

    @Override
    public ProductList add(ProductI product) {
        list.add(product);
        return this;
    }

    @Override
    public ProductI getProduct(int i) {
        return list.get(i);
    }

    public Iterator<ProductI> iterator() {
        return list.iterator();
    }

    @Override
    public int getSize() {
        return list.size();
    }
}
