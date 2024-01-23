package com.sedc.pages;

import com.sedc.selenium.Interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class EndToEndClass extends Interactions {
    public static String createAnAccount2() {
        navigateTo("https://magento.softwaretestingboard.com/");

        clickOn("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");

        typeIn("//*[@id=\"firstname\"]", "BILJANA");

        typeIn("//*[@id=\"lastname\"]", "STOJANOVSKA");

        typeIn("//*[@id=\"email_address\"]", "gjHgjajffftdggg@hotmail.com");

        typeIn("//*[@id=\"password\"]", "Sotir123456789!!");

        typeIn("//*[@id=\"password-confirmation\"]", "Sotir123456789!!");

        clickOn("//*[@id=\"form-validate\"]/div/div[1]/button/span");

        return driver.getCurrentUrl();
    }
    public static String buyProduct1(){
        navigateTo("https://magento.softwaretestingboard.com/");
        clickOn("//*[@id=\"ui-id-4\"]/span[2]");
        clickOn("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a");
        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/div/strong/a");
        clickOn("//*[@id=\"option-label-size-143-item-166\"]");
        clickOn("//*[@id=\"option-label-color-93-item-60\"]");
        clickOn("//*[@id=\"product-addtocart-button\"]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.getCurrentUrl();

    }
    public static String buyProduct2(){
        navigateTo("https://magento.softwaretestingboard.com/nadia-elements-shell.html");
        clickOn("//*[@id=\"ui-id-4\"]/span[2]");
        clickOn("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[4]/a");
        clickOn("//*[@id=\"narrow-by-list\"]/div[5]/div[1]");
        clickOn("//*[@id=\"narrow-by-list\"]/div[5]/div[2]/ol/li[11]/a");
        clickOn("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[3]/div/div/strong/a");
        clickOn("//*[@id=\"option-label-size-143-item-166\"]");
        clickOn("//*[@id=\"option-label-color-93-item-50\"]");
        clickOn("//*[@id=\"product-addtocart-button\"]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.getCurrentUrl();

    }
    public static String shoppingCardContainer2(){
        navigateTo("https://magento.softwaretestingboard.com/bella-tank.html");
        clickElement("/html/body/div[1]/header/div[2]/div[1]/a");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        clickElement("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span");
        return driver.getCurrentUrl();
    }
    public static String proceedToCheckout2(){
        navigateTo("https://magento.softwaretestingboard.com/checkout/cart/");
        clickOn("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button");
        return driver.getCurrentUrl();
    }
    public static String finishOrder2(){
        navigateTo("https://magento.softwaretestingboard.com/checkout/#shipping");


        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]"))).sendKeys("Str.Jovanka No.3");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=city]"))).sendKeys("Skopje");
        new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[name=region_id]")))).selectByVisibleText("California");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=postcode]"))).sendKeys("12345-6789");
        new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("select[name=country_id]")))).selectByVisibleText("Bahrain");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name=telephone]"))).sendKeys("389 777 888 999");


        /*typeIn("//*[@id=\"XXVQPMJ\"]", "JUGOSLAVIJA DOO");
        typeIn("//*[@id=\"KB23R60\"]", "Str.Jovanka No.3");
        typeIn("//*[@id=\"GLJKXFI\"]", "building block 4");
        typeIn("//*[@id=\"FX18NWN\"]", "floor 4");
        typeIn("//*[@id=\"DSA48FN\"]", "Skopje");
        clickOn("//*[@id=\"CEO7HWH\"]/option[6]"); //Please select a region, state or province.
        typeIn("//*[@id=\"XS2A3KR\"]", "1000-1900");
        clickOn("//*[@id=\"OQY9QX9\"]/option[14]"); //Country
        typeIn("//*[@id=\"FHQYA5C\"]", "+389 777 888 999");*/

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input"); //Shipping Method
        clickOn("//*[@id=\"shipping-method-buttons-container\"]/div/button"); //next button
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickOn("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"); //place order button

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return getText("//*[@id=\"maincontent\"]/div[1]/h1/span"); //Thank you for your purchase! message
    }
}
