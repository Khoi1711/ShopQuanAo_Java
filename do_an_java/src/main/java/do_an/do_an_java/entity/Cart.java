//package do_an.do_an_java.entity;
//
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import lombok.Data;
//
//public class Cart {
//    private int productId;
//    private String name;
//    private double price;
//    private double quantity = 1;
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public double getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(double quantity) {
//        this.quantity = quantity;
//    }
//
//    public Cart(int productId, String name, double price, double quantity) {
//        this.productId = productId;
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    public Cart() {
//    }
//}
