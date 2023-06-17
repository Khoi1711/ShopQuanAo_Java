package do_an.do_an_java.Service;

import do_an.do_an_java.entity.Cart;

import java.util.Collection;

public interface CartService {
    void add(Cart newItem);

    void remove(int id);
    Cart update(int productId, int quantity);
    void clear();
    double getAmount();

    int getCount();
    Collection<Cart> getAllItems();
}
