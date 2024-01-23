package com.sedc.pages;

import com.sedc.selenium.Interactions;

public class HomePage extends Interactions {
    public static String signInWithExistingAccount(){
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

        return driver.getCurrentUrl();

    }

    public static String testSearchField(){
        navigateTo("https://magento.softwaretestingboard.com/");

        typeIn("//*[@id=\"search\"]", "women");
        clickOn("//*[@id=\"search_mini_form\"]/div[2]/button");

        return driver.getCurrentUrl();
    }

    public static String testKeyWordSearches(){
        navigateTo("https://magento.softwaretestingboard.com/catalogsearch/result/?q=women");

        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/dl/dd[1]/a");

        return getText("//*[@id=\"maincontent\"]/div[1]/h1/span");
    }

    public static String testSomeActionsOnPage(){
        navigateTo("https://magento.softwaretestingboard.com/catalogsearch/result/?q=women++pink+t-shirt");

        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/div[2]/ul/li[2]/a");

        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[3]/div[2]/ul/li[4]/a/span[2]");

        return driver.getCurrentUrl();
    }

    public static String sortItemByPriceInDescendingOrder() {
        navigateTo("https://magento.softwaretestingboard.com/catalogsearch/result/index/?p=3&q=women++pink+t-shirt&product_list_order=price");

        getText("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[1]/div[4]");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectByVisibleText("//*[@id=\"sorter\"]", "Price");


        return driver.getCurrentUrl();

    }

    public static String clickOnProduct(){

        navigateTo("https://magento.softwaretestingboard.com/catalogsearch/result/index/?p=3&q=women++pink+t-shirt&product_list_order=price");


        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[8]/div/div/strong/a");



        return driver.getCurrentUrl();
    }

}
