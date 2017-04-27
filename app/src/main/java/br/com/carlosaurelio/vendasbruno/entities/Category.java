package br.com.carlosaurelio.vendasbruno.entities;

import java.util.List;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Category {

    private Integer mCategoryID;
    private String mCategoryName;
    private String mDescription;
    private List<Product> mProductList;

    public Category() {

    }

    public Category(Integer categoryID, String categoryName, String description) {
        mCategoryID = categoryID;
        mCategoryName = categoryName;
        mDescription = description;
    }

    public Integer getCategoryID() {
        return mCategoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.mCategoryID = categoryID;
    }

    public String getCategoryName() {
        return mCategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.mCategoryName = categoryName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public List<Product> getProductList() {
        return mProductList;
    }

    public void setProductList(List<Product> productList) {
        mProductList = productList;
    }
}
