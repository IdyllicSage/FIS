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
public class DrivingLicenseRequest {
    
    
     private  String IDType="";
     private  String IDNumber="";     
     private  String FullName="";
     private  String FathersName="";
     private  Date DOB;
     private  Date DateofIssue;
     private  Date DateofAuthority;
     private  String IssuingAuthority="";     
     private  String AddressType="";
     private  String AddressLine1="";
     private  String AddressLine2="";
     private  String AddressLine3="";
     private  String AddressLine4="";
     private String Landmark="";
     private String Pincode="";
     private String Country="";
     private String State="";
     private String District="";
     private String SubDistrictTaluk="";
     private String VillageWard="";

     private byte[] DLImg1;
     private byte[] DLImg2;

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
     * @return the AddressType
     */
    public String getAddressType() {
        return AddressType;
    }

    /**
     * @param AddressType the AddressType to set
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * @return the AddressLine1
     */
    public String getAddressLine1() {
        return AddressLine1;
    }

    /**
     * @param AddressLine1 the AddressLine1 to set
     */
    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    /**
     * @return the AddressLine2
     */
    public String getAddressLine2() {
        return AddressLine2;
    }

    /**
     * @param AddressLine2 the AddressLine2 to set
     */
    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    /**
     * @return the AddressLine3
     */
    public String getAddressLine3() {
        return AddressLine3;
    }

    /**
     * @param AddressLine3 the AddressLine3 to set
     */
    public void setAddressLine3(String AddressLine3) {
        this.AddressLine3 = AddressLine3;
    }

    /**
     * @return the AddressLine4
     */
    public String getAddressLine4() {
        return AddressLine4;
    }

    /**
     * @param AddressLine4 the AddressLine4 to set
     */
    public void setAddressLine4(String AddressLine4) {
        this.AddressLine4 = AddressLine4;
    }

    /**
     * @return the Landmark
     */
    public String getLandmark() {
        return Landmark;
    }

    /**
     * @param Landmark the Landmark to set
     */
    public void setLandmark(String Landmark) {
        this.Landmark = Landmark;
    }

    /**
     * @return the Pincode
     */
    public String getPincode() {
        return Pincode;
    }

    /**
     * @param Pincode the Pincode to set
     */
    public void setPincode(String Pincode) {
        this.Pincode = Pincode;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the District
     */
    public String getDistrict() {
        return District;
    }

    /**
     * @param District the District to set
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * @return the SubDistrictTaluk
     */
    public String getSubDistrictTaluk() {
        return SubDistrictTaluk;
    }

    /**
     * @param SubDistrictTaluk the SubDistrictTaluk to set
     */
    public void setSubDistrictTaluk(String SubDistrictTaluk) {
        this.SubDistrictTaluk = SubDistrictTaluk;
    }

    /**
     * @return the VillageWard
     */
    public String getVillageWard() {
        return VillageWard;
    }

    /**
     * @param VillageWard the VillageWard to set
     */
    public void setVillageWard(String VillageWard) {
        this.VillageWard = VillageWard;
    }

    /**
     * @return the DLImg1
     */
    public byte[] getDLImg1() {
        return DLImg1;
    }

    /**
     * @param DLImg1 the DLImg1 to set
     */
    public void setDLImg1(byte[] DLImg1) {
        this.DLImg1 = DLImg1;
    }

    /**
     * @return the DLImg2
     */
    public byte[] getDLImg2() {
        return DLImg2;
    }

    /**
     * @param DLImg2 the DLImg2 to set
     */
    public void setDLImg2(byte[] DLImg2) {
        this.DLImg2 = DLImg2;
    }
    
     /**
     * @return the DateofAuthority
     */
    public Date getDateofAuthority() {
        return DateofAuthority;
    }

    /**
     * @param DateofAuthority the DateofAuthority to set
     */
    public void setDateofAuthority(Date DateofAuthority) {
        this.DateofAuthority = DateofAuthority;
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
           stBuff.append(", DateofAuthority=");
           stBuff.append(getDateofAuthority());
           stBuff.append(", IssuingAuthority=");
           stBuff.append(getIssuingAuthority());
           stBuff.append(", AddressType=");
           stBuff.append(getAddressType());
           stBuff.append(", AddressLine1=");
           stBuff.append(getAddressLine1());
           stBuff.append(", AddressLine2=");
           stBuff.append(getAddressLine2());
           stBuff.append(", AddressLine3=");
           stBuff.append(getAddressLine3());
           stBuff.append(", AddressLine4=");
           stBuff.append(getAddressLine4());
           stBuff.append(", Landmark=");
           stBuff.append(getLandmark());
           stBuff.append(", Pincode=");
           stBuff.append(getPincode());
           stBuff.append(", Country=");
           stBuff.append(getCountry());
           stBuff.append(", State=");
           stBuff.append(getState());
           stBuff.append(", District=");
           stBuff.append(getDistrict());
           stBuff.append(", SubDistrictTaluk=");
           stBuff.append(getSubDistrictTaluk());
           stBuff.append(", VillageWard=");
           stBuff.append(getVillageWard());
           stBuff.append(", DLImg1=");
           stBuff.append(getDLImg1());
           stBuff.append(", DLImg2=");
           stBuff.append(getDLImg2());
           stBuff.append("]");
           
           return stBuff.toString();
       }

   
}
