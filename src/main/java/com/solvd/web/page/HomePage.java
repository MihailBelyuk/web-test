package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@class='b-main-page-blocks-header-2 cfix']//*[@href='https://catalog.onliner.by']")
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

    public SearchFrame typeSearch(String text) {
        searchField.type(text);
        return new SearchFrame(getDriver());
    }

    public ExtendedWebElement getSearchFrame() {
        return searchFrame;
    }
}
