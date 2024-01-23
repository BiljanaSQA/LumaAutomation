package com.sedc.pages;

import com.sedc.selenium.Interactions;

public class CreateAccountPage extends Interactions {
    public static String createAnAccount() {
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"firstname\"]", "Bie");

        typeIn("//*[@id=\"lastname\"]", "OFIJABibe");

        typeIn("//*[@id=\"email_address\"]", "qqqtfftrgd@hotmail.com");

        typeIn("//*[@id=\"password\"]", "Bibekkk4567!!");

        typeIn("//*[@id=\"password-confirmation\"]", "Bibekkk4567!!");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button/span");

        getText("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");


        return driver.getCurrentUrl();
    }

    public static String testFirstNameField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"firstname\"]", "");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button");

        return getText("//*[@id=\"firstname-error\"]");

    }

    public static String testLasNameField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"lastname\"]", "");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button");

        return getText("//*[@id=\"lastname-error\"]");
    }

    public static String testEmailField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"email_address\"]", "");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button");

        return getText("//*[@id=\"email_address-error\"]");
    }

    public static String testPasswordField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"password\"]", "");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button");

        return getText("//*[@id=\"password-error\"]");
    }

    public static String testConfirmPasswordField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"password-confirmation\"]", "");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button");

        return getText("//*[@id=\"password-confirmation-error\"]");
    }


}
