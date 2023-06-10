package do_an.do_an_java.Service;

import do_an.do_an_java.entity.ProductCategory;
import do_an.do_an_java.Repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<ProductCategory> getAllCategories(){return categoryRepository.findAll();}

    public ProductCategory getCategoryId(Long id){
        Optional<ProductCategory> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else {
            throw new RuntimeException("Category not found");
        }
    }
    public ProductCategory saveCategory(ProductCategory category){
        return  categoryRepository.save(category);
    }


    public  void  deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }
}
