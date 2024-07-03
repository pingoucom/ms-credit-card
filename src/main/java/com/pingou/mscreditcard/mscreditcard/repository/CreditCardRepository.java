package com.pingou.mscreditcard.mscreditcard.repository;

import com.pingou.mscreditcard.mscreditcard.model.CreditCardDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardDto, String> {
}
