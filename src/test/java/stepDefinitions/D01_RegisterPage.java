package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.P01_RegisterPage;

public class D01_RegisterPage extends P01_RegisterPage {

   @Given("user click on register icon")
   public void Register_Icon(){RegisterIcon().click();}

    @And("user choose gender type")
public void Gender_Type(){GenderTypeMale().click();}

    @And("user enter first name")
public void First_Name(){FirstNameTXT().sendKeys("kerolos");}

    @And("user enter last name")
public void Last_Name(){LastNameTXT().sendKeys("Samaan");}


    @And("user choose birthday")
public void Birth_Day(){
    Select select= new Select(BirthDay());
    select.selectByIndex(8);}

    @And("user choose birth month")
public void Birth_Month(){
    Select select= new Select(BirthMonth());
    select.selectByIndex(12);}

    @And("user choose birth year")
public void Birth_Year(){
    Select select = new Select(BirthYear());
    select.selectByVisibleText("1991");}

    @And("user enter email address")
public void Email_address(){EmailTXT().sendKeys("kwn@yahoo.com");}

    @And("user enter company name")
public void Company_Name(){CompanyNameTXT().sendKeys("123456");}

    @And("user check newsletter")
public void News_letter(){
   NewsLetterBox().isSelected();
   if (NewsLetterBox().isSelected()==false);}

    @And("user enter password")
public void Password(){PasswordTXT().sendKeys("123456");}

    @And("user enter confirm password")
public void Confirm_Password(){ConfirmPasswordTXT().sendKeys("123456");}

    @Then("user click on register button")
public void Register_Button(){RegisterButton().click();}

}

