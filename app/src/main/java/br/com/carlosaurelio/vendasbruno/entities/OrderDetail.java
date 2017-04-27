package br.com.carlosaurelio.vendasbruno.entities;

import java.util.Currency;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class OrderDetail {

    private Integer mOrderID;
    private Integer mProductID;
    private Currency mUnitPrice;
    private Integer mQuantity;
    private Double mDiscount;

    public Integer getOrderID() {
        return mOrderID;
    }

    public void setOrderID(Integer orderID) {
        this.mOrderID = orderID;
    }

    public Integer getProductID() {
        return mProductID;
    }

    public void setProductID(Integer productID) {
        this.mProductID = productID;
    }

    public Currency getUnitPrice() {
        return mUnitPrice;
    }

    public void setUnitPrice(Currency unitPrice) {
        this.mUnitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return mQuantity;
    }

    public void setQuantity(Integer quantity) {
        this.mQuantity = quantity;
    }

    public Double getDiscount() {
        return mDiscount;
    }

    public void setDiscount(Double discount) {
        this.mDiscount = discount;
    }
}
