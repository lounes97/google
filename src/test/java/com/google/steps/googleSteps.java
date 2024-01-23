package com.google.steps;

import com.google.utility.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class googleSteps {
    @When("user search for is on etsy title should not be apple")
    public void user_search_for_is_on_etsy_title_should_not_be_apple() {
        String title = Driver.getDriver().getTitle();
        String expTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(title,expTitle);
    }

}
