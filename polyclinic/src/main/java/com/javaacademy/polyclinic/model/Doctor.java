package com.javaacademy.polyclinic.model;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * Врач
 */
@Slf4j
@RequiredArgsConstructor
public class Doctor {
    private final BigDecimal cost;
    private final Specialization specialization;

    public BigDecimal treat() {
        log.info("{} вылечил человека", specialization.getDescription());
        return cost;
    }
}
