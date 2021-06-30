package com.OpenLending.runner;

import com.OpenLending.pages.GooglePage;
import com.OpenLending.pages.LinkedInPage;
import com.OpenLending.utilities.ApplicationConstants;
import com.OpenLending.utilities.ConfigurationReader;
import com.OpenLending.utilities.Driver;
import com.OpenLending.utilities.Helper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class MainTest {

        @Before
        public void setUp() {
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        }

        @Test
        public void verifySlogan() {


            GooglePage gPage1 = new GooglePage();

            gPage1.googleInput.sendKeys("Open Lending" + Keys.ENTER);

            Helper.findSpecificResult(gPage1.results,"linkedin").click();

            LinkedInPage lPage1 = new LinkedInPage();

            Assert.assertEquals(lPage1.tagLine.getText().trim(), ApplicationConstants.SECOND_TAGLINE);



        }


        @After
        public void tearDown() {

            Driver.closeDriver();
        }




}
