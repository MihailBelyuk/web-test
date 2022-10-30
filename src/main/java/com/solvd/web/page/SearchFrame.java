package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchFrame extends AbstractPage {

    @FindBy(xpath = "//*[@class='search__close']")
    private ExtendedWebElement searchClose;

    @FindBy(xpath = "//*[@class='search__result'][2]")
    private ExtendedWebElement searchProduct;

    public SearchFrame(WebDriver driver) {
        super(driver);
    }

    public void clickSearchClose() {
        searchClose.click();
    }

    public ProductPage clickSearchProduct() {
        searchProduct.click();
        return new ProductPage(getDriver());
    }
}
