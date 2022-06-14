package com.tejs.microservices.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejs.microservices.currencyexchangeservice.DTO.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository  extends JpaRepository<CurrencyExchange,Long>{
    

    CurrencyExchange findByFromAndTo(String from , String to);

}
