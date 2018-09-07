package lesson6.homework6_1;

public class Products {
    private long ProductID;
    private String ProductName;
    private Suppliers Supplier;
    private Categories category;
    private int QuantityPerUnit;
    private double UnitPrice;
    private int UnitsInStock;
    private int UnitsOnOrder;
    private int ReorderLevel;
    private int Discontinued;

    public Products(long productID, String productName) {
        ProductID = productID;
        ProductName = productName;
    }

    public long getProductID() {
        return ProductID;
    }

    public void setProductID(long productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Suppliers getSupplier() {
        return Supplier;
    }

    public void setSupplier(Suppliers supplier) {
        Supplier = supplier;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public int getQuantityPerUnit() {
        return QuantityPerUnit;
    }

    public void setQuantityPerUnit(int quantityPerUnit) {
        QuantityPerUnit = quantityPerUnit;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder() {
        return UnitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder) {
        UnitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel() {
        return ReorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        ReorderLevel = reorderLevel;
    }

    public int getDiscontinued() {
        return Discontinued;
    }

    public void setDiscontinued(int discontinued) {
        Discontinued = discontinued;
    }
}
