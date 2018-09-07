package lesson6.homework6_1;

public class OrderDetails {
    private long OrderID;
    private Products product;
    private double UnitPrice = 0;
    private int Quantity = 0;
    private double Discount = 0;

    public OrderDetails(long orderID, Products product) {
        OrderID = orderID;
        this.product = product;
    }

    public long getOrderID() {
        return OrderID;
    }

    public void setOrderID(long orderID) {
        OrderID = orderID;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }
}
