package com.example.Tpcapital.controller;

import com.example.Tpcapital.dto.CountryDTO;
import com.example.Tpcapital.service.CountryService;
import com.example.Tpcapital.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/random-country")
    public ResponseEntity<CountryDTO> getRandomCountry() {
        Country country = countryService.getRandomCountry();
        CountryDTO countryDTO = new CountryDTO(country.getId(), country.getName());
        return ResponseEntity.ok(countryDTO);
    }

    @PostMapping("/find-capital")
    public ResponseEntity<Boolean> guessCapital(@RequestParam Long countryId, @RequestParam String capital) {
        boolean result = countryService.checkCapital(countryId, capital);
        return ResponseEntity.ok(result);
    }
}
