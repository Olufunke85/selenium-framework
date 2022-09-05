package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePO {

    // Stage 1 - Element Locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;


    //Initialise Web elements using Selenium Webdriver
    public HomepagePO(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    //Page specific method
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }
    public void clickSignInLink(){
        SignInLink.click();
    }






















}
