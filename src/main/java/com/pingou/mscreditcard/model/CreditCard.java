package com.pingou.mscreditcard.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {

    private String holderName;
    private String holderDocument;
    private String idUser;
    private String number;
    private String expirationDate;
    private String cvv;

}
