package shop.product_list;

import shop.product_list.products.ProductI;

import java.util.Iterator;

public interface ProductListI extends Iterable<ProductI> {
    ProductI getProduct(int i);

    Iterator<ProductI> iterator();

    int getSize();
}
