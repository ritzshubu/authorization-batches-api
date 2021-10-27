package com.fis.services.authorization.batches.restapi.business;


import com.fis.services.authorization.batches.businesslogic.service.BusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BusinessLogicController {

    @Autowired
    private BusinessLogicService businessLogicService;

    @GetMapping("/version")
    public String getVersion(){
       return businessLogicService.getVersionInfo() + "This is also working ";
    }

}
