package do_an.do_an_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Data
@Table(name = "products")
@Getter
@Setter
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;


    @Column(name = "name")
    @NotBlank(message = "Name is required !")
    @Size(min = 6, message = "Username must be more then 6 characters !")
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "description")
    @NotBlank(message = "Description is required !")
    @Size(max = 255, message = "Username must be less then 255 characters !")
    private String description;

    @Column(name = "quantity")
    @NotBlank(message = "Quantity is required !")
    @Positive(message = "Quantity must be greater than 0")
    private int quantity;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory category;
//
//    @OneToMany
//    @JoinColumn(name="order_details")
//    private OrderDetail orderdetail;
}