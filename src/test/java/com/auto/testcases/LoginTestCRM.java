package com.auto.testcases;

import com.auto.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginTestCRM
{

    @Test
    public void loginApp() throws InterruptedException
    {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginToCrm("bharadwaj25@gmail.com","457ChangiRoad");

        Thread.sleep(5000);
    }

}
