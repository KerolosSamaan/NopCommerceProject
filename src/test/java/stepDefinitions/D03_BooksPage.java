package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.P03_BooksPage;

public class D03_BooksPage extends P03_BooksPage {

    @Given("user click on books icon")
    public void Books_Icon() {
        BooksIcon().click();
    }

    @And("user sort the result by price from low to high")
    public void Sort_By() throws InterruptedException {
        Select select = new Select(SortByDd());
        select.selectByIndex(3);

        Thread.sleep(Long.parseLong("2000"));
    }


    @Then("user add second item to cart")
    public void Second_Item_ToCart(){
        SecondItemAddToCart().click();

    }
}
