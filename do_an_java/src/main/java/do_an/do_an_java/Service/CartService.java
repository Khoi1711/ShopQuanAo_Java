package do_an.do_an_java.Service;

import do_an.do_an_java.entity.Cart;

import do_an.do_an_java.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartService {
    private List<Cart> cartItems = new ArrayList<>();

    public List<Cart> getCartItems() {
        return cartItems;
    }

    public void clearCart() {
        cartItems.clear();
    }

    public void addToCart(Product product) {
        Cart findCart = cartItems.stream()
                .filter(item -> item.getId().equals(product.getProductId()))
                .findFirst().orElse(null);
        if(findCart != null)
        {
            findCart.setQuantity(findCart.getQuantity()+1);
        }
        else
        {
            System.out.print("case item = null");
            findCart = new Cart();
            findCart.setQuantity(1);

            findCart.setId(product.getProductId());
            findCart.setName(product.getName());
            findCart.setImageUrl(product.getImageUrl());
            findCart.setPrice(product.getPrice());

            cartItems.add(findCart);
        }
    }
    public void updateCartItem(Integer productId, int quantity) {
        Cart findCart = cartItems.stream()
                .filter(item -> item.getId().equals(productId))
                .findFirst().orElse(null);
        if(findCart != null)
        {
            findCart.setQuantity(quantity);
        }
    }
    public void removeFromCart(Integer productId) {
        cartItems.removeIf(cartItem -> cartItem.getId().equals(productId));
    }
}

