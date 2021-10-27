package com.fis.services.authorization.batches.businesslogic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicService {

   // @Autowired
   // private BuildProperties buildProperties;

    public String getVersionInfo(){
        //return buildProperties.getVersion();
        return "Service Class working";
    }
}
