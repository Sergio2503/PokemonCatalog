package com.example.pokemoncatalog.Controller;

import com.example.pokemoncatalog.DTO.CardDTO;
import com.example.pokemoncatalog.Service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {


    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<CardDTO>> getCards() {
        return ResponseEntity.ok(cardService.getAllCards());
    }

    @GetMapping("/getid")
    public ResponseEntity<CardDTO> getCardById(@RequestParam int id) {
        return ResponseEntity.ok(cardService.getCard(id));
    }

    @PostMapping("/putone")
    public ResponseEntity<CardDTO> createCard(@RequestBody CardDTO cardDTO) {
        return ResponseEntity.ok(cardService.uploadCard(cardDTO));
    }

    @PostMapping("/multiput")
    public ResponseEntity <List<CardDTO>> updateCard(@RequestBody List<CardDTO> cardDTOs) {
        return ResponseEntity.ok(cardService.multiUploadCards(cardDTOs));
    }

}