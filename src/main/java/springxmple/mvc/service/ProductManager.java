package springxmple.mvc.service;

import springxmple.mvc.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}