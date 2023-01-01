package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_BooksPage {

    public WebElement BooksIcon() {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/books\"]"));
    }

    public WebElement SortByDd() {
        return Hooks.driver.findElement(By.cssSelector("select[aria-label=\"Select product sort order\"]"));
    }

    //public WebElement SecondItems()
    //{return Hooks.driver.findElement(By.cssSelector("div[class=\"details\"] a[href=\"/fahrenheit-451-by-ray-bradbury\"]"));}

   // public WebElement SecondItemAddToCart() {return Hooks.driver.findElement
   // (By.cssSelector("div[data-productid=\"37\"] button[class=\"button-2 product-box-add-to-cart-button\"]"));}
    public WebElement SecondItemAddToCart()
    {return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"37\"] button[class=\"button-2 product-box-add-to-cart-button\"]"));}


}