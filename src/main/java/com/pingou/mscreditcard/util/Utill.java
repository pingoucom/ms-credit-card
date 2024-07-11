package com.pingou.mscreditcard.util;

import com.pingou.mscreditcard.model.CreditCard;
import com.pingou.mscreditcard.model.CreditCardDto;


public class Utill {

    public static CreditCardDto convertToDto(CreditCard creditCard) {
        CreditCardDto creditCardDto = new CreditCardDto();
        creditCardDto.setIdUser(creditCard.getIdUser());

        String holderName = creditCard.getHolderName();
        int firstSpaceIndex = holderName.indexOf(' ');
        int lastSpaceIndex = holderName.lastIndexOf(' ');

        if (firstSpaceIndex != -1 && lastSpaceIndex != -1 && firstSpaceIndex != lastSpaceIndex) {
            creditCardDto.setHolder_first_name(holderName.substring(0, firstSpaceIndex));
            creditCardDto.setHolder_last_name(holderName.substring(lastSpaceIndex + 1));
        } else {
            creditCardDto.setHolder_first_name(holderName);
            creditCardDto.setHolder_last_name("");
        }

        creditCardDto.setBrand(extractBrand(creditCard.getNumber()));
        creditCardDto.setLastFourDigits(creditCard.getNumber().substring(creditCard.getNumber().length() - 4));

        return creditCardDto;
    }

    private static String extractBrand(String cardNumber) {
        if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
            return "amex";
        } else if (cardNumber.startsWith("36") || cardNumber.startsWith("38")) {
            return "dinersClub";
        } else if (cardNumber.startsWith("6011") || cardNumber.startsWith("65")) {
            return "discover";
        } else if (cardNumber.startsWith("50") || (cardNumber.startsWith("62") && cardNumber.length() == 16) || cardNumber.startsWith("63") || cardNumber.startsWith("64")) {
            return "elo";
        } else if (cardNumber.startsWith("35")) {
            return "jcb";
        } else if (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55")) {
            return "mastercard";
        } else if (cardNumber.startsWith("4")) {
            return "visa";
        } else {
            return "Unknown";
        }
    }
}
