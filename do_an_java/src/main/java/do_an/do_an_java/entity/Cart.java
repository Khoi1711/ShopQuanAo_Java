package do_an.do_an_java.entity;
import lombok.Data;

@Data
public class Cart {
    private Integer id;
    private String imageUrl;
    private String name;
    private long price;
    private int quantity;
}

