package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P02_LoginPage;

public class D02_LoginPage extends P02_LoginPage {

    @Given("user go to login page")
    public void Login_page() {
        LoginTap().click();
    }

    @And("user enter valid email")
    public void Valid_Email() {
        EmailAddressTXT().sendKeys("kwn@yahoo.com");
    }


    @And("user enter valid password")
    public void Valid_Password() {
        PasswordTxt().sendKeys("123456");
    }


    @Then("user click on login button")
    public void Login_Button() {LoginButton().click();}


}


