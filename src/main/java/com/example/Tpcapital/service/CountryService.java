package com.example.Tpcapital.service;

import com.example.Tpcapital.model.Country;
import com.example.Tpcapital.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    private final Random random = new Random();

    public Country getRandomCountry() {
        List<Country> countries = countryRepository.findAll();
        return countries.get(random.nextInt(countries.size()));
    }

    public boolean checkCapital(Long countryId, String capital) {
        Optional<Country> country = countryRepository.findById(countryId);
        return country.isPresent() && country.get().getCapital().equalsIgnoreCase(capital);
    }
}
