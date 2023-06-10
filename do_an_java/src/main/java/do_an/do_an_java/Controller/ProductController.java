package do_an.do_an_java.Controller;

import do_an.do_an_java.Service.CategoryService;
import do_an.do_an_java.Service.ProductService;
import do_an.do_an_java.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllBooks(Model model) {
        List<Products> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product/list";
    }
    @GetMapping("/add")
    public String addProductsForm(Model model){
        model.addAttribute("product", new Products());
        model.addAttribute("categories",categoryService.getAllCategories());
        return "product/add";
    }
    @PostMapping("/add")
    public String addProducts(@ModelAttribute("book") Products products){
        productService.addProducts(products);
        return "redirect:/products";
    }

    @GetMapping("/editProduct/{id}")
    public String editProduct(@PathVariable(value = "id") long id, Model model) {
        Products products = productService.getProductsById(id);
        model.addAttribute("product", products);
        model.addAttribute("categories",categoryService.getAllCategories());
        return "/product/edit";
    }

    @PostMapping("/edit-save")
    public String editProducts(@ModelAttribute("book") Products updateProducts) {
        productService.updateProducts(updateProducts);
        return "redirect:/products";
    }
    //
    //Delete Book
    @GetMapping("/deleteBook/{id}")
    public String deleteProduct(@PathVariable(value = "id") long id) {
        productService.deleteProducts(id);
        return "redirect:/";
    }
}
