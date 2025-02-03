package com.example.pokemoncatalog.Repository;

import com.example.pokemoncatalog.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}