package s2dent.app.dao;

/**
 * @author Hikamt Dhamee
 * @email me.hemant.available@gmail.com
 */
/*
public class ProductDaoImpl extends SimpleJdbcDaoSupport implements ProductDao {
    */
/** Logger for this class and subclasses *//*

    protected final Log logger = LogFactory.getLog(getClass());


    public List<Product> getProductList() {
        logger.info("Getting products!");
        List<Product> products = getSimpleJdbcTemplate().query(
                "select id, description, price from products",
                new ProductMapper());
        return products;
    }

    public void saveProduct(Product prod) {
        logger.info("Saving product: " + prod.getDescription());
        int count = getSimpleJdbcTemplate().update(
                "update products set description = :description, price = :price where id = :id",
                new MapSqlParameterSource().addValue("description", prod.getDescription())
                        .addValue("price", prod.getPrice())
                        .addValue("id", prod.getId()));
        logger.info("Rows affected: " + count);
    }

    private static class ProductMapper implements ParameterizedRowMapper<Product> {

        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product prod = new Product();
            prod.setDescription(rs.getString("description"));
            prod.setPrice(new Double(rs.getDouble("price")));
            return prod;
        }

    }


}*/
