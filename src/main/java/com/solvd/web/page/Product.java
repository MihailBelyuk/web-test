package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {

    @FindBy(xpath = ".//*[@class='schema-product__description']//span[text()]")
    private ExtendedWebElement element;

    @FindBy(xpath = ".//*[@class='product__title']")
    private ExtendedWebElement searchProduct;

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getElement() {
        return element;
    }

    public ExtendedWebElement getSearchProduct() {
        return searchProduct;
    }
}
