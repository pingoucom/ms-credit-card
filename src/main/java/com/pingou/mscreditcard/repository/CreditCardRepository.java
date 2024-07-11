package com.pingou.mscreditcard.repository;

import com.pingou.mscreditcard.model.CreditCardDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardDto, String> {
    List<CreditCardDto> findAllByIdUser(String idUser);
}
