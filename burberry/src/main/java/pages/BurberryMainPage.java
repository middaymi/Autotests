package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AlfaPage;

@AlfaPage.Name("Главная Burberry")
public class BurberryMainPage extends AlfaPage {

    @FindBy(css = "a.burberry-logo-link")
    @Name("Логотип")
    public SelenideElement logoLink;

    @FindBy(css = "input.main-form__search-text")
    @Name("Поиск")
    public SelenideElement findField;

    @FindBy(css = "div.main-block__category[data-type=shop]")
    @Name("Категории")
    private SelenideElement categories;

}
