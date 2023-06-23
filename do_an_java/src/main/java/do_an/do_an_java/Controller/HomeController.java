package do_an.do_an_java.Controller;

import do_an.do_an_java.Service.ProductCategoryService;
import do_an.do_an_java.Service.ProductService;
import do_an.do_an_java.entity.Product;
import do_an.do_an_java.entity.ProductCategory;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductCategoryService categoryService;

    @Autowired
    private ProductService productService;

    @SneakyThrows
    @GetMapping
    public String home( Model model){
        List<ProductCategory> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "home/index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "home/contact";
    }


}
