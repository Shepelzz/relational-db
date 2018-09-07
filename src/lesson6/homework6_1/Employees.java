package lesson6.homework6_1;

import java.sql.Blob;
import java.util.Date;

public class Employees {
    private long EmployeeID;
    private String LastName;
    private String FirstName;
    private String Title;
    private String TitleOfCourtesy;
    private Date BirthDate;
    private Date HireDate;
    private String Address;
    private String City;
    private String Region;
    private String PostalCode;
    private String Country;
    private String HomePhone;
    private String Extension;
    private Blob Photo;
    private String Notes;
    private int ReportsTo;
    private String PhotoPath;

    public Employees(long employeeID, String lastName, String firstName) {
        EmployeeID = employeeID;
        LastName = lastName;
        FirstName = firstName;
    }

    public long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(long employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitleOfCourtesy() {
        return TitleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        TitleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String extension) {
        Extension = extension;
    }

    public Blob getPhoto() {
        return Photo;
    }

    public void setPhoto(Blob photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public int getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(int reportsTo) {
        ReportsTo = reportsTo;
    }

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String photoPath) {
        PhotoPath = photoPath;
    }
}
