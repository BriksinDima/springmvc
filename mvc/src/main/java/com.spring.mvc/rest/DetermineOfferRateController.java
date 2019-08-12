package com.spring.mvc.rest;

import com.spring.mvc.service.DetermineOfferRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class DetermineOfferRateController {

    @Autowired
    DetermineOfferRateService determineOfferRateService;

    @GetMapping("/calculate/{clientCardId}")
    public Double deterimeOfferRate(@PathVariable String clientCardId){
        return determineOfferRateService.determineOfferRate(clientCardId);
    }
}
