package com.solvd.web.page;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YourLocationBlock extends AbstractUIObject {

    @FindBy(xpath = ".//*[contains(text(),'Да, верно')]")
    private ExtendedWebElement yourLocationConfirm;

    @FindBy(xpath = ".//*[contains(text(),'Нет, другой')]")
    private ExtendedWebElement yourLocationChange;

    public YourLocationBlock(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void confirmLocation() {
        yourLocationConfirm.click();
    }

    public void changeLocation() {
        yourLocationChange.click();
    }
}
