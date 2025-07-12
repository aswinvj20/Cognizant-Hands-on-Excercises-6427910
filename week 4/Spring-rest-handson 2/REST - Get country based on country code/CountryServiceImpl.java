package com.cognizant.spring_learn.service;
import java.util.List;
import java.util.Optional;
import com.cognizant.spring_learn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    @Qualifier("countryList")
    private List<Country> countryList;

    @Override
    public Country getCountry(String code) {
        Optional<Country> result = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst();
        return result.orElse(null);
    }
}
