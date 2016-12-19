    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.Initiate;

import java.io.Serializable;

/**
 *
 * @author Sage
 */
public class AadharRequest implements Serializable{
 
  private static long serialVersionUID = 4205832525113691806L;
  
         private String AadharNumber;
         private byte[] AadharImg1;
         private byte[] AadharImg2;
    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the AadharNumber
     */
    public String getAadharNumber() {
        return AadharNumber;
    }

    /**
     * @param AadharNumber the AadharNumber to set
     */
    public void setAadharNumber(String AadharNumber) {
        this.AadharNumber = AadharNumber;
    }

    /**
     * @return the AadharImg1
     */
    public byte[] getAadharImg1() {
        return AadharImg1;
    }

    /**
     * @param AadharImg1 the AadharImg1 to set
     */
    public void setAadharImg1(byte[] AadharImg1) {
        this.AadharImg1 = AadharImg1;
    }

    /**
     * @return the AadharImg2
     */
    public byte[] getAadharImg2() {
        return AadharImg2;
    }

    /**
     * @param AadharImg2 the AadharImg2 to set
     */
    public void setAadharImg2(byte[] AadharImg2) {
        this.AadharImg2 = AadharImg2;
    }
    
           
       @Override
        public String toString() {
             StringBuffer stBuff=new StringBuffer();

           stBuff.append("('AadharCard','");
           stBuff.append(getAadharNumber());
           stBuff.append("',");
           stBuff.append(getAadharImg1().toString());
           stBuff.append(",");
           stBuff.append(getAadharImg2().toString());
           stBuff.append(")");
           
           return stBuff.toString();
        }
}