package market.services;

import market.entities.Product;
import market.persistence.ProductDAO;

import java.util.Collection;

public class ProductService {

    private ProductDAO dao;

    public ProductService() {
        this.dao = new ProductDAO();
    }

    public void creatProduct(Product product) throws Exception {
        try {
//            if (dao.searchProductById(product.getId()) != null) {
//                throw new Exception("the product already exist");
//            }

            dao.safeProduct(product);
        } catch (Exception e) {
            throw (e);
        }
    }

    public Collection<Product> searchAllProducts() throws Exception {
        Collection<Product> products1;
        try {
//            if (dao.searchProductById(product.getId()) != null) {
//                throw new Exception("the product already exist");
//            }

            products1 = dao.searchAllProducts();
        } catch (Exception e) {
            throw (e);
        }
        return products1;
    }
}
