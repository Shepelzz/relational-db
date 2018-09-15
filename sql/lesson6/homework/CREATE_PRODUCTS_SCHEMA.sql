--DROP TABLE Suppliers;
--DROP TABLE Categories;
--DROP TABLE Products;
--DROP TABLE Employees;
--DROP TABLE Customers;
--DROP TABLE Shippers;
--DROP TABLE Orders;
--DROP TABLE Order_Details;


CREATE TABLE Suppliers(
	SupplierID NUMBER,
    CONSTRAINT Suppliers_PK PRIMARY KEY(SupplierID),
	CompanyName NVARCHAR2(50) NOT NULL,
	ContactName NVARCHAR2(50),
	ContactTitle NVARCHAR2(50),
	Address NVARCHAR2(100),
	City NVARCHAR2(50),
	Region NVARCHAR2(50),
	PostalCode NVARCHAR2(10),
	Country NVARCHAR2(50),
	Phone NVARCHAR2(20),
	Fax NVARCHAR2(20),
	HomePage CLOB
);

CREATE TABLE Categories(
	CategoryID NUMBER,
        CONSTRAINT Categories_PK PRIMARY KEY(CategoryID),
	CategoryName NVARCHAR2(50) NOT NULL,
	Description CLOB,
	Picture BLOB
);

CREATE TABLE Products(
	ProductID NUMBER,
        CONSTRAINT Products_PK PRIMARY KEY(ProductID),
	ProductName NVARCHAR2(50) NOT NULL,
	SupplierID NUMBER,
        CONSTRAINT Suppliers_FK FOREIGN KEY(SupplierID) REFERENCES Suppliers(SupplierID),
	CategoryID NUMBER,
        CONSTRAINT Categories_FK FOREIGN KEY(CategoryID) REFERENCES Categories(CategoryID),
	QuantityPerUnit NVARCHAR2(50),
	UnitPrice FLOAT,
	UnitsInStock NUMBER,
	UnitsOnOrder NUMBER,
	ReorderLevel NUMBER,
	Discontinued NUMBER
);

CREATE TABLE Employees(
	EmployeeID NUMBER,
        CONSTRAINT Employees_PK PRIMARY KEY(EmployeeID),
	LastName NVARCHAR2(50) NOT NULL,
	FirstName NVARCHAR2(50) NOT NULL,
	Title NVARCHAR2(50),
	TitleOfCourtesy NVARCHAR2(50),
	BirthDate TIMESTAMP,
	HireDate TIMESTAMP,
	Address NVARCHAR2(100),
	City NVARCHAR2(50),
	Region NVARCHAR2(20),
	PostalCode NVARCHAR2(10),
	Country NVARCHAR2(50),
	HomePhone NVARCHAR2(20),
	Extension NVARCHAR2(50),
	Photo BLOB,
	Notes CLOB,
	ReportsTo NUMBER,
	PhotoPath NVARCHAR2(200)
);

CREATE TABLE Customers(
	CustomerID NUMBER,
        CONSTRAINT Customers_PK PRIMARY KEY(CustomerID),
	CompanyName NVARCHAR2(50) NOT NULL,
	ContactName NVARCHAR2(50),
	ContactTitle NVARCHAR2(50),
	Address NVARCHAR2(100),
	City NVARCHAR2(50),
	Region NVARCHAR2(50),
	PostalCode NVARCHAR2(10),
	Country NVARCHAR2(50),
	Phone NVARCHAR2(20),
	Fax NVARCHAR2(20)
);

CREATE TABLE Shippers(
	ShipperID NUMBER,
        CONSTRAINT Shippers_PK PRIMARY KEY(ShipperID),
	CompanyName NVARCHAR2(50) NOT NULL,
	Phone NVARCHAR2(20)
);

CREATE TABLE Orders(
	OrderID NUMBER,
        CONSTRAINT Orders_PK PRIMARY KEY(OrderID),
	CustomerID NUMBER,
        CONSTRAINT Customers_FK FOREIGN KEY(CustomerID) REFERENCES Customers(CustomerID),
	EmployeeID NUMBER,
        CONSTRAINT Employees_FK FOREIGN KEY(EmployeeID) REFERENCES Employees(EmployeeID),
	OrderDate TIMESTAMP,
	RequiredDate TIMESTAMP,
	ShippedDate TIMESTAMP,
	ShipVia NUMBER,
        CONSTRAINT Shippers_FK FOREIGN KEY(ShipVia) REFERENCES Shippers(ShipperID),
	Freight FLOAT,
	ShipName NVARCHAR2(50),
	ShipAddress NVARCHAR2(50),
	ShipCity NVARCHAR2(50),
	ShipRegion NVARCHAR2(50),
	ShipPostalCode NVARCHAR2(10),
	ShipCountry NVARCHAR2(50)
);

CREATE TABLE Order_Details(
	OrderID NUMBER NOT NULL,
        CONSTRAINT Orders_FK FOREIGN KEY(OrderID) REFERENCES Orders(OrderID),
	ProductID NUMBER NOT NULL,
        CONSTRAINT Products_FK FOREIGN KEY(ProductID) REFERENCES Products(ProductID),
	UnitPrice FLOAT DEFAULT(0),
	Quantity NUMBER DEFAULT (0),
	Discount FLOAT DEFAULT (0)
);
