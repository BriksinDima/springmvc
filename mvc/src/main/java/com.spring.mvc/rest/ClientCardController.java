package com.spring.mvc.rest;

import com.model.entities.ClientCard;
import com.spring.mvc.service.ClientCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class ClientCardController {
    @Autowired
    private ClientCardService clientCardService;


    @RequestMapping(value = "/clientcards", method = RequestMethod.GET)
    public String getClientCards(Model model) {
        model.addAttribute("clientCards",clientCardService.getClientCards());
        return "client-cards";
    }

    @RequestMapping(value = "/clientCards/{clientCardId}", method = RequestMethod.GET)
    public String getClientCard(@PathVariable String clientCardId, Model model) {
        model.addAttribute("clientCard", clientCardService.getClientCard(clientCardId));
        return "clientcard";
    }

    @PostMapping("/clientCards")
    public ClientCard addClientCard(@RequestBody ClientCard clientCard) {
        clientCardService.saveClientCard(clientCard);
        return clientCard;
    }

    @PutMapping("/clientCards")
    public ClientCard updateClientCard(@RequestBody ClientCard clientCard) {
        clientCardService.saveClientCard(clientCard);
        return clientCard;

    }

    @DeleteMapping("/clientCards/{clientCardId}")
    public String deleteClientCard(@PathVariable String clientCardId) {
        clientCardService.deleteClientCard(clientCardId);
        return "Deleted clientCard id - " + clientCardId;
    }
}
