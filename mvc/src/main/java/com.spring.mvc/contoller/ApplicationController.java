package com.spring.mvc.contoller;


import com.model.entities.Application;
import com.model.entities.ClientCard;
import com.spring.mvc.service.ClientCardService;
import com.spring.mvc.service.DetermineOfferRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller/clientCard")
public class ApplicationController {

    @Autowired
    private ClientCardService clientCardService;

    @Autowired
    private DetermineOfferRateService determineOfferRateService;

    @RequestMapping(value="{clientCardId}/saveApplication", method = RequestMethod.POST)
    public String saveApplication(@PathVariable String clientCardId, @ModelAttribute("application") Application application, Model model){
        ClientCard cc = clientCardService.getClientCard(clientCardId);
        cc.getApplicationList().add(application);
        clientCardService.saveClientCard(cc);
        Double rate = determineOfferRateService.determineOfferRate(clientCardId);
        model.addAttribute("rate", rate);
        return "rate";
    }



}
