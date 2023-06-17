package do_an.do_an_java.Service;

import do_an.do_an_java.entity.Cart;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
@Transactional
public class CartServiceImp implements CartService {

    Map<Integer, Cart> shoppingCart = new HashMap<>();

    @Override
    public void add( Cart newItem){
        Cart cartItem = shoppingCart.get(newItem.getProductId());
        if (cartItem == null) {
            shoppingCart.put(newItem.getProductId(), newItem);
        } else {
            cartItem.setQuantity(cartItem.getQuantity()+1);
        }
    }

    @Override
    public void remove(int id){
        shoppingCart.remove(id);
    }

    @Override
    public Cart update(int productId, int quantity){
        Cart cartItem = shoppingCart.get(productId);
        cartItem.setQuantity(quantity);
        return cartItem;
    }

    @Override
    public void clear(){
        shoppingCart.clear();
    }

    @Override
    public double getAmount(){
        return shoppingCart.values().stream()
                .mapToDouble(item -> item.getQuantity() * item.getPrice())
                .sum();
    }

    @Override
    public int getCount(){
        return shoppingCart.values().size();
    }

    @Override
    public Collection<Cart> getAllItems(){
        return shoppingCart.values();
    }

}
