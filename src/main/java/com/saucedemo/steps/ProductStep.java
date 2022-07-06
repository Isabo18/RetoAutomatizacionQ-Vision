package com.saucedemo.steps;

import com.saucedemo.pageobjects.LoginSwaglabsPage;
import com.saucedemo.pageobjects.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ProductStep {

    ProductsPage productsPage = new ProductsPage();

    //Selecciona el producto y lo agrega al carrito
    public void addProducts() {
        productsPage.getDriver().findElement(productsPage.getLbl_Product_Backpack()).click();
        productsPage.getDriver().findElement(productsPage.getBtn_AddToCart()).click();
        productsPage.getDriver().findElement(productsPage.getBtn_Car()).click();
        productsPage.getDriver().findElement(productsPage.getBtn_Checkout()).click();
    }

    //Agregar datos compra
    public void yourInformation(String firsname, String lastname, String postalCode) {
        productsPage.getDriver().findElement(productsPage.getTxt_Firsname()).sendKeys(firsname);
        productsPage.getDriver().findElement(productsPage.getTxt_Lastname()).sendKeys(lastname);
        productsPage.getDriver().findElement(productsPage.getTxt_Postal_Code()).sendKeys(postalCode);

    }

    //Finalizar la compra
    public void finishPurchase() {
        productsPage.getDriver().findElement(productsPage.getBtn_Continue()).click();
        productsPage.getDriver().findElement(productsPage.getBtn_Finish()).click();
    }

    //Validar mensaje
    public void validateMessage() {
        Assert.assertThat(productsPage.getDriver().findElement(productsPage.getLbl_Mesagge_Finish()).
                isDisplayed(), Matchers.is(true));
    }

}
