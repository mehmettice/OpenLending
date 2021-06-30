package com.OpenLending.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Helper {


    public static WebElement findSpecificResult(List<WebElement> allResults, String desiredResult) {

        for (int i = 0; i < allResults.size(); i++) {

            if(allResults.get(i).getAttribute("href").toLowerCase().contains(desiredResult)){

                return allResults.get(i);

            }

        }

        return null;
    }
}
