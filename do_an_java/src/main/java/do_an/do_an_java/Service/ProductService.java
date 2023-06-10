package do_an.do_an_java.Service;

import do_an.do_an_java.entity.Products;
import do_an.do_an_java.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private IProductRepository productRepository;
    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Products getProductsById(Long id){
        Optional<Products> optional = productRepository.findById(id);
        return optional.orElse(null);
    }
    public void addProducts(Products products){
        productRepository.save(products);
    }
    public void updateProducts(Products products){
        productRepository.save(products);
    }

    public Products deleteProducts(Long id){
        Products products = null;
        productRepository.deleteById(id);
        return products;
    }
}
