package com.sedc.suites;

import com.sedc.pages.CreateAccountPage;
import com.sedc.pages.EndToEndClass;
import com.sedc.selenium.Interactions;
import com.sedc.selenium.SeleniumSetUp;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndRunTest {
    @BeforeClass
    public void beforeClass(){
        SeleniumSetUp.SetUp();
    }
    @Test(description = "", priority = 1, enabled = true)
    public void testForVerifyingUserReachedHomePage(){
        Assert.assertEquals(Interactions.navigateTo("https://magento.softwaretestingboard.com/"), "https://magento.softwaretestingboard.com/");
    }
    @Test(description = "", priority = 2, enabled = true)
    public void testForVerifyingCreateAccount2(){
        Assert.assertEquals(EndToEndClass.createAnAccount2(), "https://magento.softwaretestingboard.com/customer/account/");
    }
    @Test(description = "", priority = 3, enabled = true)
    public void testForVerifyingProductOneInBasket(){
        Assert.assertEquals(EndToEndClass.buyProduct1(), "https://magento.softwaretestingboard.com/nadia-elements-shell.html");
    }
    @Test(description = "", priority = 4, enabled = true)
    public void testForVerifyingProductTwoInBasket(){
        Assert.assertEquals(EndToEndClass.buyProduct2(), "https://magento.softwaretestingboard.com/bella-tank.html");
    }
    @Test(description = "", priority = 5, enabled = true)
    public void testForVerifyingShoppingCardContainer2(){
        Assert.assertEquals(EndToEndClass.shoppingCardContainer2(), "https://magento.softwaretestingboard.com/checkout/cart/");
    }
    @Test(description = "", priority = 6, enabled = true)
    public void testForVerifyingProceedToCheckOut2(){
        Assert.assertEquals(EndToEndClass.proceedToCheckout2(), "https://magento.softwaretestingboard.com/checkout/");
    }
    @Test(description = "", priority = 7, enabled = true)
    public void testForVerifyingFinishOrder2(){
        Assert.assertEquals(EndToEndClass.finishOrder2(), "Thank you for your purchase!");
    }
    @AfterClass
    public void afterClass(){
        SeleniumSetUp.end();
    }
}
