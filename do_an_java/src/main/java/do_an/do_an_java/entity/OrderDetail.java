package do_an.do_an_java.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private int orderDetailId;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Products product;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    // getters and setters
}
