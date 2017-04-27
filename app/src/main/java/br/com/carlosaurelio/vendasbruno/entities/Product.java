package br.com.carlosaurelio.vendasbruno.entities;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Product {

    private Integer mProductID;
    private String mProductName;
    private Integer mSupplierID;
    private Integer mCategoryID;
    private String mQuantityPerUnit;
    private Double mUnitPrice;
    private Integer mUnitsInStock;
    private Integer mUnitsOnOrder;
    private Integer mReorderLevel;
    private String mDiscontinued;

    public Product() {

    }

    public Product(Integer productID, String productName, Integer supplierID, Integer categoryID, String quantityPerUnit, Double unitPrice, Integer unitsInStock, Integer unitsOnOrder, Integer reorderLevel, String discontinued) {
        mProductID = productID;
        mProductName = productName;
        mSupplierID = supplierID;
        mCategoryID = categoryID;
        mQuantityPerUnit = quantityPerUnit;
        mUnitPrice = unitPrice;
        mUnitsInStock = unitsInStock;
        mUnitsOnOrder = unitsOnOrder;
        mReorderLevel = reorderLevel;
        mDiscontinued = discontinued;
    }

    public Integer getProductID() {
        return mProductID;
    }

    public void setProductID(Integer productID) {
        this.mProductID = productID;
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        this.mProductName = productName;
    }

    public Integer getSupplierID() {
        return mSupplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.mSupplierID = supplierID;
    }

    public Integer getCategoryID() {
        return mCategoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.mCategoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return mQuantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.mQuantityPerUnit = quantityPerUnit;
    }

    public Double getUnitPrice() {
        return mUnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.mUnitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return mUnitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.mUnitsInStock = unitsInStock;
    }

    public Integer getUnitsOnOrder() {
        return mUnitsOnOrder;
    }

    public void setUnitsOnOrder(Integer unitsOnOrder) {
        this.mUnitsOnOrder = unitsOnOrder;
    }

    public Integer getReorderLevel() {
        return mReorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.mReorderLevel = reorderLevel;
    }

    public String getDiscontinued() {
        return mDiscontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.mDiscontinued = discontinued;
    }
}
