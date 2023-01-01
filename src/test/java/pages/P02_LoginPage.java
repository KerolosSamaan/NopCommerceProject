package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_LoginPage {

    public WebElement LoginTap(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));}

    public WebElement EmailAddressTXT(){return Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));}

    public WebElement PasswordTxt(){return Hooks.driver.findElement(By.cssSelector("input[class=\"password\"]"));}

    public WebElement LoginButton(){return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));}




}
