package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.model.CashRegister;
import com.javaacademy.polyclinic.model.Doctor;
import com.javaacademy.polyclinic.model.Specialization;
import com.javaacademy.polyclinic.service.Polyclinic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class PolyclinicConfig {
    @Value("${doctor.cost.dentist}")
    private BigDecimal dentistCost;

    @Value("${doctor.cost.therapist}")
    private BigDecimal therapistCost;

    @Value("${doctor.cost.juniorSurgeon}")
    private BigDecimal juniorSurgeonCost;

    @Value("${doctor.cost.seniorSurgeon}")
    private BigDecimal seniorSurgeonCost;

    @Bean
    public Doctor dentist() {
        return new Doctor(dentistCost, Specialization.DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(therapistCost, Specialization.THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(juniorSurgeonCost, Specialization.SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(seniorSurgeonCost, Specialization.SURGEON);
    }

    @Bean
    public Polyclinic polyclinic(CashRegister cashRegister) {
        return new Polyclinic(cashRegister, dentist(), therapist(), juniorSurgeon(), seniorSurgeon());
    }
}
