package com.OpenLending.pages;

import com.OpenLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),
                this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    public WebElement googleInput;

    @FindBy(xpath = "//*[@id=\"rso\"]/div/div/div/div[1]/a")
    public List<WebElement> results;





}
