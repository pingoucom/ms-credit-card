package com.pingou.mscreditcard.controller;


import com.pingou.mscreditcard.model.CreditCard;
import com.pingou.mscreditcard.model.CreditCardDto;
import com.pingou.mscreditcard.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CreditCardController {
    @Autowired
    private CreditCardService creditCardService;

    @GetMapping
    public List<CreditCardDto> getAllCreditCards() {
        return creditCardService.getAllCreditCards();
    }

    @GetMapping("/user/{id}")
    public List<CreditCardDto> getAllCreditCardsByUser(@PathVariable String id) {
        return creditCardService.getAllCreditCardsByUser(id);
    }


    @PostMapping("/user/{id}")
    public CreditCardDto createCreditCard(@RequestBody CreditCard creditCard, @PathVariable String id) {
        creditCard.setIdUser(id);

        return creditCardService.createCreditCard(creditCard);
    }


    @DeleteMapping("/{id}")
    public void deleteCreditCardById(@PathVariable String id) {
        creditCardService.deleteCreditCardbyId(id);
    }

    @DeleteMapping
    public void deleteCreditCard(@RequestBody CreditCard creditCard) {
        creditCardService.deleteCreditCard(creditCard);
    }

}
