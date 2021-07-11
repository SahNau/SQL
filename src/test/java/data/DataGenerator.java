package data;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Locale;

public class DataGenerator {
    public UserDto getUserFirstPassword() {
        Faker user = new Faker(new Locale("en"));
        String id = user.idNumber().valid();
        String name = user.name().firstName();
        String password = "qwerty123";
        String encryptedPassword = "$2a$10$bdjJukJt6RkUWbKzedh0MOg/bl8aRjxUcHFiiUD5kBqfoF3xcDn7q";
        return new UserDto(id, name, password, encryptedPassword);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class UserDto {

        private String id;
        private String login;
        private String password;
        private String encryptedPassword;
    }
}
