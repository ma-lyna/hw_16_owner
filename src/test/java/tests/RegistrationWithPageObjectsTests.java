package tests;

import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectsTests extends TestBase {

        @Test
        void fillRegistrationFormTest () {
            String username = "Marina",
                    userLastName = "Konovalchik",
                    email = "marina.konovalchik@gmail.com",
                    gender = "Female",
                    phoneNumber = "1234567890",
                    subject = "English",
                    hobby = "Reading",
                    photo = "avatar.png",
                    address = "Minsk, Belarus",
                    state = "Haryana",
                    city = "Karnal";

            registrationPage.openPage()
                    .setFirstName(username)
                    .setLastName(userLastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setPhone(phoneNumber)
                    .setBirthDate ("01", "May", "2018")
                    .setSubject(subject)
                    .setHobby(hobby)
                    .uploadPhoto(photo)
                    .setAddress(address)
                    .setState(state)
                    .setCity(city)
                    .submit();

            registrationPage.closeModal();
        }
}
