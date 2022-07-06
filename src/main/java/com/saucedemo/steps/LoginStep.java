package com.saucedemo.steps;

import com.saucedemo.pageobjects.LoginSwaglabsPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class LoginStep {
    LoginSwaglabsPage loginSwaglabsPage= new LoginSwaglabsPage();

    //Se abre el navegadddor
    @Step
    public void OpenBrowser(){
        loginSwaglabsPage.open();
    }
    //Ingresa Usuario
    @Step
    public void AddUser(String usuario){
        loginSwaglabsPage.getDriver().findElement(loginSwaglabsPage.getTxt_Usuario()).sendKeys(usuario);
    }
    //Ingresa Contraseña
    @Step
    public void AddPassword(String clave){
        loginSwaglabsPage.getDriver().findElement(loginSwaglabsPage.getTxt_Clave()).sendKeys(clave);
    }
    //Clic en el boton Login
    @Step
    public void ClicLogin(){
        loginSwaglabsPage.getDriver().findElement(loginSwaglabsPage.getBtn_Login()).click();
    }
    //Valida mensaje login exitoso
    @Step
    public void ValidateMessage(){
        Assert.assertThat(loginSwaglabsPage.getDriver().
                findElement(loginSwaglabsPage.getLbl_Msg_Productos()).isDisplayed(), Matchers.is(true));
    }
    //Valia mensaje login fallido
    @Step
    public void ValidateMessageLoginFailed(){
        Assert.assertThat(loginSwaglabsPage.getDriver().findElement(loginSwaglabsPage.getLbl_Msg_Erroneo()).
                        isDisplayed(),Matchers.is(true));
    }
}
