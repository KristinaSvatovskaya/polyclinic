package com.javaacademy.polyclinic.service;

import com.javaacademy.polyclinic.model.CashRegister;
import com.javaacademy.polyclinic.model.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Поликлиника
 */
@Component
@RequiredArgsConstructor
public class Polyclinic {
    private final CashRegister cashRegister;
    private final Doctor dentist;
    private final Doctor therapist;
    private final Doctor juniorSurgeon;
    private final Doctor seniorSurgeon;

    private void treatByDoctor(Doctor doctor) {
        cashRegister.acceptPayment(doctor.treat());
    }

    public void treatByDentist() {
        treatByDoctor(dentist);
    }

    public void treatByTherapist() {
        treatByDoctor(therapist);
    }

    public void treatByJuniorSurgeon() {
        treatByDoctor(juniorSurgeon);
    }

    public void treatBySeniorSurgeon() {
        treatByDoctor(seniorSurgeon);
    }
}
