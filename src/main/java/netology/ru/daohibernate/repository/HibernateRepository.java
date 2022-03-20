package netology.ru.daohibernate.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import netology.ru.daohibernate.entity.Persons;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HibernateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Persons getPersonsByCity(String city) {
        return null;
    }


}
