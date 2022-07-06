package com.saucedemo.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginSwaglabsPage extends PageObject {

    By Txt_Usuario = By.id("user-name");
    By Txt_Clave = By.id("password");
    By Btn_Login = By.id("login-button");
    By Lbl_Msg_Productos = By.xpath("//span[contains(text(),'Products')]");
    By Lbl_Msg_Erroneo = By.xpath(("//h3"));

    public By getTxt_Usuario(){
        return Txt_Usuario;
    }
    public By getTxt_Clave(){
        return Txt_Clave;
    }
    public By getBtn_Login(){
        return Btn_Login;
    }
    public By getLbl_Msg_Productos(){
        return Lbl_Msg_Productos;
    }
    public By getLbl_Msg_Erroneo(){
        return  Lbl_Msg_Erroneo;    }
}
