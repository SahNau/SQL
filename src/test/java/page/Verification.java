package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Selenide.$;

public class Verification {
    private SelenideElement heading = $(".heading");
    private SelenideElement codeField = $("[data-test-id=code] input");
    private SelenideElement verifyButton = $("[data-test-id=action-verify]");

    public Verification() {
        heading.shouldBe(Condition.visible).shouldHave(Condition.text("Интернет Банк"));
    }

    @SneakyThrows
    public DashboardPage inputCode(String code) {
        codeField.setValue(code);
        verifyButton.click();
        return new DashboardPage();
    }
}

