package springxmple.mvc.service;

import springxmple.mvc.domain.Product;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public class SimpleProductManager implements ProductManager {

    List<Product> products;
    public List<Product> getProducts() {
        return  products;
    }

    public void increasePrice(int percentage) {
        throw new UnsupportedOperationException();
    }

    public void setProducts(List<Product> products) {
    this.products=products;
    }

}