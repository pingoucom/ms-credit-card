package com.pingou.mscreditcard.mscreditcard.controller;


import com.pingou.mscreditcard.mscreditcard.model.CreditCard;
import com.pingou.mscreditcard.mscreditcard.model.CreditCardDto;
import com.pingou.mscreditcard.mscreditcard.service.CreditCardService;
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


    @PostMapping
    public CreditCardDto createCreditCard(@RequestBody CreditCard creditCard) {
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
