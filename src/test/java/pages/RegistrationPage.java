package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
        private CalendarComponent calendarComponent = new CalendarComponent();

        private SelenideElement
                firstNameInput = $("#firstName"),
                lastNameInput = $("#lastName"),
                emailInput = $("#userEmail"),
                genderInput = $(byText("Female")),
                phoneInput = $("#userNumber"),
                dateOfBirthInput = $("#dateOfBirthInput"),
                subjectInput = $("#subjectsInput"),
                hobbyInput = $(byText("Reading")),
                imageInput = $("#uploadPicture"),
                addressInput = $("#currentAddress"),
                stateInput = $("#state"),
                cityInput = $("#city"),
                submitBtn = $("#submit"),
                closeBtn = $("#closeLargeModal");

        public RegistrationPage openPage() {
            open("/automation-practice-form");
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");

            return this;
        }

        public RegistrationPage setFirstName (String value) {
            firstNameInput.setValue(value);

            return this;
        }

        public RegistrationPage setLastName (String value) {
            lastNameInput.setValue(value);

            return this;
        }

        public RegistrationPage setEmail (String value) {
            emailInput.setValue(value);

            return this;
        }

        public RegistrationPage setGender (String value) {
            genderInput.click();

            return this;
        }

        public RegistrationPage setPhone (String value) {
            phoneInput.setValue(value);

            return this;
        }

        public RegistrationPage setBirthDate (String day, String month, String year) {
            dateOfBirthInput.click();
            calendarComponent.setDate(day, month, year);

            return this;
        }

        public RegistrationPage setSubject (String value) {
            subjectInput.setValue(value);
            $(".subjects-auto-complete__menu").$(byText("English")).click();

            return this;
        }

        public RegistrationPage setHobby (String value) {
            hobbyInput.click();

            return this;
        }

        public RegistrationPage uploadPhoto (String fileName) {
            imageInput.uploadFromClasspath(fileName);

            return this;
        }

        public RegistrationPage setAddress (String value) {
            addressInput.setValue(value);

            return this;
        }

        public RegistrationPage setState (String value) {
            stateInput.click();
            $("#stateCity-wrapper").$(byText("Haryana")).click();

            return this;
        }

        public RegistrationPage setCity (String value) {
            cityInput.click();
            $("#stateCity-wrapper").$(byText("Karnal")).click();

            return this;
        }
        public RegistrationPage submit () {
            submitBtn.click();

            return this;
        }

        public RegistrationPage closeModal () {
            closeBtn.click();

            return this;
        }
}
