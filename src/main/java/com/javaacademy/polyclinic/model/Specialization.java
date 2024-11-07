package com.javaacademy.polyclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Специализация врача
 */
@Getter
@AllArgsConstructor
public enum Specialization {
    DENTIST("Стоматолог"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    private String description;
}
