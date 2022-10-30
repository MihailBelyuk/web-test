package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    @FindBy(xpath = "//*[@class='catalog-masthead']//*[contains(text(),'82JU00A1PB')]")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//h1[contains(text(),'Catana RC CAT2500RC')]")
    private ExtendedWebElement searchProductName;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return productName.getText();
    }

    public String getSearchProductName() {
        return searchProductName.getText();
    }
}
