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
public class PanCardRequest {
    
     private  String IDType="";
     private  String IDNumber="";     
     private  String FullName="";
     private  String FathersName="";
     private  Date DOB;
     private  Date DateofIssue;
     private  String IssuingAuthority="";
     private byte[] PanImg1;
     private byte[] PanImg2;

    /**
     * @return the IDType
     */
    public String getIDType() {
        return IDType;
    }

    /**
     * @param IDType the IDType to set
     */
    public void setIDType(String IDType) {
        this.IDType = IDType;
    }

    /**
     * @return the IDNumber
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /**
     * @param IDNumber the IDNumber to set
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /**
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the FathersName
     */
    public String getFathersName() {
        return FathersName;
    }

    /**
     * @param FathersName the FathersName to set
     */
    public void setFathersName(String FathersName) {
        this.FathersName = FathersName;
    }

    /**
     * @return the DOB
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the DateofIssue
     */
    public Date getDateofIssue() {
        return DateofIssue;
    }

    /**
     * @param DateofIssue the DateofIssue to set
     */
    public void setDateofIssue(Date DateofIssue) {
        this.DateofIssue = DateofIssue;
    }

    /**
     * @return the IssuingAuthority
     */
    public String getIssuingAuthority() {
        return IssuingAuthority;
    }

    /**
     * @param IssuingAuthority the IssuingAuthority to set
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * @return the PanImg1
     */
    public byte[] getPanImg1() {
        return PanImg1;
    }

    /**
     * @param PanImg1 the PanImg1 to set
     */
    public void setPanImg1(byte[] PanImg1) {
        this.PanImg1 = PanImg1;
    }

    /**
     * @return the PanImg2
     */
    public byte[] getPanImg2() {
        return PanImg2;
    }

    /**
     * @param PanImg2 the PanImg2 to set
     */
    public void setPanImg2(byte[] PanImg2) {
        this.PanImg2 = PanImg2;
    }
    
     @Override
        public String toString() {
             StringBuffer stBuff=new StringBuffer();

           stBuff.append("[IDType=");
           stBuff.append(getIDType());
           stBuff.append(", IDNumber=");
           stBuff.append(getIDNumber());
           stBuff.append(", FullName=");
           stBuff.append(getFullName());
           stBuff.append(", FathersName=");
           stBuff.append(getFathersName());
           stBuff.append(", DOB=");
           stBuff.append(getDOB());
           stBuff.append(", DateofIssue=");
           stBuff.append(getDateofIssue());
           stBuff.append(", IssuingAuthority=");
           stBuff.append(getIssuingAuthority());
           stBuff.append(", PanImg1=");
           stBuff.append(getPanImg1());
           stBuff.append(", PanImg2=");
           stBuff.append(getPanImg2());
           stBuff.append("]");
           
           return stBuff.toString();
        }
}
