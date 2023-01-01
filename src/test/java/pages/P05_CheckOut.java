package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P05_CheckOut {

    public WebElement CountryName(){return Hooks.driver.findElement(By.cssSelector("select[data-trigger=\"country-select\"]"));}
    public WebElement StateName(){return Hooks.driver.findElement(By.cssSelector("select[data-trigger=\"state-select\"]"));}
    public WebElement CityName(){return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"City is required\"]"));}
    public WebElement Address1(){return Hooks.driver.findElement(By.cssSelector("input[name=\"BillingNewAddress.Address1\"]"));}
    public WebElement PostalCode(){return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]"));}
    public WebElement PhoneNumber(){return Hooks.driver.findElement(By.cssSelector("input[name=\"BillingNewAddress.PhoneNumber\"]"));}
    public WebElement ContinueButton()
    {return Hooks.driver.findElement(By.cssSelector("div[id=\"billing-buttons-container\"] button[class=\"button-1 new-address-next-step-button\"]"));}

    public WebElement ContinueButton_1()
    {return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));}

    public WebElement ContinueButton_2()
    {return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));}

    public WebElement ContinueButton_3()
    {return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));}


    public WebElement ConfirmButton()
    {return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));}
}
