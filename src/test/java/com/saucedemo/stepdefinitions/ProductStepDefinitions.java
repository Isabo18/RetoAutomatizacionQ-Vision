package com.saucedemo.stepdefinitions;

import com.saucedemo.models.DataLogin;
import com.saucedemo.models.DataProducts;
import com.saucedemo.steps.LoginStep;
import com.saucedemo.steps.ProductStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ProductStepDefinitions {

    @Steps
    LoginStep loginStep;
    @Steps
    ProductStep productStep;

    @Given("^Entry to the page$")
    public void entryToThePage() {
        loginStep.OpenBrowser();
    }

    @When("^add with username and password$")
    public void addWithUsernameAndPassword(List<DataLogin>dataLoginList) {
        loginStep.AddUser(dataLoginList.get(0).getUser());
        loginStep.AddPassword(dataLoginList.get(0).getPassword());
        loginStep.ClicLogin();
    }
    @Given("^I add products to the cart to confirm the purchase$")
    public void iAddProductsToTheCartToConfirmThePurchase() {
        productStep.addProducts();
    }


    @When("^I add the purchase data to continue$")
    public void iAddThePurchaseDataToContinue(List<DataProducts>dataProductsList) {
        productStep.yourInformation(
                dataProductsList.get(0).getFirsname(),
                dataProductsList.get(0).getLastname(),
                dataProductsList.get(0).getPostalCode());
        productStep.finishPurchase();
    }

    @Then("^I check the message \"([^\"]*)\"$")
    public void iCheckTheMessage(String arg1) {
        productStep.validateMessage();
    }
}
