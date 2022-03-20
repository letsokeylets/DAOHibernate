package netology.ru.daohibernate.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Persons {

    @EmbeddedId
    private InfoPerson infoPerson;

    @Column
    private String phoneNumber;

    @Column
    private String cityOfLiving;

    @Override
    public String toString() {
        return "Persons{" +
                "name=" + infoPerson.getName() + " " +
                ", surname=" + infoPerson.getSurname() + " " +
                ", age=" + infoPerson.getAge() + " " +
                ", phoneNumber='" + phoneNumber + " " +
                ", cityOfLiving='" + cityOfLiving + " " +
                "}";
    }
}
