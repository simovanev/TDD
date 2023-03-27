import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstockTest {
    private Instock products;
    private Product product= new Product("Product", 1.1, 1);

    @Before
    public void beforeTests() {
        products = new Instock();
    }

    @Test
    public void testGetCountWhenNoProduct() {

        int count = products.getCount();

        Assert.assertEquals(0, count);

    }

    @Test
    public void testGetCountWhenProductsInStock() {

        products.add(product);

        int count = products.getCount();

        Assert.assertEquals(1, count);

    }

    @Test
    public void testAddNewProduct() {

        products.add(product);

        Assert.assertEquals(1, products.getCount());
    }
    @Test
    public void testAddingTheSameProducts(){
        for (int i = 0; i < 10; i++) {
            products.add(product);
        }
        int productCount= products.getCount();

        Assert.assertEquals(1,productCount);
    }
    @Test
    public void testAddingMultipleDifferentProducts(){
        for (int i = 0; i < 10; i++) {
            products.add(new Product("a"+i,1,1));
        }
        int productCount= products.getCount();
        Assert.assertEquals(10,productCount);
    }

    @Test
    public void testContainingAddedProduct() {
        products.add(product);

        boolean ifContains= products.contains(product);

        assertTrue(ifContains);
    }
    @Test
    public void testContainingMissingProduct(){
        assertFalse(products.contains(product));
    }
    @Test( expected = IndexOutOfBoundsException.class)
    public void testReturnTheNthProductAddedInStockWhenNoProducts(){
       Product foundProduct= products.find(0);

    }
    @Test
    public void testReturnTheNthProductAddedInStockWhenOneProducts(){
        products.add(product);
        Product foundProduct= products.find(0);
        Assert.assertEquals(product,foundProduct);
    }
}