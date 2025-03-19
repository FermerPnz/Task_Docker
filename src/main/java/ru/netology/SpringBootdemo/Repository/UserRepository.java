package ru.netology.SpringBootdemo.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.SpringBootdemo.Model.Authorities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        // Пример логики проверки пользователя
        if ("admin".equals(user) && "1234".equals(password)) {
            return Arrays.asList(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "5678".equals(password)) {
            return Collections.singletonList(Authorities.READ);
        } else {
            return Collections.emptyList();
        }
    }
}