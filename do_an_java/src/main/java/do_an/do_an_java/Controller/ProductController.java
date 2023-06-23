package do_an.do_an_java.Controller;

import do_an.do_an_java.Service.ProductCategoryService;
import do_an.do_an_java.Service.ProductService;
import do_an.do_an_java.entity.Product;
import do_an.do_an_java.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryService categoryService;

    @GetMapping("/category/{categoryId}/products")
    public String showProductsByCategory(@PathVariable int categoryId, Model model) {
        List<ProductCategory> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        ProductCategory category = categoryService.getCategoryById(categoryId);
        List<Product> products = productService.getProductsByCategory(category);
        model.addAttribute("products", products);
        /*model.addAttribute("selectedCategoryId", categoryId);*/
        model.addAttribute("ProductCategory", category);
        return "home/products";
    }
}
