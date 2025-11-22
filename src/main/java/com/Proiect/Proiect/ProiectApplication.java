package com.Proiect.Proiect;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Proiect.Proiect.model.TravelEntry;
import com.Proiect.Proiect.repository.TravelEntryRepository;

@SpringBootApplication
public class ProiectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProiectApplication.class, args);
    }

    @Bean
public CommandLineRunner demo(TravelEntryRepository repo) {
    return args -> {
        TravelEntry entry = new TravelEntry();
        entry.setTitle("Paris Trip");
        entry.setLocation("Paris");
        entry.setDate(LocalDate.of(2025, 12, 1));
        entry.setDescription("Vizitat Turnul Eiffel si muzeul Louvre");
        entry.setRating(9);

        repo.save(entry);

        System.out.println("Saved travel entry: " + repo.findAll());
    };
}
}