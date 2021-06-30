package com.OpenLending.pages;

import com.OpenLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInPage {

    public LinkedInPage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }


    @FindBy(className = "top-card-layout__second-subline")
    public WebElement tagLine;



}
