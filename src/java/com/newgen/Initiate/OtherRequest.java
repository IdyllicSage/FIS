/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.Initiate;

import java.util.Date;

/**
 *
 * @author Sage
 */
public class OtherRequest {
    
         private String OthMobileNumber;
         private String OthEmail;
         private String BranchID;
         private String LoggedInUserName;
         private Date   DateTimeStamp;
         private String CustomerType;

    /**
     * @return the OthMobileNumber
     */
    public String getOthMobileNumber() {
        return OthMobileNumber;
    }

    /**
     * @param OthMobileNumber the OthMobileNumber to set
     */
    public void setOthMobileNumber(String OthMobileNumber) {
        this.OthMobileNumber = OthMobileNumber;
    }

    /**
     * @return the OthEmail
     */
    public String getOthEmail() {
        return OthEmail;
    }

    /**
     * @param OthEmail the OthEmail to set
     */
    public void setOthEmail(String OthEmail) {
        this.OthEmail = OthEmail;
    }

    /**
     * @return the BranchID
     */
    public String getBranchID() {
        return BranchID;
    }

    /**
     * @param BranchID the BranchID to set
     */
    public void setBranchID(String BranchID) {
        this.BranchID = BranchID;
    }

    /**
     * @return the LoggedInUserName
     */
    public String getLoggedInUserName() {
        return LoggedInUserName;
    }

    /**
     * @param LoggedInUserName the LoggedInUserName to set
     */
    public void setLoggedInUserName(String LoggedInUserName) {
        this.LoggedInUserName = LoggedInUserName;
    }

    /**
     * @return the DateTimeStamp
     */
    public Date getDateTimeStamp() {
        return DateTimeStamp;
    }

    /**
     * @param DateTimeStamp the DateTimeStamp to set
     */
    public void setDateTimeStamp(Date DateTimeStamp) {
        this.DateTimeStamp = DateTimeStamp;
    }

    /**
     * @return the CustomerType
     */
    public String getCustomerType() {
        return CustomerType;
    }

    /**
     * @param CustomerType the CustomerType to set
     */
    public void setCustomerType(String CustomerType) {
        this.CustomerType = CustomerType;
    }

           @Override
        public String toString() {
             StringBuffer stBuff=new StringBuffer();

           stBuff.append("[OthMobileNumber=");
           stBuff.append(getOthMobileNumber());
           stBuff.append(", OthEmail=");
           stBuff.append(getOthEmail());
           stBuff.append(", BranchID=");
           stBuff.append(getBranchID());
           stBuff.append(", LoggedInUserName=");
           stBuff.append(getLoggedInUserName());
           stBuff.append(", DateTimeStamp=");
           stBuff.append(getDateTimeStamp());
           stBuff.append(", CustomerType=");
           stBuff.append(getCustomerType());
           stBuff.append("]");
           
           return stBuff.toString();
        }
        
}
