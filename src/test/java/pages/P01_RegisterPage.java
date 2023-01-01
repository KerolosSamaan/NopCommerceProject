package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P01_RegisterPage {

    public WebElement RegisterIcon(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));}

    public WebElement GenderTypeMale(){return Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-male\"]"));}
    public WebElement GenderTypeFemale(){return Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-female\"]"));}
    public WebElement FirstNameTXT(){return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"First name is required.\"]"));}
    public WebElement LastNameTXT(){return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Last name is required.\"]"));}

    public WebElement BirthDay(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));}
    public WebElement BirthMonth(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));}
    public WebElement BirthYear(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));}


    public WebElement EmailTXT(){return Hooks.driver.findElement(By.cssSelector("div[class=\"inputs\"] input[type=\"email\"]"));}


    public WebElement CompanyNameTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"Company\"]"));}

    public WebElement NewsLetterBox(){return Hooks.driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));}

    public WebElement PasswordTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));}
    public WebElement ConfirmPasswordTXT(){return Hooks.driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));}

    public WebElement RegisterButton(){return Hooks.driver.findElement(By.cssSelector("button[name=\"register-button\"]"));}




}
