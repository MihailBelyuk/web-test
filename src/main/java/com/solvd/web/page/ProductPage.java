package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='catalog-masthead__title js-nav-header']")
    private ExtendedWebElement searchProductName;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchProductName() {
        return searchProductName.getText();
    }
}
