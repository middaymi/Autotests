package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.api.AlfaPage;

@AlfaPage.Name("Детальная товара")
public class ProductPage extends AlfaPage {

    @FindBy(css = "#product-image-asset")
    @Name("Фото товара")
    private SelenideElement productImage;

    @FindBy(css = "h1.product-title")
    @Name("Название товара")
    private SelenideElement productTitle;

    @FindBy(css = "div.price")
    @Name("Цена")
    private SelenideElement price;

    @FindBy(css = "#product-cart-form")
    @Name("Краткое описание товара")
    private SelenideElement productCard;

    @FindBy(css = "button.js-cart-submit[type=submit__unlinked]")
    @Name("В корзину")
    private SelenideElement inBag;

    @FindBy(css = "a.secondary-cta")
    @Name("Поиск в магазине")
    private SelenideElement findInShop;

}
