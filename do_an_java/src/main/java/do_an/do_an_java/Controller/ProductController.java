package do_an.do_an_java.Controller;

import do_an.do_an_java.Service.CategoryService;
import do_an.do_an_java.Service.ProductService;
import do_an.do_an_java.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/shop")
    public String viewHomePage(Model model){
        /*model.addAttribute("listProduct", productService.getAllProducts());*/
        return("home/shop");
    }
    @GetMapping("/detail")
    public String detail(Model model){
        /*model.addAttribute("listProduct", productService.getAllProducts());*/
        return("home/detail");
    }
/*
    @GetMapping("/createProduct")
    public String createProduct(Model model) {
        model.addAttribute("product", new Products());
        return "create_product";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Products product, Model model){
        productService.saveProduct(product);
        return "redirect:/";
    }

    @GetMapping("/updateProduct/{id}")
    public String editProduct(@PathVariable(value = "id") long id, Model model) {
        Products product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "update_product";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable(value = "id") long id) {
        productService.deleteProductById(id);
        return "redirect:/";
    }*/
}
