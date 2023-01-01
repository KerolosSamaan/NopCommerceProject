package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P04_CartPage;

public class D04_CartPage extends P04_CartPage {

    @Given("user click on shopping cart")
    public void Shopping_cart(){ShoppingCartIcon().click();}


    @And("user accept the terms")
    public void Accept_terms(){TermsServiceBox().click();}


    @Then("user check out the order")
    public void Check_out_order(){CheckOutButton().click();}











}
