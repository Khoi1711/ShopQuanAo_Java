package do_an.do_an_java.Model;

import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "name")
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private BigDecimal price;

    // getters and setters
    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory category;

    @OneToMany
    @JoinColumn(name="order_details")
    private OrderDetail orderdetail;
}