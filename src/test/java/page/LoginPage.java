package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-test-id=\"login\"] input");
    private SelenideElement passwordField = $("[data-test-id=\"password\"] input");
    private SelenideElement sigIn = $("[data-test-id=\"action-login\"]");
    private SelenideElement errorNotification = $("[data-test-id=\"error-notification\"]");

    private void setUp(String login, String password){
        loginField.setValue(login);
        passwordField.setValue(password);
        sigIn.click();
    }

    public Verification sigIn(String login, String password) {
        setUp(login, password);
        return new Verification();
    }

    public void invalidSigIn(String login) {
        setUp(login, login);
        errorNotification.shouldBe(Condition.visible);
    }
}