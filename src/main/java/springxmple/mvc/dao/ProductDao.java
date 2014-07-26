package springxmple.mvc.dao;

import springxmple.mvc.domain.Product;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public interface ProductDao {
    public List<Product> getProductList();
    public void saveProduct(Product prod);
}
