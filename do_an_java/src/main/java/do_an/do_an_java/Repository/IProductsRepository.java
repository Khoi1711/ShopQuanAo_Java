package do_an.do_an_java.Repository;

import do_an.do_an_java.entity.Product;
import do_an.do_an_java.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductsRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(ProductCategory category);
}
