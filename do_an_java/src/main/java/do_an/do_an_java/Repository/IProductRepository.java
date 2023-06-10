package do_an.do_an_java.Repository;

import do_an.do_an_java.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository  extends JpaRepository<Products,Long> {
}
