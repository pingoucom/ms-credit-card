package com.pingou.mscreditcard.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cards")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String brand;
    private String idUser;
    private String lastFourDigits;
    private String holder_first_name;
    private String holder_last_name;
}
