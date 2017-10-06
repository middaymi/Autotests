package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AlfaPage;

@AlfaPage.Name("Главная Kensington")
public class KensingtonPage extends AlfaPage {

    @FindBy(css = "#burberry-logo-link")
    @Name("Логотип Burberry")
    private SelenideElement burberryLogo;

    @FindBy(css = "div.top-right-nav-holder")
    @Name("Кастомное пространство")
    private SelenideElement customSpace;

    @FindBy(css = "div.nav-localization-country")
    @Name("Магазин в России")
    private SelenideElement countryShop;

    @FindBy(css = "div.navigation-bar-bottom-wrapper")
    @Name("Панель навигации")
    private SelenideElement navigatePanel;

    @FindBy(css = "input.search-input[value=Kensington]")
    @Name("Kensington")
    private SelenideElement kensingtonResult;

    @FindBy(css = "div.facets-clear-wrapper")
    @Name("Фильтры")
    private SelenideElement filters;

    @FindBy(css = "div.products")
    @Name("Товары")
    private SelenideElement products;

    @FindBy(css = "a.js-product-card-title[data-product-id=\"39004581\"]")
    @Name("Название товара")
    private SelenideElement chosenProduct;

}
