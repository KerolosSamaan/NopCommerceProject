package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P04_CartPage {

    public WebElement ShoppingCartIcon(){return Hooks.driver.findElement(By.cssSelector("li[id=\"topcartlink\"] a[href=\"/cart\"]"));}
    public WebElement TermsServiceBox(){return Hooks.driver.findElement(By.cssSelector("input[id=\"termsofservice\"]"));}
    public WebElement CheckOutButton(){return Hooks.driver.findElement(By.cssSelector("div[class=\"checkout-buttons\"] button[type=\"submit\"]"));}





}
