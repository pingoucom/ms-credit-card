package com.pingou.mscreditcard.service;

import com.pingou.mscreditcard.model.CreditCard;
import com.pingou.mscreditcard.model.CreditCardDto;
import com.pingou.mscreditcard.repository.CreditCardRepository;
import com.pingou.mscreditcard.util.Utill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;


    public List<CreditCardDto> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    public List<CreditCardDto> getAllCreditCardsByUser(String id) {
        return creditCardRepository.findAllByIdUser(id);
    }

    public CreditCardDto getCreditCardById(String id) {
        return creditCardRepository.findById(id).orElse(null);
    }

    public CreditCardDto createCreditCard(CreditCard creditCard) {
        CreditCardDto creditCardDto = Utill.convertToDto(creditCard);
        return creditCardRepository.save(creditCardDto);
    }

    public void deleteCreditCardbyId(String id) {
        creditCardRepository.deleteById(id);
    }

    public void deleteCreditCard(CreditCard creditCard) {
        CreditCardDto creditCardDto = Utill.convertToDto(creditCard);
        creditCardRepository.delete(creditCardDto);
    }


}
