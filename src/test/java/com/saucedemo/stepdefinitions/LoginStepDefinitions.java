package com.saucedemo.stepdefinitions;

import com.saucedemo.models.DataLogin;
import com.saucedemo.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinitions {

    @Steps
    LoginStep loginStep;

    //Login Exitoso
    @Given("^login to swaglabs page$")
    public void loginToSwaglabsPage()  {
        loginStep.OpenBrowser();
    }
    @When("^correct username and password$")
    public void correctUsernameAndPassword(List<DataLogin> loginList) {
        loginStep.AddUser(loginList.get(0).getUser());
        loginStep.AddPassword(loginList.get(0).getPassword());
        loginStep.ClicLogin();
    }
    @Then("^The entry to the page is successful and I can see the products section$")
    public void theEntryToThePageIsSuccessfulAndICanSeeTheProductsSection() {
        loginStep.ValidateMessage();
    }

    //Login Fallido
    @When("^wrong username and password$")
    public void wrongUsernameAndPassword(List<DataLogin> loginList) {
        loginStep.AddUser(loginList.get(0).getUser());
        loginStep.AddPassword(loginList.get(0).getPassword());
        loginStep.ClicLogin();
    }
    @Then("^login must be failed showing message \"([^\"]*)\"$")
    public void loginMustBeFailedShowingMessage(String arg1) {
        loginStep.ValidateMessageLoginFailed();
    }


}
