package do_an.do_an_java.Service;

import do_an.do_an_java.entity.ProductCategory;
import do_an.do_an_java.Repository.IProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {
    @Autowired
    private IProductCategoryRepository categoryRepository;
    public List<ProductCategory> getAllCategories() {
        return categoryRepository.findAll();
    }

    public ProductCategory getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
