package do_an.do_an_java.Service;


import do_an.do_an_java.entity.Products;
import java.util.List;

public interface ProductService {
    List<Products> getAllProducts();
    void saveProduct(Products product);
    Products getProductById(long id);
    void deleteProductById(long id);
}
