package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.P05_CheckOut;

public class D05_CheckOut extends P05_CheckOut {

    @And("user choose the country")
    public void Choose_County(){
        Select select = new Select(CountryName());
        select.selectByVisibleText("Egypt");}

    @And("user choose the state")
    public void Choose_State(){
        Select select = new Select(StateName());
        select.selectByIndex(0);}

    @And("user enter the city name")
    public void Enter_CityName(){CityName().sendKeys("Giza");}


    @And("user enter address 1")
    public void Enter_Address1(){Address1().sendKeys("mohamed omar St");}

    @And("user enter postal code")
    public void Postal_Code(){PostalCode().sendKeys("11111");}


    @And("user enter phone number")
    public void Phone_Number(){PhoneNumber().sendKeys("01111111111");}


    @Then("user click on continue button")
    public void Continue_Button(){ContinueButton().click();}

  @And("user click on continue1 button")
   public void Continue_Button_1(){ContinueButton_1().click();}

    @And("user click on continue2 button")
    public void Continue_Button_2(){ContinueButton_2().click();}

    @And("user click on continue3 button")
    public void Continue_Button_3(){ContinueButton_3().click();}

    @Then("user click on confirm button")
    public void Confirm_Button(){ConfirmButton().click();}




}
