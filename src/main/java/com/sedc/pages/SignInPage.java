package com.sedc.pages;

import com.sedc.selenium.Interactions;

public class SignInPage extends Interactions {
    public static String signInWithValidUserNameAndPassword(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/a");

        typeIn("//*[@id=\"email\"]", "bibe_stojanovska@hotmail.com");

        typeIn("//*[@id=\"pass\"]", "bibe1234567!!");

        clickOn("//*[@id=\"send2\"]/span");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");

        return driver.getCurrentUrl();

    }



    public static String signInWithNoUserName(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/a");

        typeIn("//*[@id=\"pass\"]", "bibe1234567!!");


        clickOn("//*[@id=\"send2\"]/span");


        return getText("//*[@id=\"email-error\"]");

    }

    public static String signInWithNoPassword(){
        navigateTo("https://magento.softwaretestingboard.com/");
        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/a");

        typeIn("//*[@id=\"email\"]", "bibe_stojroj@hotmail.com");


        clickOn("//*[@id=\"send2\"]/span");


        return getText("//*[@id=\"pass-error\"]");

    }

    public static String signInWithDemoCustomerAccess(){
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[2]/a");

        typeIn("//*[@id=\"email\"]", "roni_cost@example.com");

        typeIn("//*[@id=\"pass\"]", "roni_cost3@example.com");

        clickOn("//*[@id=\"send2\"]/span");

        return getText("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    }
}
