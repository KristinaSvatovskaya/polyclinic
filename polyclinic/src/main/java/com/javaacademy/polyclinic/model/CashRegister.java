package com.javaacademy.polyclinic.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Касса
 */
@Slf4j
@Getter
@Component
public class CashRegister {
    private BigDecimal income = BigDecimal.ZERO;

    public void acceptPayment(BigDecimal amount) {
        income = income.add(amount);
    }

    public void printInfo() {
        log.info("Доход: {}", income);
    }
}
