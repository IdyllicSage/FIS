/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.Initiate;

/**
 *
 * @author Sage
 */
public class SelfDecRequest {
    
     private  String IDType="";
     private  String Purpose="";
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
     private String SelfDecPhone="";
     private String SelfDecEMail="";

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
     * @return the Purpose
     */
    public String getPurpose() {
        return Purpose;
    }

    /**
     * @param Purpose the Purpose to set
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
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
     * @return the SelfDecPhone
     */
    public String getSelfDecPhone() {
        return SelfDecPhone;
    }

    /**
     * @param SelfDecPhone the SelfDecPhone to set
     */
    public void setSelfDecPhone(String SelfDecPhone) {
        this.SelfDecPhone = SelfDecPhone;
    }

    /**
     * @return the SelfDecEMail
     */
    public String getSelfDecEMail() {
        return SelfDecEMail;
    }

    /**
     * @param SelfDecEMail the SelfDecEMail to set
     */
    
    public void setSelfDecEMail(String SelfDecEMail) {
        this.SelfDecEMail = SelfDecEMail;
    }
    
    
       @Override
        public String toString() {
           StringBuffer stBuff=new StringBuffer();
           
           stBuff.append("[IDType=");
           stBuff.append(getIDType());
           stBuff.append(", Purpose=");
           stBuff.append(getPurpose());
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
           stBuff.append(", SelfDecPhone=");
           stBuff.append(getSelfDecPhone());
           stBuff.append(", SelfDecEMail=");
           stBuff.append(getSelfDecEMail());
           stBuff.append("]");
           
           return stBuff.toString();
       }

    
}
