package com.google.pages;

import com.google.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
