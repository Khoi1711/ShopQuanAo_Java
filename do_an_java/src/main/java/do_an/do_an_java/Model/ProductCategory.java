package do_an.do_an_java.Model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "product_categories")
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Products> products;

    // getters and setters
}
