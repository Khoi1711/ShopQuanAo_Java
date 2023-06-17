package do_an.do_an_java.Controller;

import do_an.do_an_java.Service.CartService;
import do_an.do_an_java.Service.ProductService;
import do_an.do_an_java.entity.Cart;
import do_an.do_an_java.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
@RequestMapping("/")
public class CartController {
    @Autowired
    ProductService productService;
    @Autowired
    CartService cartService;
    @GetMapping("/cart")
    public String viewCart(Model model){
        model.addAttribute("all_items_in_cart",cartService.getAllItems());
        model.addAttribute("total_amount",cartService.getAmount());
        return "cart/cart";
    }
    @GetMapping("/checkout")
    public String checkout(Model model){
        return "cart/checkout";
    }
/*
    @GetMapping("add/{id}")
    public String addItem(@PathVariable("id") Integer id){
        Products product = productService.getProductById(id);


        BigDecimal price = product.getPrice();
        
        BigDecimal bigDecimalValue = new BigDecimal("price");
         
        double productPrice = bigDecimalValue.doubleValue();
*//*        double productPrice = product.getPrice();*//*
        if(product != null){
            Cart item = new Cart();
            item.setProductId(product.getProductId());
            item.setName(product.getName());
            item.setPrice(productPrice);
            item.setQuantity(1);
            //  product.setQuantity(product.getQuantity() - 1);
            cartService.add(item);
        }
        return "redirect:/cart/view";
    }

    @GetMapping("clear")
    public String clearCart(){
        cartService.clear();
        return "redirect:/cart/view";
    }

    @GetMapping("remove/{id}")
    public String removeItem(@PathVariable("id") Integer id){
        cartService.remove(id);
        return "redirect:/cart/view";
    }

    @PostMapping("update")
    public String updateItem(@RequestParam("ProductId") Integer ProductId,
                             @RequestParam("quantity") Integer quantity){
        cartService.update(ProductId,quantity);
        return "redirect:/cart/view";
    }*/
}
