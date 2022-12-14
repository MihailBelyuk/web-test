package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.web.uiobject.Product;
import com.solvd.web.uiobject.YourLocationBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(),'Lenovo') and @data-bind='html: item.name']")
    private ExtendedWebElement manufacturerCheckBox;

    @FindBy(xpath = "//*[@class='popover-style__content']")
    private YourLocationBlock yourLocationBlock;

    @FindBy(xpath = "//*[@title='Lenovo Legion 5 15ACH6H 82JU00A1PB']")
    private ExtendedWebElement productPicture;

    @FindBy(xpath = "//*[@class='schema-product']")
    private List<Product> products;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickManufacturerCheckBox() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(manufacturerCheckBox.getElement());
        actions.click().build().perform();
    }

    public ExtendedWebElement getManufacturerCheckBox() {
        return manufacturerCheckBox;
    }

    public ProductPage clickProductPicture() {
        productPicture.click();
        return new ProductPage(getDriver());
    }

    public List<Product> getLaptops() {
        return products;
    }

    public YourLocationBlock getYourLocationBlock() {
        return yourLocationBlock;
    }
}
