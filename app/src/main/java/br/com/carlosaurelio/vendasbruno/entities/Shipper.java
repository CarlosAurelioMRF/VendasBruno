package br.com.carlosaurelio.vendasbruno.entities;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Shipper {

    private Integer mShipperID;
    private String mCompanyName;
    private String mPhone;

    public Shipper() {

    }

    public Shipper(Integer shipperID, String companyName, String phone) {
        mShipperID = shipperID;
        mCompanyName = companyName;
        mPhone = phone;
    }

    public Integer getShipperID() {
        return mShipperID;
    }

    public void setShipperID(Integer shipperID) {
        this.mShipperID = shipperID;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String companyName) {
        this.mCompanyName = companyName;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }
}
