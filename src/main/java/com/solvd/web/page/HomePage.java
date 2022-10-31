package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@class='b-main-navigation__text' and contains(text(),'Каталог')]")
    private ExtendedWebElement catalogBtn;

    @FindBy(xpath = "//*[@class='fast-search__input']")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//iframe[@class='modal-iframe']")
    private ExtendedWebElement searchFrame;

    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public CatalogPage clickCatalog() {
        catalogBtn.click();
        return new CatalogPage(getDriver());
    }

    public void typeSearch(String text) {
        searchField.type(text);
    }

    public ExtendedWebElement getSearchFrame() {
        return searchFrame;
    }
}
