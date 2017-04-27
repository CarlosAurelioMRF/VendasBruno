package br.com.carlosaurelio.vendasbruno.entities;

import java.util.Date;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Order {

    private Integer mOrderID;
    private Integer mCustomerID;
    private Integer mEmployeeID;
    private Date mOrderDate;
    private Date mRequiredDate;
    private Date mShippedDate;
    private Integer mShipVia;
    private Double mFreight;
    private String mShipName;
    private String mShipAddress;
    private String mShipCity;
    private String mShipRegion;
    private String mShipPostalCode;
    private String mShipCountry;

    public Integer getOrderID() {
        return mOrderID;
    }

    public void setOrderID(Integer orderID) {
        this.mOrderID = orderID;
    }

    public Integer getCustomerID() {
        return mCustomerID;
    }

    public void setCustomerID(Integer customerID) {
        this.mCustomerID = customerID;
    }

    public Integer getEmployeeID() {
        return mEmployeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.mEmployeeID = employeeID;
    }

    public Date getOrderDate() {
        return mOrderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.mOrderDate = orderDate;
    }

    public Date getRequiredDate() {
        return mRequiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.mRequiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return mShippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.mShippedDate = shippedDate;
    }

    public int getShipVia() {
        return mShipVia;
    }

    public void setShipVia(int shipVia) {
        this.mShipVia = shipVia;
    }

    public Double getFreight() {
        return mFreight;
    }

    public void setFreight(Double freight) {
        this.mFreight = freight;
    }

    public String getShipName() {
        return mShipName;
    }

    public void setShipName(String shipName) {
        this.mShipName = shipName;
    }

    public String getShipAddress() {
        return mShipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.mShipAddress = shipAddress;
    }

    public String getShipCity() {
        return mShipCity;
    }

    public void setShipCity(String shipCity) {
        this.mShipCity = shipCity;
    }

    public String getShipRegion() {
        return mShipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.mShipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return mShipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.mShipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return mShipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.mShipCountry = shipCountry;
    }
}
