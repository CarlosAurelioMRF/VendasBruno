package br.com.carlosaurelio.vendasbruno.entities;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Customer {

    private String mCustomerID;
    private String mCompanyName;
    private String mContactName;
    private String mContactTitle;
    private String mAddressa;
    private String mCity;
    private String mRegion;
    private String mPostalCode;
    private String mCountry;
    private String mPhone;
    private String mFax;

    public String getCustomerID() {
        return mCustomerID;
    }

    public void setCustomerID(String customerID) {
        this.mCustomerID = customerID;
    }

    public String getCompanyName() {
        return mCompanyName;
    }

    public void setCompanyName(String companyName) {
        this.mCompanyName = companyName;
    }

    public String getContactName() {
        return mContactName;
    }

    public void setContactName(String contactName) {
        this.mContactName = contactName;
    }

    public String getContactTitle() {
        return mContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.mContactTitle = contactTitle;
    }

    public String getAddressa() {
        return mAddressa;
    }

    public void setAddressa(String addressa) {
        this.mAddressa = addressa;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        this.mCity = city;
    }

    public String getRegion() {
        return mRegion;
    }

    public void setRegion(String region) {
        this.mRegion = region;
    }

    public String getPostalCode() {
        return mPostalCode;
    }

    public void setPostalCode(String postalCode) {
        this.mPostalCode = postalCode;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        this.mCountry = country;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }

    public String getFax() {
        return mFax;
    }

    public void setFax(String fax) {
        this.mFax = fax;
    }
}
