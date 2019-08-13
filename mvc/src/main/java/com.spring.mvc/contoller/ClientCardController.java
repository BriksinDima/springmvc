package com.spring.mvc.contoller;

import com.model.entities.ClientCard;
import com.spring.mvc.service.ClientCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "addClientCard", method = RequestMethod.GET)
    public String addClientCard(Model model){
        model.addAttribute("clientCard",new ClientCard());
        return "add-client-card";
    }

    @RequestMapping(value = "addClientCard", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String addClientCard(@ModelAttribute("clientCard") ClientCard clientCard) {
        clientCardService.saveClientCard(clientCard);
        return "clientcard";
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
