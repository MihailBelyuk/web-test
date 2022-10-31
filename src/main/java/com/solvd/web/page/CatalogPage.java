package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры')]")
    private ExtendedWebElement computersAndNetwork;

    @FindBy(xpath = "//*[contains(@href,'medium=notebook')]")
    private ExtendedWebElement laptopsBtn;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void clickComputersAndNetwork() {
        computersAndNetwork.click();
    }

    public ProductsPage clickLaptops() {
        laptopsBtn.click();
        return new ProductsPage(getDriver());
    }
}
