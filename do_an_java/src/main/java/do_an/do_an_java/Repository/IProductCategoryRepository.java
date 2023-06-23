package do_an.do_an_java.Repository;

import do_an.do_an_java.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    }
