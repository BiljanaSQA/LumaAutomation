package com.sedc.pages;

import com.sedc.selenium.Interactions;

public class CheckOutPage extends Interactions {
    public static String buyProductOne(){
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

    public static String buyProductTwo(){
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

    public static String shoppingCardContainer(){
        navigateTo("https://magento.softwaretestingboard.com/bella-tank.html");
        clickElement("/html/body/div[1]/header/div[2]/div[1]/a");

        clickElement("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a/span");
        return driver.getCurrentUrl();
    }

    public static String proceedToCheckout(){
        navigateTo("https://magento.softwaretestingboard.com/checkout/cart/");
        clickOn("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button");
        return driver.getCurrentUrl();
    }

    public static String finishOrder(){
        navigateTo("https://magento.softwaretestingboard.com/checkout/#shipping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        typeIn("//*[@id=\"customer-email\"]","bibe_stojanovska@hotmail.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        typeIn("//*[@id=\"customer-password\"]","bibe1234567!!");
        clickOn("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button");

        clickElement("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input");
        clickOn("//*[@id=\"shipping-method-buttons-container\"]/div/button");
        clickOn("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button");
        return getText("//*[@id=\"maincontent\"]/div[1]/h1/span");
    }

}
