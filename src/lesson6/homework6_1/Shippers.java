package lesson6.homework6_1;

public class Shippers {
    private long ShipperID;
    private String CompanyName;
    private String Phone;

    public Shippers(long shipperID, String companyName) {
        ShipperID = shipperID;
        CompanyName = companyName;
    }

    public long getShipperID() {
        return ShipperID;
    }

    public void setShipperID(long shipperID) {
        ShipperID = shipperID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
