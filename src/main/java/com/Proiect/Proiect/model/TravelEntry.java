package com.Proiect.Proiect.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Clasa pentru intrare in jurnal de calatorii
 * @author NUME
 * @version 10 Decembrie 2025
 */
@Entity
public class TravelEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Titlul este obligatoriu.")
    private String title;

    @NotBlank(message = "Locatia este obligatorie.")
    private String location;

    @NotNull(message = "Data este obligatorie.")
    private LocalDate date;

    @Size(max = 1000, message = "Descrierea nu poate depasi 1000 de caractere.")
    private String description;

    @Min(value = 1, message = "Rating minim 1.")
    @Max(value = 10, message = "Rating maxim 10.")
    private int rating;

    // Constructor gol necesar JPA
    public TravelEntry() {}

    // Getteri si setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
