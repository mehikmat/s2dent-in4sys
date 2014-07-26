package s2dent.app.dao;

import s2dent.app.domain.Product;

import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public interface ProductDao {
    public List<Product> getProductList();
    public void saveProduct(Product prod);
}
