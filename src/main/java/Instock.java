import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instock implements ProductStock {
    private List<Product> inStockProducts;

    public Instock() {
        this.inStockProducts = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return this.inStockProducts.size();
    }

    @Override
    public boolean contains(Product product) {
        for (Product inStockProduct : inStockProducts) {
            return inStockProduct.equals(product);
        }
        return false;
    }

    @Override
    public void add(Product product) {
        if (!inStockProducts.contains(product)) {
            this.inStockProducts.add(product);
        }
    }

    @Override
    public void changeQuantity(String product, int quantity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Product find(int index) {
        
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Product findByLabel(String label) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Product> findAllInRange(double lo, double hi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Product> findAllByPrice(double price) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Product> findFirstMostExpensiveProducts(int count) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Product> findAllByQuantity(int quantity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Product> iterator() {
        throw new UnsupportedOperationException();
    }

}
