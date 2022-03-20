package netology.ru.daohibernate.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import netology.ru.daohibernate.repository.HibernateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Data
@AllArgsConstructor
public class HibernateController {

    private final HibernateRepository hibernateRepository;

    @GetMapping("/persons/by-city")
    public String getPersons(@RequestParam("city") String city) {
        return hibernateRepository.getPersonsByCity(city).toString();
    }
}
