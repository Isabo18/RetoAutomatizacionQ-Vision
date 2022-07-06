package com.saucedemo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    By Lbl_Product_Backpack = By.xpath("//div[text() ='Sauce Labs Backpack']");
    By Btn_AddToCart = By.xpath("//button[text()= 'Add to cart']");
    By Btn_Car = By.className("shopping_cart_badge");
    By Btn_Checkout = By.id("checkout");
    By Txt_Firsname = By.id("first-name");
    By Txt_Lastname = By.id("last-name");
    By Txt_Postal_Code = By.id("postal-code");
    By Btn_Continue = By.id("continue");
    By Btn_Finish = By.id("finish");
    By Lbl_Mesagge_Finish = By.xpath("//h2[text() ='THANK YOU FOR YOUR ORDER']");

    public By getLbl_Product_Backpack(){
        return Lbl_Product_Backpack;
    }
    public By getBtn_AddToCart(){
        return Btn_AddToCart;
    }
    public By getBtn_Car(){
        return Btn_Car;
    }
    public By getBtn_Checkout(){
        return Btn_Checkout;
    }
    public By getTxt_Firsname(){
        return Txt_Firsname;
    }
    public By getTxt_Lastname(){
        return Txt_Lastname;
    }
    public By getTxt_Postal_Code(){
        return Txt_Postal_Code;
    }
    public By getBtn_Continue(){
        return Btn_Continue;
    }
    public By getBtn_Finish(){
        return Btn_Finish;
    }
    public By getLbl_Mesagge_Finish(){
        return Lbl_Mesagge_Finish;
    }
}
