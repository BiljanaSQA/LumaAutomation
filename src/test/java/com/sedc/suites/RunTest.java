package com.sedc.suites;

import com.sedc.pages.CreateAccountPage;
import com.sedc.pages.CheckOutPage;
import com.sedc.pages.HomePage;
import com.sedc.pages.SignInPage;
import com.sedc.selenium.Interactions;
import com.sedc.selenium.SeleniumSetUp;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RunTest {
    @BeforeClass
    public void beforeClass(){
        SeleniumSetUp.SetUp();
    }

    @Test(description = "", priority = 1, enabled = true)
    public void testForVerifyingUserReachedHomePage(){
        Assert.assertEquals(Interactions.navigateTo("https://magento.softwaretestingboard.com/"), "https://magento.softwaretestingboard.com/");
    }
    @Test(description = "", priority = 2, enabled = true)
    public void testForVerifyingUserSuccessfullyCreatedAnAccount(){
        Assert.assertEquals(CreateAccountPage.createAnAccount(), "https://magento.softwaretestingboard.com/customer/account/logoutSuccess/");
    }

    @Test(description = "", priority = 3, enabled = true)
    public void testForVerifyingCreatingAccountWithoutFirstName(){
        Assert.assertEquals(CreateAccountPage.testFirstNameField(), "This is a required field.");
    }

    @Test(description = "", priority = 4, enabled = true)
    public void testForVerifyingCreatingAccountWithoutLastName(){
        Assert.assertEquals(CreateAccountPage.testLasNameField(), "This is a required field.");
    }

    @Test(description = "", priority = 5, enabled = true)
    public void testForVerifyingCreatingAccountWithoutEmail(){
        Assert.assertEquals(CreateAccountPage.testEmailField(), "This is a required field.");
    }

    @Test(description = "", priority = 6, enabled = true)
    public void testForVerifyingCreatingAccountWithoutPassword(){
        Assert.assertEquals(CreateAccountPage.testPasswordField(), "This is a required field.");
    }

    @Test(description = "", priority = 7, enabled = true)
    public void testForVerifyingCreatingAccountWithoutConfirmPassword(){
        Assert.assertEquals(CreateAccountPage.testConfirmPasswordField(), "This is a required field.");
    }

    @Test(description = "", priority = 8, enabled = true)
    public void testForVerifyingUserIsSuccessfullySignInWithValidUserNameAndPassword(){
        Assert.assertEquals(SignInPage.signInWithValidUserNameAndPassword(), "https://magento.softwaretestingboard.com/customer/account/logoutSuccess/");
    }
    @Test(description = "", priority = 9, enabled = true)
    public void testForVerifyingSignInWithNoUserName(){
        Assert.assertEquals(SignInPage.signInWithNoUserName(), "This is a required field.");
    }
    @Test(description = "", priority = 10, enabled = true)
    public void testForVerifyingSignInWithNoPassword(){
        Assert.assertEquals(SignInPage.signInWithNoPassword(), "This is a required field.");
    }
    @Test(description = "", priority = 11, enabled = true)
    public void testForVerifyingSignInWithDemoCustomerAccess(){
        Assert.assertEquals(SignInPage.signInWithDemoCustomerAccess(), "Incorrect CAPTCHA");
    }

    @Test(description = "", priority = 12, enabled = true)
    public void testForVerifyingUserIsSignInIntoHisAccount(){
        Assert.assertEquals(HomePage.signInWithExistingAccount(), "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
    }

    @Test(description = "", priority = 13, enabled = true)
    public void testForVerifyingSearchField(){
        Assert.assertEquals(HomePage.testSearchField(), "https://magento.softwaretestingboard.com/catalogsearch/result/?q=women");
    }

    @Test(description = "", priority = 14, enabled = true)
    public void testForVerifyingKeyWordSearches(){
        Assert.assertEquals(HomePage.testKeyWordSearches(), "Search results for: 'women pink t-shirt'");
    }

    @Test(description = "", priority = 15, enabled = true)
    public void testForVerifyingActionsOnPage(){
        Assert.assertEquals(HomePage.testSomeActionsOnPage(), "https://magento.softwaretestingboard.com/catalogsearch/result/index/?p=3&q=women++pink+t-shirt");
    }

    @Test(description = "", priority = 16, enabled = true)
    public void testForVerifyingSortItemByPriceInDescendingOrder(){
        Assert.assertEquals(HomePage.sortItemByPriceInDescendingOrder(), "https://magento.softwaretestingboard.com/catalogsearch/result/index/?p=3&q=women++pink+t-shirt&product_list_order=price");
    }

    @Test(description = "", priority = 17, enabled = true)
    public void testForVerifyingClickOnProduct(){
        Assert.assertEquals(HomePage.clickOnProduct(), "https://magento.softwaretestingboard.com/augusta-pullover-jacket.html");
    }

    @Test(description = "", priority = 18, enabled = true)
    public void testForVerifyingProductOneIsInTheBasket(){
        Assert.assertEquals(CheckOutPage.buyProductOne(), "https://magento.softwaretestingboard.com/nadia-elements-shell.html");
    }

    @Test(description = "", priority = 19, enabled = true)
    public void testForVerifyingProductTwoIsInTheBasket(){
        Assert.assertEquals(CheckOutPage.buyProductTwo(), "https://magento.softwaretestingboard.com/bella-tank.html");
    }

    @Test(description = "", priority = 20, enabled = true)
    public void testForVerifyingShoppingCardContainer(){
        Assert.assertEquals(CheckOutPage.shoppingCardContainer(), "https://magento.softwaretestingboard.com/checkout/cart/");
    }

    @Test(description = "", priority = 21, enabled = true)
    public void testForVerifyingProceedToCheckout(){
        Assert.assertEquals(CheckOutPage.proceedToCheckout(), "https://magento.softwaretestingboard.com/checkout/");
    }

    @Test(description = "", priority = 22, enabled = true)
    public void testForVerifyingFinishOrder(){
        Assert.assertEquals(CheckOutPage.finishOrder(), "Thank you for your purchase!");
    }



    @AfterClass
    public void afterClass(){
        SeleniumSetUp.end();
    }
}
