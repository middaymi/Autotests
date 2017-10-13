package steps;

import cucumber.api.java.ru.*;
import lombok.extern.slf4j.Slf4j;
import pages.KensingtonPage;
import pages.ProductPage;
import ru.alfabank.alfatest.cucumber.api.AlfaScenario;
import org.junit.Assert;

@Slf4j
public class Steps {
    AlfaScenario alfaScenario = AlfaScenario.getInstance();

    @И("^название товара записалось в переменную \"(.*)\"$")
    public void saveTitle(String variableName) {
        String title = alfaScenario.getCurrentPage().getElement("Название товара").getText();
        alfaScenario.setVar(variableName, title);
    }

    @И("^наименования товара, сохраненные в перемнных \"(.*)\" и \"(.*)\" совпадают$")
    public void checkProductNames(String onKensington, String onDetail) {
        Assert.assertTrue(String.format("Название товара на станице %s не совпадает с названием на странице %s",
                                         KensingtonPage.class.toString(), ProductPage.class.toString()),
                                         alfaScenario.getVar(onKensington).equals(alfaScenario.getVar(onDetail)));
    }
}
