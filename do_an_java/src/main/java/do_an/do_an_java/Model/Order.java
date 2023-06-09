package do_an.do_an_java.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "email")
    private String email;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "delivery_date")
    private Timestamp deliveryDate;

    @Column(name = "delivery_status")
    private String deliveryStatus;

    @Column(name = "paid")
    private boolean paid;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @ManyToMany
    @JoinColumn
    private OrderDetail orderDetail;

    // getters and setters
}