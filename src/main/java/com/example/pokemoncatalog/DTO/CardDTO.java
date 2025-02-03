package com.example.pokemoncatalog.DTO;

import com.example.pokemoncatalog.Rarity;
import lombok.Data;

@Data
public class CardDTO {
    private String name;
    private String type;
    private Rarity rarity;
    private String imageUrl;
}
