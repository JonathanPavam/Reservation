package reservation.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import reservation.application.model.enums.Gender;

import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "BIRTHDATE")
    private Date birthDate;
    @Column(name = "GENDER")
    private Gender gender;
    @Column(name = "PHONENUMBER")
    private String phoneNumber;
    @Column(name = "TYPEOFACESS")
    private Byte typeOfAcess;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(birthDate, user.birthDate) && gender == user.gender && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(typeOfAcess, user.typeOfAcess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, email, password, birthDate, gender, phoneNumber, typeOfAcess);
    }
}
