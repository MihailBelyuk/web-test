package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.web.uiobject.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchFrame extends AbstractPage {

    @FindBy(xpath = "//*[@class='search__close']")
    private ExtendedWebElement searchClose;

    @FindBy(xpath = "//*[@class='search__result'][2]") // TODO: 10/31/2022 iframe part to be done 
    private ExtendedWebElement searchProduct;

    @FindBy(xpath = "//*[@class='result__wrapper']")
    private List<Product> productList;

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

    public List<Product> getProductList() {
        return productList;
    }
}
