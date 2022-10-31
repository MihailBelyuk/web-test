package com.solvd.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.web.page.*;
import com.solvd.web.uiobject.Product;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class OnlinerTest implements IAbstractTest {

    @Test
    public void openCatalogTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickCatalog();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://catalog.onliner.by/");
    }

    @Test
    public void findLaptopsByManufacturerAndCompareNameTest() {
        HomePage homePage = new HomePage(getDriver());
        CatalogPage catalogPage = homePage.clickCatalog();
        catalogPage.clickComputersAndNetwork();
        ProductsPage productsPage = catalogPage.clickLaptops();
        productsPage.getYourLocationBlock().confirmLocation();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)");
        productsPage.clickManufacturerCheckBox();
        List<Product> products = productsPage.getProducts();
        Assert.assertEquals(products.size(),30);
    }

    @Test
    public void typeSearchParameterAndCloseTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.typeSearch("catana");
        SearchFrame frame = new SearchFrame(getDriver());
        WebElement element = homePage.getSearchFrame().getElement();
        getDriver().switchTo().frame(element);
        frame.clickSearchClose();
        getDriver().switchTo().defaultContent();
    }

    @Test
    public void productsOnPageTest() {
        HomePage homePage = new HomePage(getDriver());
        CatalogPage catalogPage = homePage.clickCatalog();
        catalogPage.clickComputersAndNetwork();
        ProductsPage productsPage = catalogPage.clickLaptops();
        productsPage.getYourLocationBlock().confirmLocation();
        List<Product> products = productsPage.getProducts();
        Assert.assertEquals(products.size(),30);
    }

    @Test
    public void chooseFirstSearchElementTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.typeSearch("catana");
        SearchFrame frame = new SearchFrame(getDriver());
        WebElement element = homePage.getSearchFrame().getElement();
        getDriver().switchTo().frame(element);
        ProductPage productPage = frame.clickSearchProduct();
        getDriver().switchTo().defaultContent();
        Assert.assertEquals(productPage.getSearchProductName(), "Рыболовная катушка Shimano Catana RC CAT2500RC");
    }
}
