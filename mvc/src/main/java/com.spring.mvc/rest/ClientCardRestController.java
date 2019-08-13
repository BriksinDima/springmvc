package com.spring.mvc.rest;

import com.model.entities.ClientCard;
import com.spring.mvc.service.ClientCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientCardRestController {
    @Autowired
    private ClientCardService clientCardService;


    @GetMapping("/clientCards")
    public List<ClientCard> getClientCards() {
        return clientCardService.getClientCards();
    }

    @GetMapping("/clientCards/{clientCardId}")
    public ClientCard getClientCard(@PathVariable String clientCardId) {
        ClientCard clientCard = clientCardService.getClientCard(clientCardId);
        return clientCard;
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
