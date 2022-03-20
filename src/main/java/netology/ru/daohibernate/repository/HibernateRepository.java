package netology.ru.daohibernate.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import netology.ru.daohibernate.entity.Persons;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HibernateRepository {

    private final String sqlSelect = "select p from Persons p where p.cityOfLiving = :cityName";

    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city) {
        Query query = entityManager.createQuery(sqlSelect, Persons.class)
                .setParameter("cityName", city);
        return query.getResultList();
    }


}
