package do_an.do_an_java.Service;


import do_an.do_an_java.entity.Product;
import do_an.do_an_java.entity.ProductCategory;
import do_an.do_an_java.Repository.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductsRepository productsRepository;

    public List<Product> getAllProducts() {
        return productsRepository.findAll();
    }

    public List<Product> getProductsByCategory(ProductCategory category) {
        return productsRepository.findByCategory(category);
    }
    public Product get(int id) {
        return  productsRepository.findById(id).stream().findFirst().orElse(null);
    }

}

