/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newgen.Initiate;

import java.util.Arrays;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Sage
 */
@WebService(serviceName = "Initiate")
public class Initiate {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Test")
    public String hello(@WebParam(name = "Aadhar")AadharRequest ireq,
            @WebParam(name = "VoterID")VoterIDRequest[] ivote,
            @WebParam(name ="PanCard")PanCardRequest[] ipan,
            @WebParam(name ="DrivingLicense")DrivingLicenseRequest[] idrive,
            @WebParam(name ="Passport")PassportRequest[] ipass,
            @WebParam(name ="SelfDecalaration")SelfDecRequest[] iself,
            @WebParam(name ="RationCard")RationCardRequest[] iration,
            @WebParam(name ="OtherDetails")OtherRequest[] iother
            ) {
        
        String InsertQuery="Insert ALL ";
        
        InsertQuery=" INTO KYC_MASTER(KYCNAME,AadharNumber,AadharImg1,AadharImg2) values "+ ireq;
        
        System.out.println("InsertQuery "+InsertQuery);
        
        return "Aadhar\n"+ireq+"\n VoterID \n"+Arrays.asList(ivote)
                +"\n PanCard \n"+Arrays.asList(ipan)+"\n DrivingLicense \n"+Arrays.asList(idrive)
                +"\n Passport \n"+Arrays.asList(ipass)+"\n SelfDecalaration \n"+Arrays.asList(iself)
                +"\n RationCard \n"+Arrays.asList(iration)+"\n OtherDetails \n"+Arrays.asList(iother);
    }

    
    
    


}
