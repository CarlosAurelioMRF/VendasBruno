package br.com.carlosaurelio.vendasbruno.entities;

import java.util.Currency;
import java.util.Date;

/**
 * Created by Carlos Aurelio on 22/08/2016.
 */
public class Employee {

    private Integer mEmployeeID;
    private String mLastName;
    private String mFirstName;
    private String mTitle;
    private String mTitleOfCourtesy;
    private Date mBirthDate;
    private Date mHireDate;
    private String mAddress;
    private String mCity;
    private String mRegion;
    private String mPostalCode;
    private String mCountry;
    private String mHomePhone;
    private String mExtension;
    private String mPhoto;
    private String mNotes;
    private Integer mReportsTo;
    private String mPhotoPath;
    private Currency mSalary;

    public Integer getEmployeeID() {
        return mEmployeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.mEmployeeID = employeeID;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getTitleOfCourtesy() {
        return mTitleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.mTitleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return mBirthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.mBirthDate = birthDate;
    }

    public Date getHireDate() {
        return mHireDate;
    }

    public void setHireDate(Date hireDate) {
        this.mHireDate = hireDate;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        this.mAddress = address;
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

    public String getHomePhone() {
        return mHomePhone;
    }

    public void setHomePhone(String homePhone) {
        this.mHomePhone = homePhone;
    }

    public String getExtension() {
        return mExtension;
    }

    public void setExtension(String extension) {
        this.mExtension = extension;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        this.mPhoto = photo;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setNotes(String notes) {
        this.mNotes = notes;
    }

    public Integer getReportsTo() {
        return mReportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.mReportsTo = reportsTo;
    }

    public String getPhotoPath() {
        return mPhotoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.mPhotoPath = photoPath;
    }

    public Currency getSalary() {
        return mSalary;
    }

    public void setSalary(Currency salary) {
        this.mSalary = salary;
    }
}
